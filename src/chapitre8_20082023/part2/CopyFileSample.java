package chapitre8_20082023.part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileSample {

	public static void copy(File source,File destination) throws FileNotFoundException, IOException
	{
		int b;
		try(    InputStream in = new FileInputStream(source); 
				OutputStream os = new FileOutputStream(destination))
		{
			while((b = in.read())!=-1)
			{
				//System.out.println((char)b);
				os.write(b);
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File source = new File("D:\\sagem\\OCP11_SIP_Academy\\src\\chapitre8_20082023\\Main.java");
		File destination = new File("D:\\sagem\\OCP11_SIP_Academy\\src\\chapitre8_20082023\\MainCopy.java");
		copy(source,destination);
	}

}
