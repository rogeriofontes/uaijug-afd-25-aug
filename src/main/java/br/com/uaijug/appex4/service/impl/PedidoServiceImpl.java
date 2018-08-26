package br.com.uaijug.appex4.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.uaijug.appex4.model.domain.Pedido;
import br.com.uaijug.appex4.model.repositories.PedidoRepository;
import br.com.uaijug.appex4.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public Pedido save(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	@Override
	public List<Pedido> listAll() {
		return pedidoRepository.findAll();
	}

	@Override
	public Pedido update(Long id, Pedido pedido) {
		pedido.setId(id);
		return pedidoRepository.save(pedido);
	}

	@Override
	public Optional<Pedido> findById(Long id) {
		return pedidoRepository.findById(id);
	}

	@Override
	public void remove(Long id) {
		pedidoRepository.deleteById(id);
	}

	@Override
	public Optional<Pedido> findByTitulo(String titulo) {
		return pedidoRepository.findByTitulo(titulo);
	}

	@Override
	public Page<Pedido> findAllPageable(Pageable pageable) {
		return pedidoRepository.findAll(pageable);
	}

}
