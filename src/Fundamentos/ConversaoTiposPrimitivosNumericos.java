package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1.1233213131223;
		System.out.println(a);
		
		float b = (float) 1.1233213131223; //forma explicita(CAST), com perda de informação já que f é menor que d
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //um int suporta muito mais que byte, portanto precisa de cast
		System.out.println(d);
	}

}
