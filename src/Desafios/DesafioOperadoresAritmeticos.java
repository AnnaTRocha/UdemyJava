package Desafios;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {

		// primeira parte da conta
		int tresMaisDois = 3 + 2;
		int tresXDois = 3 * 2;

		double potencia = Math.pow(6 * tresMaisDois, 2);
		double parte1 = potencia / tresXDois;

		// Segunda parte da conta
		double parte2 = ((1 - 5) * (2 - 7)) / 2;
		
		//conta final
		double conta = Math.pow(parte1 - Math.pow(parte2,2) , 3) / Math.pow(10, 3);
		
		System.out.println(conta);
		
		

	}

}
