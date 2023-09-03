package chapitre9_03092023;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws URISyntaxException, IOException {
		/*
		 * Path path1 = Paths.get("C:\\Users\\amine\\Desktop\\Présentations_Smart_IT");
		 * System.out.println(path1);
		 * 
		 * Path path3 = Paths.get(new
		 * URI("file://C:/Users/amine/Desktop/Présentations_Smart_IT/data.txt"));
		 * System.out.println(path3);
		 * 
		 * Path path2 =
		 * FileSystems.getDefault().getPath("c:","zooinfo","November","employees.txt");
		 * System.out.println(path2);
		 * 
		 * FileSystem fileSystem = FileSystems.getFileSystem(new
		 * URI("https://www.selikoff.net")); Path path =
		 * fileSystem.getPath("/wp-content/uploads/2014/09/oca-cover.jpg");
		 * System.out.println(path);
		 */
		/*
		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: " + path.toString());
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: " + path.getName(i));
		}*/

		/*printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));*/
		/*
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? "+path1.isAbsolute());
		
		System.out.println("Absolute Path1: "+path1.toAbsolutePath());
		
		Path path2 = Paths.get("birds/condor.txt");
		
		System.out.println("Path2 is Absolute? "+path2.isAbsolute());
		System.out.println("Absolute Path2 "+path2.toAbsolutePath());
		
		Path path = Paths.get("/mammal/carnivore/raccoon.image");
		System.out.println("Path is: "+path); 
		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
		System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2)); 
		*/
		//System.out.println(Paths.get("../").toRealPath());
		//System.out.println(Paths.get(".").toRealPath());
		//copy
		
		//try {
			//Files.copy(Paths.get("C:\\Users\\amine\\Desktop\\dir1"), 
				//	Paths.get("C:\\Users\\amine\\Desktop\\dir2"));
			
			//Files.move(Paths.get("C:\\Users\\amine\\Desktop\\dir2"), 
			//		Paths.get("C:\\Users\\amine\\Desktop\\Présentations_Smart_IT\\dir3"));
			
			
			/*Files.copy(Paths.get("/panda/bamboo.txt"),
					Paths.get("/panda-save/bamboo.txt"));*/
			//} catch (IOException e) {
				// Handle file I/O exception...
		//}
		
		Path path = Paths.get("C:\\Users\\amine\\Desktop\\Présentations_Smart_IT\\dir3\\data.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(path,Charset.forName("UTF-16"))) 
		 {
			writer.write("Hello World");
		 } catch (IOException e) {
			 // Handle file I/O exception...} 
		 }

		

	}

	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is: " + path.getRoot());
		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: " + currentParent);
		}
	}

}
