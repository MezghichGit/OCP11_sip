package day6_06082023;

public class Application {

	public static void info1() throws Exception{  // checked
		throw new Exception("Un problème");
	}
	
	public static void info2() throws RuntimeException{ //Unchecked
	 throw new IllegalArgumentException("Juste un test d'exception");
	}
	
	
	public static void main(String[] args)  {
		
		
		try {
			info1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			info2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new NullPointerException();
		}
		finally {
		System.out.println("Fin du programme");
		}
	}

}
