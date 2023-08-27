package day6_06082023.AutoClosableRessources;

import java.io.Closeable;
import java.io.IOException;

public class IORessource implements Closeable{

	public IORessource() {
		System.out.println("Construction de l'objet...IORessource");
	}
	public void processing()
	{
		System.out.println("traitement en cours...IORessource");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("Fermeture de l'objet IORessource");
		throw new IllegalArgumentException("Problème dans IORessource");
		
	}

}
