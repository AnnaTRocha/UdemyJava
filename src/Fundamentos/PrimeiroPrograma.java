package Fundamentos;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		final int TRINTA_E_DOIS = 32;
		final float DIV = 5/9f;
		
		float temperaturaF = 10;
		float temperaturaC = (temperaturaF - TRINTA_E_DOIS) *  DIV;
		
		System.out.println(temperaturaF +"°F em graus Celsius é igual à: "+temperaturaC+ "°C");
		
	}

}
