package br.com.uaijug.appex4.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.uaijug.appex4.model.domain.Produto;
import br.com.uaijug.appex4.model.repositories.ProdutoRepository;
import br.com.uaijug.appex4.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public List<Produto> listAll() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto update(Long id, Produto produto) {
		produto.setId(id);
		return produtoRepository.save(produto);
	}

	@Override
	public Optional<Produto> findById(Long id) {
		return produtoRepository.findById(id);
	}

	@Override
	public void remove(Long id) {
		produtoRepository.deleteById(id);
	}

	@Override
	public Optional<Produto> findByName(String name) {
		return produtoRepository.findByNome(name);
	}

	@Override
	public Page<Produto> findAllPageable(Pageable pageable) {
		return produtoRepository.findAll(pageable);
	}

}
