package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p,quantidade));
	}
	void adicionarItem(String nome,double preco, int quantidade) {
		var p = new Produto(nome,preco);
		this.itens.add(new Item(p,quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
