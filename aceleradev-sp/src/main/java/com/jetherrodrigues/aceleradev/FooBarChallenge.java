package com.jetherrodrigues.aceleradev;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class FooBarChallenge {

	public static void main(String[] args) {
		FooBarChallenge.executarDesafioFooBar(20);
		System.out.println("Inverso:");
		FooBarChallenge.executarDesafioFooBarInverso(20);
	}

	private static void executarDesafioFooBar(int tam) {
		for (int i = 0; i < tam; i++) {
			
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + "- foo bar");
			}
			else if (i % 5 == 0) {
				System.out.println(i + "- bar");
			} 
			else if (i % 3 == 0) {
				System.out.println(i + "- foo");
			}
			
		}
	}
	
	private static void executarDesafioFooBarInverso(int tam) {
		for (int i = tam; i > 0; i--) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + "- foo bar");
			}
			else if (i % 5 == 0) {
				System.out.println(i + "- bar");
			} 
			else if (i % 3 == 0) {
				System.out.println(i + "- foo");
			}
		}
	}
}
