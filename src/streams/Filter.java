package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Edu", 8.0);
		Aluno a3 = new Aluno("Cadu", 6.1);
		Aluno a4 = new Aluno("Leo", 9.8);
		Aluno a5 = new Aluno("OOO", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns, " + a.nome+ " você foi aprovado!";
		
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);;
	}
}
