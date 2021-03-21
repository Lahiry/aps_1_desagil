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
		
		Produto bolinho = new Produto(153, "Bolinho Ana Maria", 5.00);
		
		carrinho.adicionaProduto(bolinho);
		
		Caixa caixa = new Caixa();
		
		if (caixa.totalCompra(carrinho) == 5.00) {
			return true;
		}
		return false;
	}
		
	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		
		Produto bolinho = new Produto(153, "Bolinho Ana Maria", 12.00);
		
		carrinho.adicionaProduto(bolinho);
		
		Caixa caixa = new Caixa();
		
		caixa.insereDesconto(bolinho, 20);
		
		if (caixa.totalCompra(carrinho) == 9.60) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
		
		Produto bolinho = new Produto(153, "Bolinho Ana Maria", 5.00);
		Produto sucrilhos = new Produto(423, "Sucrilhos", 2.00);
		
		carrinho.adicionaProduto(bolinho);
		carrinho.adicionaProduto(bolinho);
		
		carrinho.adicionaProduto(sucrilhos);
		
		Caixa caixa = new Caixa();
		
		caixa.insereDesconto(sucrilhos, 50);
		
		if (caixa.totalCompra(carrinho) == 11.00) {
			return true;
		}
	    return false;
	    
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		
		Produto bolinho = new Produto(153, "Bolinho Ana Maria", 5.00);
		Produto sucrilhos = new Produto(423, "Sucrilhos", 2.00);
		
		carrinho.adicionaProduto(bolinho);
		carrinho.adicionaProduto(bolinho);
		
		carrinho.adicionaProduto(sucrilhos);
		
		Caixa caixa = new Caixa();
		
		caixa.insereDesconto(bolinho, 50);
		
		if (caixa.totalCompra(carrinho) == 7.00) {
			return true;
		}
	    return false;
	}
	
}
