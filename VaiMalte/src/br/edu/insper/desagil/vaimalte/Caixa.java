package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> descontos;

	public Caixa() {
		super();
		this.descontos = new HashMap<>();
	}
	
	public void insereDesconto(Produto produto, int desconto) {
		if ((desconto >= 1) & (desconto <= 99)) {
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double totalCompra(Carrinho carrinho) {
		double total = 0.0;
		for (Pedido pedido: carrinho.getPedidos()) {
			double desconto = descontos.get(pedido.getProduto().getCodigo());
			total = total + ((pedido.getProduto().getPreco() * pedido.getQuantidade()) * (desconto/100));
		}
		return total;
	}
	
}
