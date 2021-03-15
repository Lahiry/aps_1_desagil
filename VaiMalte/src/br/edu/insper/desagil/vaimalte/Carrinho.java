package br.edu.insper.desagil.vaimalte;

import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho(List<Pedido> pedidos) {
		super();
		this.pedidos = pedidos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
}
