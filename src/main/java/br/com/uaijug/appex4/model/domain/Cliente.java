package br.com.uaijug.appex4.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends IDEntity {
	private static final long serialVersionUID = 8556718870416500008L;

	@NotNull
	@NotEmpty(message = "vc digitou errado")
	@Column(name = "nm_nome")
	private String nome;

	@Column(name = "ix_email")
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
