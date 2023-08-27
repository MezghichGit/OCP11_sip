package le15072023.APIStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Double> randoms = Stream.generate(Math::random);
		randoms.limit(10).forEach(System.out::println);
		
		//Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		//oddNumbers.sorted().forEach(System.out::println);
		//oddNumbers.forEach(System.out::println);
		// Exercice n°1
		
		List<String> names = Arrays.asList("amine","Mokhtar","Wael","Aloui","Aziz","Intissar","Lamia");
		//System.out.println(names);
		
		//System.out.println(names.stream().filter(x->x.length()>5).sorted((x,y)->y.compareTo(x)).limit(3).collect(Collectors.toList()));
		System.out.println(names.stream().filter(x->x.length()>5).sorted().limit(3).collect(Collectors.toList()));
		//System.out.println(names.stream().filter(x->x.length()>4).peek(System.out::println).sorted().limit(3).peek(System.out::println).count());
	}

}
