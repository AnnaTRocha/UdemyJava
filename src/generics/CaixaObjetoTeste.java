package generics;

public class CaixaObjetoTeste {
	 public static void main(String[] args) {
		CaixaObjeto<String> caixaA = new CaixaObjeto<>();
		caixaA.aguardar("2.3");
		
		String coisa = caixaA.abrir(); 
		System.out.println(coisa);
	}
}
