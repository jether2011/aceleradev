package com.jetherrodrigues.aceleradev;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class AppOO2 {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		estoque
			.addProduto(new Produto("Banana", 1.99), 3)
			.addProduto(new Produto("Melao", 2.99), 5)
			.addProduto(new Produto("Coca-Cola", 3.99), 10)
			.addProduto(new Produto("Cerveja", 4.99), 20)
			.addProduto(new Produto("Vinho", 11.99), 1);
		
		System.out.println(estoque.buscarProdutoPorNome("Vinho"));
		
		System.out.println(estoque.qualQuantidade("Banana"));
		System.out.println(estoque);
		
		estoque.consomeProduto("Banana", 2);
		System.out.println(estoque.qualQuantidade("Banana"));
		System.out.println(estoque);
		
		estoque.consomeProduto("Coca-Cola", 7);
		System.out.println(estoque.qualQuantidade("Coca-Cola"));
		System.out.println(estoque);
	}
}
