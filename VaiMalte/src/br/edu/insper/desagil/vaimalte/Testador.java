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
		
	public boolean testeC() {
		
	    return false;
	}

	public boolean testeD() {
		
	    return false;
	}

	public boolean testeE() {
		
	    return false;
	}
	
}
