package com.jetherrodrigues.aceleradev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class AppList {
	private static List<Integer> pares = new ArrayList<Integer>();
	private static List<Integer> impares = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		/**
		 * List of fruits
		 */
		List<String> frutas = new ArrayList<>();
		frutas.add("Banana");
		frutas.add("Melancia");
		frutas.add("Melancia");
		frutas.add("Melao");
		frutas.add("Morango");
		
		System.out.println(frutas.indexOf("Melao"));
		
		/**
		 * Set of products
		 */
		Set<String> produtos = new HashSet<>();
		produtos.add("Caneta");
		produtos.add("Caneta");
		produtos.add("Notebook");
		produtos.add("Mesa");
		produtos.add("Caneca");
		
		/**
		 * print fruits
		 */
		System.out.println(">> Frutas: ");
		for (String string : frutas) {
			System.out.println(string);
		}
		System.out.println();
		
		/**
		 * print products
		 */
		System.out.println(">> Produtos: ");
		for (String string : produtos) {
			System.out.println(string);
		}
		
		/**
		 * pares e impares
		 */
		AppList.preencheListasImparesEPares(1000);
		System.out.println(pares);
		System.out.println(impares);
		
		/**
		 * simple list
		 */
		AppList.createSimpleList(1000);
	}
	
	/**
	 * cria uma lista simples
	 * @param tam
	 */
	private static void createSimpleList(int tam) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int j = 0; j < tam; j++) {
			lista.add(j);
		}
		System.out.println(lista);
	}

	/**
	 * preenche lista com pares e ímpares
	 * @param tam
	 */
	private static void preencheListasImparesEPares(int tam) {
		for (int i = 0; i < tam; i++) {
			if(i % 2 == 0) {
				pares.add(i);
			}
			else {
				impares.add(i);
			}
		}
	}
}
