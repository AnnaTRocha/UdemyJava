package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Outros {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gab", 4);
		Aluno a3 = new Aluno("Luca", 6);
		Aluno a4 = new Aluno("Bia", 8.9);
		Aluno a5 = new Aluno("Tomas", 10);
		Aluno a6 = new Aluno("Ana", 7.1);
		Aluno a7 = new Aluno("Gab", 4);
		Aluno a8 = new Aluno("Luca", 6);
		Aluno a9 = new Aluno("Bia", 8.9);
		Aluno a10 = new Aluno("Tomas", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/limit");
		alunos.stream().distinct()
						.skip(2)
						.limit(2)
						.forEach(System.out::println);
		
		System.out.println("\ntake/while");
		alunos.stream().distinct()
						.takeWhile(a -> a.nota >= 7)
						.forEach(System.out::println);
	}
}
