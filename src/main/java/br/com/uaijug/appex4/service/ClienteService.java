package br.com.uaijug.appex4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.uaijug.appex4.model.domain.Cliente;

public interface ClienteService {
	Cliente save(Cliente cliente);

	List<Cliente> listAll();

	Cliente update(Long id, Cliente cliente);

	Optional<Cliente> findById(Long id);

	void remove(Long id);

	Optional<Cliente> findByName(String name);

	Page<Cliente> findAllPageable(Pageable pageable);
}
