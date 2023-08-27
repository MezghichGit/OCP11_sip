package chapitre8_20082023;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		//
		/*
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator); */
		
		//File file = new File("/home/smith/data/zoo.txt");
		//File file = new File("C:\\Users\\amine\\Desktop\\Lab_MongoDB_Express\\ingress.yaml"); // chemin absolu
		
		File file = new File(System.getProperty("user.dir"));
		System.out.println(file);
		System.out.println(file.exists());
		
		File file2 = new File("src\\chapitre8_20082023\\Main.java");//chemin relatif
		System.out.println(file2.exists());

	}

}
