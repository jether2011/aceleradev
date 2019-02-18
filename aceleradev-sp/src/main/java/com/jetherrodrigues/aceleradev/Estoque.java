package com.jetherrodrigues.aceleradev;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Estoque implements Serializable {

	private static final long serialVersionUID = 1L;
	private Map<Produto, Integer> produtos = new HashMap<Produto, Integer>();

	public Map<Produto, Integer> getProdutos() {
		return Collections.unmodifiableMap(produtos);
	}
	
	public Estoque addProduto(Produto produto, int qtdEstoque) {
		this.produtos.put(produto, qtdEstoque);
		return this;
	}

	public void consomeProduto(String produto, int qtd) {
		final Produto encontrado = this.getProduto(produto);
		final int estoqueAtual = this.produtos.get(encontrado);
		this.produtos.merge(encontrado, estoqueAtual, (k,v) -> v - qtd);
	}

	public int qualQuantidade(String produto) {
		return this.produtos
			.entrySet().stream()
			.filter(p -> 
				produto.equals(
					p.getKey().getProduto()
				)).mapToInt(m -> m.getValue()).sum();
	}
	
	public Produto buscarProdutoPorNome(String paraBuscar) {
		return this.getProduto(paraBuscar);
	}
	
	private Produto getProduto(String paraBuscar) {
		return this.produtos
				.entrySet().stream()
				.filter(p -> paraBuscar.equals(p.getKey().getProduto()))
				.map(p -> p)
				.findAny().get().getKey();
	}
	
	@Override
	public String toString() {
		return this.produtos.toString();
	}
}
