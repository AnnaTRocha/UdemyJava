package desafiosOO.DesafioCarro;

public class Principal {
	public static void main(String[] args) {
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic.velocidade);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari.velocidade);
		
		civic.frear();
		
		System.out.println(civic.velocidade);
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		System.out.println(ferrari.velocidade);
	}
}
