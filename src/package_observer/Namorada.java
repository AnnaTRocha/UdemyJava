package package_observer;

public class Namorada implements ObservadorChegadaAniversariante {

	public void chegou(EventoChegadaAniversariante envento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar...");
		System.out.println("Surpresa!");
	}
}
