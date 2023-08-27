package methodesreferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// 1)implementation par lambda
		
		Fournisseur f1 = ()-> new StringBuilder();
		
		// 2) implementation par une méthode de référence par constructeur
		
		Fournisseur f2 = StringBuilder::new;
		StringBuilder s = f2.getSB();
		
		// 3)Implementation par une méthode de référence via une méthode static
		
		Consumer<List<String>> c1 = (List<String> l)->Collections.sort(l);
		List<String> names = Arrays.asList("sami","amine","zied");
		
		//c1.accept(names);
		//System.out.println(names);
		
		Consumer<List<String>> c2 = Collections::sort;
		
		c2.accept(names);
		System.out.println(names);
		
		// Exemple avec méthode de référence(println) basé sur une instance fixe
		names.forEach(name->System.out.println(name)); 
		names.forEach(System.out::println); 
		
		
		Predicate<String> filter = ch->ch.isEmpty(); //isEmpty : méthode d'instance
		System.out.println(filter.test("abc"));
		System.out.println(filter.test(""));
		
		Predicate<String> filter2 = String::isEmpty;
		System.out.println(filter2.test("abc"));
	}

}
