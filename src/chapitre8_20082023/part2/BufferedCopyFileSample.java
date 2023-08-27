package chapitre8_20082023.part2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class BufferedCopyFileSample {

	public static void copy(File source,File destination) throws FileNotFoundException, IOException
	{
		int b;
		try(     InputStream in = new BufferedInputStream(new FileInputStream(source)); 
				OutputStream os = new BufferedOutputStream(new FileOutputStream(destination)))
		{
			byte[]buffer = new byte[256];
			int len;
			
			while((len = in.read(buffer))!=-1)
			{
				//System.out.println((char)b);
				System.out.println(len);
				os.write(buffer,0,len);
				os.flush();
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File source = new File("D:\\sagem\\OCP11_SIP_Academy\\src\\chapitre8_20082023\\Main.java");
		File destination = new File("D:\\sagem\\OCP11_SIP_Academy\\src\\chapitre8_20082023\\MainCopyBuffered.java");
		System.out.println(source.length());
		copy(source,destination);
	}

}
