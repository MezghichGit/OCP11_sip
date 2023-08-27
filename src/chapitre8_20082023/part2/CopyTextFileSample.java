package chapitre8_20082023.part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyTextFileSample {

	public static List<String> readFile(File source) throws IOException
	{
		List<String> data = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(source)))
		{
			String s;
			while((s = reader.readLine())!=null)
			{
				data.add(s);
			}
		}
		return data;
	}
	
	public static void writeFile(List<String> data, File destination) throws IOException
	{
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination)))
		{
			for(String s: data)
			{
				writer.write(s);
				writer.newLine();
			}
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		File source = new File("C:\\Users\\amine\\Desktop\\data\\animals.txt");
		File destination = new File("C:\\Users\\amine\\Desktop\\data\\copy_animals.txt");
		List<String> data = new ArrayList<>();
		data = readFile(source);
		System.out.println(data);
		writeFile(data,destination);
	}

}
