package desafios.Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana");
		String n = scanner.next();
		
		if(n.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		}else if(n.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		}else if(n.equalsIgnoreCase("Ter�a")) {
			System.out.println("3");
		}else if(n.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		}else if(n.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		}else if(n.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		}else if(n.equalsIgnoreCase("S�bado")) {
			System.out.println("7");
		}else {
			System.out.println("Dia inv�lido!");
		}
		
		scanner.close();
	}

}
