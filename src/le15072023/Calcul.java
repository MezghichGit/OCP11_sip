package le15072023;

@FunctionalInterface
public interface Calcul {
	
	public void operation(double x, double y);
	
	// à partir de la version 8
	
	public default void info() {
		System.out.println("version 8");
	}
	
	public static void infoSt() {
		System.out.println("version 8");
	}
	// à partir de la version 9
	private void affichage() {
		System.out.println("version 9");
	}
	
	private static void affichageSt() {
		System.out.println("version 9");
	}
	

}
