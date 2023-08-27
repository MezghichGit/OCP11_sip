package java_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static String readFile(File source) throws IOException {
		StringBuilder data = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
		String s;
				while((s = reader.readLine()) != null) {
				data.append(s);
				}
		}
		return data.toString();
		}

	public static void main(String[] args) throws IOException {
		File source = new File("C:\\XML Simulation.xml");
		
		String data = readFile(source);
		System.out.println(data);

	}

}
