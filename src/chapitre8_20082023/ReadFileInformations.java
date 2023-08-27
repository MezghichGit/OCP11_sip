package chapitre8_20082023;

import java.io.File;

public class ReadFileInformations {

	public static void main(String[] args) {
		File file = new File("D:\\sagem\\OCP11_SIP_Academy");
		
		File file2 = new File("D:\\sagem\\OCP11_SIP_Academy\\src\\chapitre8_20082023\\Main.java");
		//System.out.println("File2 : " + file.listFiles());
		
		
		System.out.println("File exists : " + file.exists());

		if (file.exists()) {
			System.out.println("Absolute Path : " + file.getAbsolutePath());
			System.out.println("Is Directory : " + file.isDirectory());
			System.out.println("Parent Path : " + file.getParent());

			if (file.isFile()) {
				System.out.println("File.length : " + file.length());
				System.out.println("Last modified : " + file.lastModified());
			} else { // is Directory

				for (File fileElm : file.listFiles()) {
					System.out.println("File name : " + fileElm.getName());
				}

			}
		}

	}

}
