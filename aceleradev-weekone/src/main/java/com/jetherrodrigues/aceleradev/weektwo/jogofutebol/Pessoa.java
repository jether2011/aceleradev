package com.jetherrodrigues.aceleradev.weektwo.jogofutebol;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;

	public Pessoa(String nome) {
		super();
		this.nome = Objects.requireNonNull(nome);
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=").append(nome).append("]");
		return builder.toString();
	}
}
