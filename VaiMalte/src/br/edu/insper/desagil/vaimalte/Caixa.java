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
		if ((desconto >= 1) && (desconto <= 99)) {
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double totalCompra(Carrinho carrinho) {
		double precos = 0.0;
		double desconto_total = 0.0;
		for (Pedido pedido: carrinho.getPedidos()) {
			double desconto = descontos.get(pedido.getProduto().getCodigo());
			desconto_total = desconto_total + (pedido.precoPedido() * (desconto/100));
			precos = precos + pedido.precoPedido();
		}
		double total = precos - desconto_total;
		return total;
	}
}