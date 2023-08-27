package chapitre8_20082023.part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("D:\\sagem\\OCP11_SIP_Academy\\src\\chapitre8_20082023\\Main.java");
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
			
			System.out.println(bufferedReader.readLine());
		}

	}

}
