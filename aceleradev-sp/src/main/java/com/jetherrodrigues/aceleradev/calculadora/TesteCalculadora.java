package com.jetherrodrigues.aceleradev.calculadora;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.calcula(2, 2, new Soma()));
		System.out.println(calculadora.calcula(2, 2, (a, b) -> a + b));
		System.out.println(calculadora.calcula(2, 2, new Subtracao()));
		System.out.println(calculadora.calcula(2, 2, new Multiplicacao()));
		System.out.println(calculadora.calcula(2, 2, new Divisao()));
		System.out.println(calculadora.calcula(2, 0, new Divisao()));
	}

}
