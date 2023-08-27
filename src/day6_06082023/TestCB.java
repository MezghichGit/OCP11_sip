package day6_06082023;

public class TestCB {

	public static void main(String[] args) {
		CompteBancaire cb = new CompteBancaire(0);
		try {
			cb.debiter(100);
		} catch (CBException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
			System.out.println("Suite du programme");
	}

}
