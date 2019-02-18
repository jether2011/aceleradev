package com.jetherrodrigues.aceleradev.weektwo.jogofutebol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @author jether.rodrigues
 *
 */
public final class Jogador extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private final String cidade;
	private final String pais;
	private final Posicao posicao;
	private final List<Integer> goals = new ArrayList<Integer>();
	
	public Jogador(String nome, Posicao posicao, String cidade, String pais) {
		super(nome);
		this.posicao = Objects.requireNonNull(posicao);
		this.cidade = Objects.requireNonNull(cidade);
		this.pais = Objects.requireNonNull(pais);
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public String getCidade() {
		return cidade;
	}

	public String getPais() {
		return pais;
	}

	public List<Integer> getGoals() {
		return Collections.unmodifiableList(this.goals);
	}

	public Jogador adicionarGoal(int goal) {
		this.goals.add(goal);
		return this;
	}
	
	public int retornaSomaGoals() {
		return this.goals.stream().mapToInt(g -> g).sum();
	}
	
	public static class Builder {
		private String nome;
		private String cidade;
		private String pais;
		private Posicao posicao;
		
		public Builder usandoNome(String nome) {
			this.nome = Objects.requireNonNull(nome);
			return this;
		}
		
		public Builder daCidade(String cidade) {
			this.cidade = Objects.requireNonNull(cidade);
			return this;
		}
		
		public Builder doPais(String pais) {
			this.pais = Objects.requireNonNull(pais);
			return this;
		}
		
		public Builder naPosicao(Posicao posicao) {
			this.posicao = Objects.requireNonNull(posicao);
			return this;
		}
		
		public Jogador build() {
			return new Jogador(this.nome, this.posicao, this.cidade, this.pais);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogador [nome=").append(super.getNome()).append(", posicao=").append(posicao).append(", artilharia=")
				.append(goals).append("]");
		return builder.toString();
	}
}
