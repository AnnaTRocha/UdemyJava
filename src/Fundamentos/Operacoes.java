package Fundamentos;

public class Operacoes {
	public static void main(String[] args) {
		
		//ARITMETICAS
		System.out.println("-------Operadores aritméticos-------");
		System.out.println(2+3);
		
		var x = 24.56;
		double y = 2.2;
		
		System.out.println(x/y);
		
		int a = 8;
		int b = 4;
		
		System.out.println(a / (double) b );
		System.out.println(a / (float) b );
		System.out.println(a % b); //resto da divisão
		
		//OPERADORES LÓGICOS
		System.out.println("-------Operadores lógicos-------");
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao2);
		
		System.out.println("Tabela AND");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("Tabela OR");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("Tabela XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela NOT");
		System.out.println(!true);
		System.out.println(!false);
		
		//Relacionais
		
		System.out.println("-------Operadores Relacionais-------");
		
		int i = 97;
		int j = 'a';
		
		System.out.println(i == j);
		
		System.out.println(3 > 4);
		System.out.println(3 < 4);
		System.out.println(3 >= 4);
		System.out.println(3 != 4);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}
}
