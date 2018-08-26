package br.com.uaijug.appex4.web.resources;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
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

import br.com.uaijug.appex4.model.domain.Pedido;
import br.com.uaijug.appex4.service.PedidoService;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoResources {

	@Autowired
	private PedidoService service;
	
	@Autowired
   	private ConversionService conversionService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<Pedido>> getAll() {
		List<Pedido> pedidos = service.listAll();
		return new ResponseEntity<>(pedidos, HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Pedido> add(@Valid @RequestBody Pedido pedido) {
		//Pedido p = conversionService.convert(pedido, Pedido.class);
		Pedido result = service.save(pedido);
		return new ResponseEntity<Pedido>(result, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Pedido> change(@PathVariable Long id, @RequestBody Pedido pedido) {
		Pedido result = service.update(id, pedido);
		return new ResponseEntity<Pedido>(result, HttpStatus.OK);
	}

	@DeleteMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> remove(@PathVariable Long id) {
		service.remove(id);
		return new ResponseEntity<>("Dados Deletados!", HttpStatus.OK);
	}

	@GetMapping(path = "/{titulo}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Pedido> getUserByUsername(@PathVariable("titulo") String titulo) {
		Optional<Pedido> pedido = service.findByTitulo(titulo);

		return new ResponseEntity<Pedido>(pedido.get(), HttpStatus.OK);
	}

}
