package br.com.uaijug.appex4.model.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido extends IDEntity {
	private static final long serialVersionUID = 3867832114047209394L;

	private String titulo;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@ManyToMany
	@JoinTable(name = "item_pedido", joinColumns = @JoinColumn(name = "id_pedido", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_produto", referencedColumnName = "id"))
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

	@Override
	public String toString() {
		return "Pedido [titulo=" + titulo + ", cliente=" + cliente + ", produtos=" + produtos + "]";
	}

}
