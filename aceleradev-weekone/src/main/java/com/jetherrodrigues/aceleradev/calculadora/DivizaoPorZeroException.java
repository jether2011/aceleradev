package com.jetherrodrigues.aceleradev.calculadora;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class DivizaoPorZeroException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DivizaoPorZeroException(String message) {
		super(message);
	}
}
