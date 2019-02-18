package com.jetherrodrigues.aceleradev;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author jether.rodrigues
 *
 */
public final class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	private final String produto;
	private double valor;

	public Produto(String produto, double valor) {
		super();
		this.produto = produto;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(produto, other.produto);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [produto=").append(produto).append(", valor=").append(valor).append("]");
		return builder.toString();
	}
	
}
