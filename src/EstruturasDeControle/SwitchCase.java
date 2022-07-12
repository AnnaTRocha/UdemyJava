package EstruturasDeControle;

public class SwitchCase {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("preta");
		case "marrom":
			System.out.println("marrom");
		case "roxa":
			System.out.println("roxa");
		case "amarela":
			System.out.println("amarela");
		case "verde":
			System.out.println("verde");
		case "laranja":
			System.out.println("laranja");
		case "vermelho":
			System.out.println("vermelho");
		break;
		default:
			System.out.println("AAAAAA");
		
		
		}
	}
	
}
