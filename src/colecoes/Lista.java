package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Laura"));
		
		System.out.println(lista.get(3));
		
		System.out.println(lista.remove(1));
		System.out.println(lista.contains("Lia"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
