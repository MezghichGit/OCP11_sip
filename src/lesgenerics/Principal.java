package lesgenerics;

public class Principal {

	// déclaration d'une méthode générique
	public static  <T> void  display(T t)
	{
		System.out.println(t);
	}
	public static void main(String[] args) {
		//Imp<String> imp1;
		//Imp<Double>imp2;
		
		display("OCP");
		display(12);
		display(new StringBuilder("OCA"));
		display(true);

	}

}
