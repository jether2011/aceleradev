package com.jetherrodrigues.aceleradev;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cidade;
	private Integer idade;
	
	public Pessoa(String nome, String cidade, Integer idade) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.idade = idade;
	}

	protected void andar() {
		
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=").append(nome).append(", cidade=").append(cidade).append(", idade=").append(idade).append("]");
		return builder.toString();
	}
	
}
