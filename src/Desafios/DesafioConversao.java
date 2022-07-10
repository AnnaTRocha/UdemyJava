package Desafios;

import java.util.Scanner;

public class DesafioConversao {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro salário para podermos calcular a média! ");
		String s1 = scanner.next().replace(",", ".");
		
		System.out.println("Digite seu segundo salário: ");
		String s2 = scanner.next().replace(",", ".");		
		
		System.out.println("Digite seu terceiro salário: ");
		String s3 = scanner.next().replace(",", ".");
		 
		//Converter pra float
		Float salario1 = Float.parseFloat(s1);
		Float salario2 = Float.parseFloat(s2);
		Float salario3 = Float.parseFloat(s3);
		
		Float media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A média do seu salário é: " + media);
		scanner.close();
		 
	}
}
