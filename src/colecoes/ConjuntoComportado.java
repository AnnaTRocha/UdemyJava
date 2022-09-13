package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>(); //ordem de inserção
		
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Lucas");
		
		//lista.add(1.2);
		for(String candidato : lista) {
			System.out.println(candidato);
		}
	}
	
}
