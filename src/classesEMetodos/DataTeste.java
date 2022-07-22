package classesEMetodos;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data = new Data();
		
//		data.ano = 2021;
//		data.mes = 8;
//		data.dia = 12;
		
		System.out.println();
		
		System.out.println(data.obterDataFormatada());
		
		Data data1 = new Data(3,9,2022);
		System.out.println(data1.obterDataFormatada());
		
	}
	
}
