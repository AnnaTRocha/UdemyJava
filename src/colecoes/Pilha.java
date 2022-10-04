package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	//LIFO
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // ou element
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
	}
}
