package com.jetherrodrigues.aceleradev.weektwo.jogofutebol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

	public static final Time of(String nome) {
		Time time = new Time();
		time.nome = Objects.requireNonNull(nome, "O nome do Time é obrigatório.");
		return time;
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
		Comparator<Jogador> artilheiro = Comparator.comparing(Jogador::retornaSomaGoals);
		
		return this.jogadores.stream()
				.filter(j -> j.retornaSomaGoals() > 0)
				.max(artilheiro)
				.orElseThrow(() -> new IllegalStateException("Não foi possivel retornar artilheiro."));
	}

	public List<Jogador> retornaListaJogadoresOrdenadoPorArtilharia() {
		return this.jogadores.stream().filter(j -> j.retornaSomaGoals() > 0)
				.sorted(Comparator.comparing(Jogador::retornaSomaGoals).reversed()).collect(Collectors.toList());
	}

	public Map<Posicao, List<Jogador>> retornaMapaPorPosicao() {
		return jogadores.stream().collect(Collectors.groupingBy(Jogador::getPosicao));
	};
}
