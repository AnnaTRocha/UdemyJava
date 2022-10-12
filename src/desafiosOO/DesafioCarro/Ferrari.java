package desafiosOO.DesafioCarro;

public class Ferrari extends Carro {
	int velocidade; 
	
	public void acelerar() {
		velocidade += 15;
	}
	
	public void frear() {
		if(velocidade >= 0) {
			velocidade = 0;
		} else {
			velocidade -= 15;
		}
	}
}
