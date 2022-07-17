package desafios.Controle;

public class DesafioControle {
	public static void main(String[] args) {
		for(String valor = "#"; !valor.equals("######") ; valor = valor + "#" ) {
			System.out.println(valor);
		}
	}
}
