package lambdas.ForEach;

import java.util.Arrays;
import java.util.List;

import arrays.foreach;

public class lambdaForEach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Gui", "Liz", "Bia");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01");
		aprovados.forEach(nome -> System.out.println(nome + "!"));
		
		System.out.println("\nMethod reference...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
//		System.out.println("\nMethod reference... #2");
//		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("O nome é: " + nome);
	}
}
