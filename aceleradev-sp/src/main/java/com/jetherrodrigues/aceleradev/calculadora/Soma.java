package com.jetherrodrigues.aceleradev.calculadora;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Soma implements Operacao {

	@Override
	public int executa(int a, int b) {
		return a + b;
	}
}
