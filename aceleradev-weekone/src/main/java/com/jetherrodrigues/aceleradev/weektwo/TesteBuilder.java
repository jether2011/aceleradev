package com.jetherrodrigues.aceleradev.weektwo;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TesteBuilder {

	public static void main(String[] args) {
		System.out.println(
				new Pessoa.Builder().adicionarNome("Jether Rois.").build()
		);
	}

}
