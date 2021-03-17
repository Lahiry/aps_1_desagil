package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
		
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void recebeProduto(Produto produto) {
		if (pedidos.contains(produto)) {
			this.pedidos.get(produto);
		}
	}
	
}
