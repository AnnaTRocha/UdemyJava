package classesEMetodos;

public class Data {
	
	int ano;
	String mes;
	int dia;
	
	String obterDataFormatada() {
		String data = String.valueOf(dia) + "/" + mes + "/" + String.valueOf(ano);
		return data;
	}
	
}
