package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		String s = "Boa tarde";
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Boa")); // se começa com "Boa"
		System.out.println(s.toUpperCase().endsWith("TARDE")); //Primeiro deixa em maiúsculo e depois verifica
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tare"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.5;
		
		String maisUmaFrase = "Nome: " + nome 
				+ "\nSobrenome: " + sobrenome
				+ "\n idade: " + idade;
				
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d e ganha %.2f.", nome, sobrenome, idade, salario);
		
		System.out.println("Frase qualquer".contains("qual"));
		
	}

}
