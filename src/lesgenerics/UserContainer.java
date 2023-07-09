package lesgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserContainer {

	public static void main(String[] args) {
		
		Function<String,Integer> fn = (String ch)->ch.length();
		Predicate<String> filter = (String ch)->ch.contains("OC");
		
		System.out.println(fn.apply("OCP"));
		System.out.println(filter.test("OP"));
		
		
		Map<String, Integer> annuaire = new HashMap<>();
		annuaire.put("Amine", 98_787_521);
		
		annuaire = new TreeMap<>();
		
		Voiture tab[] = new Voiture[12];
		
		Voiture v1 = new Voiture(1,"BMW");
		Voiture v2 = new Voiture(2,"Mercedes");
		Container<Voiture> transporteurV = new Container<>(tab);
		
		transporteurV.addObject(v1);
		transporteurV.addObject(v2);
		
		transporteurV.display();
		
		Animal tabA[] = new Animal[2];
		Container<Animal> transporteurM = new Container<>(tabA);

		
	}

}
