package classesEMetodos;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Notebook", 5000.0);
//		produto.preco = 5000.00;
//		produto.desconto = 0.25;
		
		Produto produto2 = new Produto("Caneta", 12.56);
//		produto2.preco = 12.56;
		Produto.desconto = 0.29;

		double precoFinal = produto.precoComDesconto();
		double precoFinal2 = produto2.precoComDesconto();
		
		System.out.println(Produto.desconto);
		System.out.println(precoFinal);
		
		System.out.println(precoFinal2);
	}

}
