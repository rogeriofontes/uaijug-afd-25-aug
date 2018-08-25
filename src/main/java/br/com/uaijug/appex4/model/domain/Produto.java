package br.com.uaijug.appex4.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto extends IDEntity {
	private static final long serialVersionUID = 6586650493926541985L;

	private Float preco;

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

}
