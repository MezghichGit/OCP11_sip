package methodesreferences;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import static java.util.Collections.sort;
public class ExoMethodesReferences {

	public static void main(String[] args) {
		// expression  lambda qui implemente le Supplier
		Supplier<LocalDate> sld = ()->LocalDate.now();
		// méthode de réfrence : via méthode static
		Supplier<LocalDate> sld2 = LocalDate::now;
		System.out.println(sld.get());
		
		Predicate<String> filter = (String ch)->ch.isEmpty();
		Predicate<String> filter2 = String::isEmpty;
		System.out.println(filter2.test("ocp"));
		
		Function<String, Integer> map = (String ch)->ch.length();
		Function<String, Integer> map2 = String::length;
		
		System.out.println(map2.apply("ocp"));

	}

}
