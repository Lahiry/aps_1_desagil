package br.edu.insper.desagil.vaimalte;

public class Testador {
	
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto = new Produto(0,"",0.0);
		
		Pedido pedido = new Pedido(produto);
		carrinho.adicionaProduto(produto);
		
		Caixa caixa = new Caixa();
		caixa.totalCompra(carrinho);
		
		if (caixa.totalCompra(carrinho) == 0.0) {
			return true;
		}
	    return false;
	}

	
	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto = new Produto(153, "Bolinho Ana Maria", 7.00);
		
		Pedido pedido = new Pedido(produto);
		carrinho.adicionaProduto(produto);
		
		Caixa caixa = new Caixa();
		
		if (caixa.totalCompra(carrinho) == 7.00) {
			return true;
		}
	    return false;
	}

	
	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto = new Produto(153, "Bolinho Ana Maria", 7.00);
		
		Pedido pedido = new Pedido(produto);
		carrinho.adicionaProduto(produto);
		
		Caixa caixa = new Caixa();
		caixa.insereDesconto(produto, 50);
		
		
		if (caixa.totalCompra(carrinho) == 3.5) {
			return true;
		}
	    return false;
	}

	
	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto = new Produto(153, "Bolinho Ana Maria", 7.00);
		
		Pedido pedido = new Pedido(produto);
		carrinho.adicionaProduto(produto);
		
		Caixa caixa = new Caixa();
		caixa.totalCompra(carrinho);
		
		if (caixa.totalCompra(carrinho) == 0.0) {
			return true;
		}
	    return false;
	}

	
	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto1 = new Produto(153, "Bolinho Ana Maria", 7.00);
		Produto produto2 = new Produto(351, "Sucrilhos Kellogs", 10.00);
		
		
		Pedido pedido1 = new Pedido(produto1);
		pedido1.incrementaQuantidade();
		Pedido pedido2 = new Pedido(produto2);
		
		
		carrinho.adicionaProduto(produto1);
		carrinho.adicionaProduto(produto2);
		
		Caixa caixa = new Caixa();
		caixa.insereDesconto(produto1, 50);
		
		
		if (caixa.totalCompra(carrinho) == 17.0) {
			return true;
		}
	    return false;
	}
	
}
