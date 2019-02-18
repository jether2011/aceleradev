package com.jetherrodrigues.aceleradev.weektwo.jogofutebol;

import java.util.Arrays;
import java.util.List;

public class TesteTime {

	public static void main(String[] args) {
		/**
		 * São Paulo
		 */
		List<Jogador> jogadoresSPFC = Arrays.asList(
				new Jogador.Builder().usandoNome("Jether").naPosicao(Posicao.ATACANTE).daCidade("Lorena").doPais("Brasil").build().adicionarGoal(5),
				new Jogador.Builder().usandoNome("Denise").naPosicao(Posicao.ZAGUEIRO).daCidade("São José dos Campos").doPais("Brasil").build(),
				new Jogador.Builder().usandoNome("Bia").naPosicao(Posicao.GOLEIRO).daCidade("Canas").doPais("Brasil").build(),
				new Jogador.Builder().usandoNome("Isa").naPosicao(Posicao.LATERAL_ESQUERDA).daCidade("Taubaté").doPais("Brasil").build().adicionarGoal(6)
		);
		
		/**
		 * Palmeiras
		 */
		List<Jogador> jogadoresPFC = Arrays.asList(
				new Jogador.Builder().usandoNome("Eliabe").naPosicao(Posicao.ATACANTE).daCidade("Lorena").doPais("Brasil").build().adicionarGoal(2),
				new Jogador.Builder().usandoNome("Abner").naPosicao(Posicao.ZAGUEIRO).daCidade("São José dos Campos").doPais("Brasil").build(),
				new Jogador.Builder().usandoNome("Suellen").naPosicao(Posicao.GOLEIRO).daCidade("Canas").doPais("Brasil").build().adicionarGoal(1),
				new Jogador.Builder().usandoNome("Ana Mel").naPosicao(Posicao.LATERAL_ESQUERDA).daCidade("Taubaté").doPais("Brasil").build()
		);
		
		/**
		 * Times
		 */
		Time spfc = Time.of("São Paulo Futebol Clube");
		Time pfc = Time.of("Palmeiras Futebol Clube");
		
		jogadoresSPFC.forEach(j -> {
			spfc.adicionarJogador(j);
		});
		
		jogadoresPFC.forEach(j -> {
			pfc.adicionarJogador(j);
		});
		
		System.out.println(spfc);
		System.out.println(pfc);
	}
}
