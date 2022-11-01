package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		
		String ultimaLinguagem = ListaUtil.getUltimo1(langs);
		Integer ultimoNumero = ListaUtil.getUltimo1(nums);
		
		System.out.println(ultimaLinguagem);
		System.out.println(ultimoNumero);
		
	}
}
