package desafiosOO.DesafioCarro;

public class Carro {
	int velocidade;
	
	void acelerar() {
		velocidade += 5;
	}
	
	void frear() {
		if(velocidade <= 0) {
			velocidade = 0;
		} else {
			velocidade -= 5;
		}
	}
}
