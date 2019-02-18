package com.jetherrodrigues.aceleradev.calculadora;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Calculadora {
	public int calcula(int a, int b, Operacao operacao) {
		return operacao.executa(a, b);
	}
}
