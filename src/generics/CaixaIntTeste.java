package generics;

public class CaixaIntTeste {
	 public static void main(String[] args) {
		CaixaInt<String> caixaA = new CaixaInt<>();
		caixaA.aguardar("2.3");
		
		String coisa = caixaA.abrir(); 
		System.out.println(coisa);
	}
}
