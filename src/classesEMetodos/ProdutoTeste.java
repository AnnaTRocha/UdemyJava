package classesEMetodos;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "Notebook";
		produto.preco = 5000.00;
		produto.desconto = 0.25;
		
		Produto produto2 = new Produto();
		produto2.nome = "Caneta";
		produto2.preco = 12.56;
		produto2.desconto = 0.29;

		double precoFinal = produto.precoComDesconto();
		double precoFinal2 = produto2.precoComDesconto();
		
		System.out.println(produto.nome);
		System.out.println(precoFinal);
		
		System.out.println(produto2.nome);
		System.out.println(precoFinal2);
	}

}
