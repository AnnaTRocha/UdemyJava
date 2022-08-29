package desafios.Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean notaValida;
		int qtdNota = 0;
		float nota = 0;
		float total = 0;
		
		while(nota != -1) {
			
			System.out.println("Digite uma nota de 0 � 10: ");
			nota = s.nextFloat();

			
			notaValida = nota  >= 0 || nota <=10 ? true : false;
			
			if(notaValida) {
				total += nota; 
				qtdNota++;
			}
				
		}
		
		float media = total / qtdNota;
		System.out.println("Sua media e: " + media);
		
		s.close();
	}
	
}
