package le15072023;

import java.util.Optional;

public class TypeOptional {

	public static Optional<Double> average(int...scores) {
		if (scores.length == 0) return Optional.empty(); 
		int sum = 0;
		for (int score: scores) sum += score;
	return Optional.of((double) sum / scores.length);
	} 
	
	
	public static void main(String[] args) {
		
		Optional<Double> res1 = average(10,16);
		Optional<Double> res2 = average();
	
		if(res1.isPresent())
		{
			System.out.println(res1.get());
		}
		
		res1.ifPresent(System.out::println);
		
		if(res2.isPresent())
		{
			System.out.println(res2.get());
		}
		else
		{
			System.out.println("Result not yet available");
		}
		
		
		
	
	}

}
