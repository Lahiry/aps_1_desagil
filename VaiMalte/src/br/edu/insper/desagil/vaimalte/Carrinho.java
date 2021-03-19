package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> listaPedidos;

	public Carrinho() {
		super();
		this.listaPedidos = new ArrayList<>();
		
	}

	public List<Pedido> getPedidos() { 
		return this.listaPedidos;
	}
	
	public void adicionaProduto(Produto produto) {
		boolean novoProduto = true;
		for (Pedido pedido: this.listaPedidos) {
			if (pedido.getProduto().equals(produto)) {
				pedido.incrementaQuantidade();
				novoProduto = false;
			}
		}
		if (novoProduto) {
			Pedido novoPedido = new Pedido(produto);
			this.listaPedidos.add(novoPedido);
		}
	}
}
