package lesThreads.Concurrency;

import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {
		Stream<String>stream= Stream.of("amine","Bored","Marouen");
		stream.filter(null);

	}

}
