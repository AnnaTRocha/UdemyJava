package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Produtos p1 = new Produtos("pc gamer", 1500.0, 20, 60);
		Produtos p2 = new Produtos("boneca", 15.99, 0.1, 0.0);
		Produtos p3 = new Produtos("porta", 50.60, 5, 10);
		Produtos p4 = new Produtos("Cubo", 10.0, 0.5, 1);
		Produtos p5 = new Produtos("Pelúcia", 60.0, 0.9, 60);
		Produtos p6 = new Produtos("peso 200kg", 1000.0, 200, 60);
		Produtos p7 = new Produtos("chumbo", 15.0, 1000, 60);
		
		List<Produtos> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		Predicate<Produtos> isCaro = p -> p.getPreco() > 100;
		
		Predicate<Produtos> isPesado = p -> p.getPeso() > 50;
		
		Function<Produtos, String> precoFinal = 
				p -> "O produto " + p.getNome()+ " tem o valor final de " 
						+ p.getPreco() + p.getFrete() + " reais." ;
		
		produtos.stream()
			.filter(isCaro)
			.filter(isPesado)
			.map(precoFinal)
			.forEach(System.out::println);;
	}
}
