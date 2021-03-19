package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public void incrementaQuantidade() {
		this.quantidade = this.quantidade + 1;
	}
	
	public double precoPedido() {
		return this.produto.getPreco() * this.quantidade;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
	
}
