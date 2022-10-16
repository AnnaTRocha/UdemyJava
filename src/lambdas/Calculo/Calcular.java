package lambdas.Calculo;

import java.util.function.BinaryOperator;

public class Calcular {
	public static void main(String[] args) {
		BinaryOperator<Double> calculo = (a, b) -> {return a + b;};
		System.out.println(calculo.apply(3.0, 2.0));
		
		calculo = (a, b) -> a * b;
		System.out.println(calculo.apply(3.0, 2.0));
	}
}
