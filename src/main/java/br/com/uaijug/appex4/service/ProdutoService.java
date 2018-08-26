package br.com.uaijug.appex4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.uaijug.appex4.model.domain.Produto;
import br.com.uaijug.appex4.model.domain.Produto;

public interface ProdutoService {
	Produto save(Produto produto);

	List<Produto> listAll();

	Produto update(Long id, Produto produto);

	Optional<Produto> findById(Long id);

	void remove(Long id);

	Optional<Produto> findByName(String name);

	Page<Produto> findAllPageable(Pageable pageable);
}
