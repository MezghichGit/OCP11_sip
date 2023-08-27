package le15072023.APIStream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class primitiveStream {

	public static void main(String[] args) {
		Stream<Double> numbers = Stream.of(12.5,10.2,4.5);
		
		DoubleStream dNumbers = numbers.mapToDouble(x->x);
		System.out.println(dNumbers.average().getAsDouble());

	}

}
