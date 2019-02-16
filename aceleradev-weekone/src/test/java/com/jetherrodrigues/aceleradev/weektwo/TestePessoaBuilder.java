package com.jetherrodrigues.aceleradev.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestePessoaBuilder {
    
	@Test
	public void testarSePessoaTemNomeNaCriacao() {
    	Executable pessoaBuilderExecutable = () -> new Pessoa.Builder().adicionarNome(null).build();
    	Assertions.assertThrows(NullPointerException.class, pessoaBuilderExecutable);
    }
	
	@Test
	public void testarIgualdadeNome() {
		Pessoa pessoa = new Pessoa.Builder().adicionarNome("Jether Rois.").build();
		Assertions.assertEquals("Jether Rois.", pessoa.getNome());
	}
}
