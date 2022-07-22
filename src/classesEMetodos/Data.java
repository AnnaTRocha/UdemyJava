package classesEMetodos;

public class Data {
	
	int ano;
	int mes;
	int dia;
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	String obterDataFormatada() {
		String data = String.valueOf(dia) + "/" + mes + "/" + String.valueOf(ano);
		return data;
	}
	
}
