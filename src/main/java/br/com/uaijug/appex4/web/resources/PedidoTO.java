package br.com.uaijug.appex4.web.resources;

import java.util.Set;

import br.com.uaijug.appex4.model.domain.Cliente;
import br.com.uaijug.appex4.model.domain.Produto;

public class PedidoTO {
	private String titulo;
	private Cliente cliente;
	private Set<Produto> produtos;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

}
