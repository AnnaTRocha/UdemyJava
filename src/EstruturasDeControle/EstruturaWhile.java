package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String mensagem = "";
		
		while(!mensagem.equalsIgnoreCase("sair")) {
			System.out.println("Digite uma mensagem: ");
			mensagem = scanner.next();
		}
		
		scanner.close();
	}
}
