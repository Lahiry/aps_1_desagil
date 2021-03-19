package br.edu.insper.desagil.vaimalte;

public class Testador {
	
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
						
		Caixa caixa = new Caixa();
		
		if (caixa.totalCompra(carrinho) == 0.0) {
			return true;
		}
	    return false;
	}

	
	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto = new Produto(153, "Bolinho Ana Maria", 5.00);
		
		carrinho.adicionaProduto(produto);
		
		Caixa caixa = new Caixa();
		
		if (caixa.totalCompra(carrinho) == 5.00) {
			return true;
		}
		return false;
	}
		/*Carrinho carrinho = new Carrinho();
		
		Produto produto = new Produto(153, "Bolinho Ana Maria", 7.00);
		
		Pedido pedido = new Pedido(produto);
		carrinho.adicionaProduto(produto);
		
		Caixa caixa = new Caixa();
		
		if (caixa.totalCompra(carrinho) == 7.00) {
			return true;
		}*/
	    

	
	public boolean testeC() {
		
	    return false;
	}

	
	public boolean testeD() {
		
	    return false;
	}

	
	public boolean testeE() {
		
	    return false;
	}
	/*
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
	
	
	if (caixa.totalCompra(carrinho) == 0.00) {
		return true;
	}*/
	
}
