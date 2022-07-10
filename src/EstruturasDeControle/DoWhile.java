package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String texto = "";
		
		do {
			System.out.println("fale: ");
			texto = scanner.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		scanner.close();
		
	}
}
