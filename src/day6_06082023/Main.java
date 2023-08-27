package day6_06082023;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start");
		int x = 10;
		int y = 10;
		try {
		String formation = null;
		System.out.println(formation.length());
		System.out.println(x/y);
		}
		catch(ArithmeticException ex) // we handle the exception
		{
			System.out.println("Problème : "+ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("Oups un problème");
			ex.printStackTrace();
			return;  // provoque l'arret immediat de la fonction main
		}
		finally {
			System.out.println("End");
		}

	}

}
