package desafios.desafioOO1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final List<Compra> compras = new ArrayList<>();
	final String nome;
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
