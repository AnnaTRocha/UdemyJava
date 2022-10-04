package colecoes;

import java.util.HashMap;
import java.util.Map;

public class ClasseMap {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); //adicionou
		usuarios.put(1, "Ricardo"); //alterou p/ Ricardo
		usuarios.put(2, "Ana");
		usuarios.put(20, "Alice");
		usuarios.put(3, "Alice");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.get(3));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
	}
}
