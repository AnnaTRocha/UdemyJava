package desafios.Controle;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayNotas{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de notas? ");
		int qtdNotas = scanner.nextInt();
		double[] notas = new double[qtdNotas];

		for (int i = 0; i < notas.length ; i++) {
			System.out.println("Digite a nota " + i + 1 + ": ");
			notas[i] = scanner.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A media é " + media);
		scanner.close();
		
	}
}
