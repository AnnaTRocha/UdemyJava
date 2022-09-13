package colecoes;

import java.util.HashSet;

public class Conjuntobaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		
		conjunto.add('x'); //não aceita repeticoes
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //uniao
		System.out.println(conjunto);
		conjunto.retainAll(nums); //intercessao
		
		conjunto.clear();
	}
}
