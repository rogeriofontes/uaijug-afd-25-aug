package br.com.uaijug.appex4.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uaijug.appex4.model.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Optional<Produto> findByNome(String nome);
}
