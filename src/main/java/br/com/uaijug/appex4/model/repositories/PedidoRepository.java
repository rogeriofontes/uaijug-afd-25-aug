package br.com.uaijug.appex4.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uaijug.appex4.model.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	Optional<Pedido> findByTitulo(String titulo);
}
