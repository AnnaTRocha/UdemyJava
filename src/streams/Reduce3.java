package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gab", 4);
		Aluno a3 = new Aluno("Luca", 6);
		Aluno a4 = new Aluno("Bia", 8.9);
		Aluno a5 = new Aluno("Tomas", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia = 
				(m1,m3) -> Media.combinar(m1, m3);
				
		Media media = alunos.stream()
						.filter(aprovado)
						.map(apenasNota)
						.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A media da turma(aprovados): " + media.getValor());
	}
}
