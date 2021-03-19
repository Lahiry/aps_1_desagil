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
	
	public void adicionaProduto(Produto produto) {
		if (this.pedidos.isEmpty() == false) {
			for (Pedido pedido: this.pedidos) {
				if (pedido.getProduto() == produto) {
					pedido.incrementaQuantidade();
				}
			}		
		}
		else {
			Pedido novo_pedido = new Pedido(produto);
			this.pedidos.add(novo_pedido);
		}
	}
	
}
