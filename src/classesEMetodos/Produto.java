package classesEMetodos;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//construtor
	
	Produto(String nomeInicial, double preco){
		nome = nomeInicial;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		double precoFinal = preco * (1 - desconto);
		return precoFinal;
	}

}
