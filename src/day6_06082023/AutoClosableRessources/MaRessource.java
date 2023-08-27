package day6_06082023.AutoClosableRessources;

public class MaRessource implements AutoCloseable{

	public MaRessource() {
		System.out.println("Construction de l'objet...MaRessource");
	}
	public void processing()
	{
		System.out.println("traitement en cours...MaRessource");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Fermeture de l'objet MaRessource");
		throw new IllegalArgumentException("Problème dans MaRessource");
		
	}

}
