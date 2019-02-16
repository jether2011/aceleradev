package com.jetherrodrigues.aceleradev.weektwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.function.Executable;

import com.jetherrodrigues.aceleradev.weektwo.jogofutebol.Jogador;
import com.jetherrodrigues.aceleradev.weektwo.jogofutebol.Posicao;
import com.jetherrodrigues.aceleradev.weektwo.jogofutebol.Time;

/**
 * 
 * @author jether.rodrigues
 *
 */
@TestInstance(value = Lifecycle.PER_CLASS)
public class TesteTime {

	private final Map<String, Time> times = new HashMap<>();
	
	@BeforeAll
	public void setup() {
		List<Jogador> jogadoresSPFC = Arrays.asList(
				new Jogador.Builder().usandoNome("Jether").naPosicao(Posicao.ATACANTE).daCidade("Lorena").doPais("Brasil").build().adicionarGoal(5),
				new Jogador.Builder().usandoNome("Denise").naPosicao(Posicao.ZAGUEIRO).daCidade("São José dos Campos").doPais("Brasil").build(),
				new Jogador.Builder().usandoNome("Bia").naPosicao(Posicao.GOLEIRO).daCidade("Canas").doPais("Brasil").build(),
				new Jogador.Builder().usandoNome("Isa").naPosicao(Posicao.LATERAL_ESQUERDA).daCidade("Taubaté").doPais("Brasil").build().adicionarGoal(6)
		);
		
		List<Jogador> jogadoresPFC = Arrays.asList(
				new Jogador.Builder().usandoNome("Eliabe").naPosicao(Posicao.ATACANTE).daCidade("Lorena").doPais("Brasil").build().adicionarGoal(2),
				new Jogador.Builder().usandoNome("Abner").naPosicao(Posicao.ZAGUEIRO).daCidade("São José dos Campos").doPais("Brasil").build(),
				new Jogador.Builder().usandoNome("Suellen").naPosicao(Posicao.GOLEIRO).daCidade("Canas").doPais("Brasil").build().adicionarGoal(1),
				new Jogador.Builder().usandoNome("Ana Mel").naPosicao(Posicao.LATERAL_ESQUERDA).daCidade("Taubaté").doPais("Brasil").build()
		);
		
		Time spfc = new Time("São Paulo Futebol Clube");
		Time pfc = new Time("Palmeiras Futebol Clube");
		
		jogadoresSPFC.forEach(j -> {
			spfc.adicionarJogador(j);
		});
		
		jogadoresPFC.forEach(j -> {
			pfc.adicionarJogador(j);
		});
		
		times.put("PFC", pfc);
		times.put("SPFC", spfc);
	}
	
	@Test
	public void qualArtilheiroDoTimeSpfc() {
		final Time spfc = times.get("SPFC");
		final String artilheiroEsperado = "Isa";
		final String artilheiroRetornado = spfc.retornaArtilheiroDoTime().getNome();
		
		Assertions.assertEquals(artilheiroEsperado, artilheiroRetornado);
	}
	
	@Test
	public void qualArtilheiroDoTimePfc() {
		final Time spfc = times.get("PFC");
		final String artilheiroEsperado = "Eliabe";
		final String artilheiroRetornado = spfc.retornaArtilheiroDoTime().getNome();
		
		Assertions.assertEquals(artilheiroEsperado, artilheiroRetornado);
	}
	
	@Test
	public void criandoTimeComNomeNull() {
		Executable timeExecutable = () -> new Time(null);
    	Assertions.assertThrows(NullPointerException.class, timeExecutable);
	}
	
	@Test
	public void tentandoAlterarUmaListaImutable() {
		Executable timeExecutable = () -> times.get("PFC").getJogadores().clear();
    	Assertions.assertThrows(UnsupportedOperationException.class, timeExecutable);
	}
}
