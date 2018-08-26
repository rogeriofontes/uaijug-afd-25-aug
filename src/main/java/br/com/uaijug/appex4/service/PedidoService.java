package br.com.uaijug.appex4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.uaijug.appex4.model.domain.Pedido;

public interface PedidoService {
	Pedido save(Pedido pedido);

	List<Pedido> listAll();

	Pedido update(Long id, Pedido pedido);

	Optional<Pedido> findById(Long id);

	void remove(Long id);

	Optional<Pedido> findByTitulo(String titulo);

	Page<Pedido> findAllPageable(Pageable pageable);
}
