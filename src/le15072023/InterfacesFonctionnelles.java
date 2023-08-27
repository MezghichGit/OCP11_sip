package le15072023;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class InterfacesFonctionnelles {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		System.out.println(map.put("amine", 123));
		System.out.println(map.put("amine", 123));
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v); //void
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		System.out.println(map); 
		
		BiConsumer<String, String> b3 = (k, v) -> System.out.println(k+v);
		Function<List<String>,String> ex1 = x -> x.get(0); 
		UnaryOperator<Long> ex2 = (Long l) ->(long) 3.14;
		Predicate<String> ex4 = String::isEmpty; 

	}

}
