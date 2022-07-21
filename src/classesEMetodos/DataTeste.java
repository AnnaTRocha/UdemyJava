package classesEMetodos;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.ano = 2021;
		data.mes = "Janeiro";
		data.dia = 12;
		
		System.out.println(data.obterDataFormatada());
		
	}
	
}
