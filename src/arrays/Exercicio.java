package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 9.0;
		notasAlunoA[2] = 6;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0 ;  i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length);
		
		double[] notasAlunoB = {6.9, 8.6, 10};
		double totalB = 0;
		for(int i = 0 ;  i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		
		System.out.println(totalB / notasAlunoB.length);
		
	}

}
