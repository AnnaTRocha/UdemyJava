package Fundamentos;

import java.util.Scanner;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		// objeto
		String st = "texto";
		st.toUpperCase();

		// primitivo - WRAPPERS(versão objeto dos primitivos)
		int a = 123;
		System.out.println(a);

		Scanner entrada = new Scanner(System.in);

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next()); // usuario que escreve
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);

		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c + "...");
		
		float f = 123.0f;
		System.out.println(f);
		
		Double d = 123.456;
		System.out.println(d);
		

	}

}
