package br.com.uaijug.appex4.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.uaijug.appex4.model.domain.Cliente;
import br.com.uaijug.appex4.model.repositories.ClienteRepository;
import br.com.uaijug.appex4.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> listAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente update(Long id, Cliente cliente) {
		cliente.setId(id);
		return clienteRepository.save(cliente);
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return clienteRepository.findById(id);
	}

	@Override
	public void remove(Long id) {
		clienteRepository.deleteById(id);
	}

	@Override
	public Optional<Cliente> findByName(String name) {
		return clienteRepository.findByNome(name);
	}

	@Override
	public Page<Cliente> findAllPageable(Pageable pageable) {
		return clienteRepository.findAll(pageable);
	}

}
