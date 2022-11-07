package streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		//Consumer recebe um paremetro e não retorna nada
		Consumer<String> print = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "Lua", "Js");
		langs.forEach(print);
		
		String[] maisLangs = {"Python", "Go", "Perl"};
		Stream.of(maisLangs).forEach(print);
	}
}
