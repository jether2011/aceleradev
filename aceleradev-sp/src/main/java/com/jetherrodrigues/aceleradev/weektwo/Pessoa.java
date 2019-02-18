package com.jetherrodrigues.aceleradev.weektwo;

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
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static class Builder {
		private String nome;

		public Builder adicionarNome(String nome) {
			this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo.");
			return this;
		}

		public Pessoa build() {
			return new Pessoa(this.nome);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("Pessoa [nome=").append(nome).append("]");
		return builder2.toString();
	}
}
