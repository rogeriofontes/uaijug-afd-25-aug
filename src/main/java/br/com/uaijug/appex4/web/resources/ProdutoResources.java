package br.com.uaijug.appex4.web.resources;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.uaijug.appex4.model.domain.Produto;
import br.com.uaijug.appex4.service.ProdutoService;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoResources {

	@Autowired
	private ProdutoService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<Produto>> getAll() {
		List<Produto> produtos = service.listAll();
		return new ResponseEntity<>(produtos, HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Produto> add(@Valid @RequestBody Produto produto) {
		Produto result = service.save(produto);
		return new ResponseEntity<Produto>(result, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Produto> change(@PathVariable Long id, @RequestBody Produto produto) {
		Produto result = service.update(id, produto);
		return new ResponseEntity<Produto>(result, HttpStatus.OK);
	}

	@DeleteMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> remove(@PathVariable Long id) {
		service.remove(id);
		return new ResponseEntity<>("Dados Deletados!", HttpStatus.OK);
	}

	@GetMapping(path = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Produto> getUserByUsername(@PathVariable("name") String name) {
		Optional<Produto> produto = service.findByName(name);

		return new ResponseEntity<Produto>(produto.get(), HttpStatus.OK);
	}

}
