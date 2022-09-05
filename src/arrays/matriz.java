package arrays;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdAlunos = input.nextInt();
		
		System.out.println("Quantas novas por aluno? ");
		int qtdNotas = input.nextInt();
		
		double [][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for(int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d: ", nota, aluno);
				notasDaTurma[aluno][nota] = input.nextDouble();
				total += notasDaTurma[aluno][nota];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A media da turma é: " + media);
		
		input.close();
		
	}
}
