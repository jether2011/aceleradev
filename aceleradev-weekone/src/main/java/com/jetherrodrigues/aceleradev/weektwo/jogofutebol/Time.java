package com.jetherrodrigues.aceleradev.weektwo.jogofutebol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 
 * @author jether.rodrigues
 *
 */
public final class Time implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private List<Jogador> jogadores = new ArrayList<Jogador>();

	public Time(String nome) {
		super();
		this.nome = Objects.requireNonNull(nome);
	}

	public void adicionarJogador(Jogador jogador) {
		if (this.jogadores.size() > 22) {
			throw new TimeCompletoException("Número de jogadores de um time excedido.");
		}
		this.jogadores.add(Objects.requireNonNull(jogador));
	}

	public String getNome() {
		return nome;
	}

	public List<Jogador> getJogadores() {
		return Collections.unmodifiableList(this.jogadores);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Time [nome=").append(nome).append(", jogadores=").append(jogadores).append("]");
		return builder.toString();
	}

	public Jogador retornaArtilheiroDoTime() {
		return this.jogadores.stream()
				.filter(j -> j.retornaSomaGoals() > 0)
				.sorted(Comparator.comparing(Jogador::retornaSomaGoals).reversed())
				.limit(1)
				.findAny().get();
	}
	
	public List<Jogador> retornaListaJogadoresPorArtilharia() {
		return this.jogadores.stream()
				.filter(j -> j.retornaSomaGoals() >= 0)
				.sorted(Comparator.comparing(Jogador::retornaSomaGoals).reversed())
				.collect(Collectors.toList());
	}
	
}
