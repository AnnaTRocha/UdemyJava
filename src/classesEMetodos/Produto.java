package classesEMetodos;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		double precoFinal = preco * (1 - desconto);
		return precoFinal;
	}

}
