package day6_06082023.AutoClosableRessources;

public class Main {

	public static void main(String[] args) throws Exception {

		
		try(
				MaRessource rs = new MaRessource(); 
				IORessource ios = new IORessource()) //try-with-ressources
		{
			rs.processing();
			ios.processing();
			throw new IllegalArgumentException("Exception dans la main"); //exception principale
		} //execution d'un finally implicite pour exécuter la méthode close
		
		catch(IllegalArgumentException ex)
		{
			System.out.println(ex.getMessage());
			
			for(Throwable t : ex.getSuppressed())
			{
				System.out.println("Suppressed : " + t.getMessage());
			}
		}
		finally {
			System.out.println("Fin du programme");
		}

	}

}
