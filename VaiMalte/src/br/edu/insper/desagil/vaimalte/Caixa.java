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
		double total = 0.0;
		for (Pedido pedido: carrinho.getPedidos()) {
			if (this.descontos.containsKey(pedido.getProduto().getCodigo())) {
				double desconto = descontos.get(pedido.getProduto().getCodigo());
				total = total + (pedido.precoPedido() * (1 - (desconto/100)));
			}
			else {
				total = total + pedido.precoPedido();
			}
		}
		total = Math.round(total * 100.0) / 100.0; //Arredondamento para duas casas decimais		
		return total;
	}
	
}