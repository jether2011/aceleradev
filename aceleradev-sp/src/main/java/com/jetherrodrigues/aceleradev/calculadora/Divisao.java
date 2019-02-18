package com.jetherrodrigues.aceleradev.calculadora;

public class Divisao implements Operacao {

	@Override
	public int executa(int a, int b) {
		if (b == 0) throw new DivizaoPorZeroException(String.format("O valor de B não pode ser ZERO. Valor atual: %d", b));
		return a / b;
	}

}
