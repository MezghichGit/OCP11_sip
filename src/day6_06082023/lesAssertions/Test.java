package day6_06082023.lesAssertions;

public class Test {

	public static void main(String[] args) {
		int x = 12;  
		//-ea : -enable Assertion
		assert(x<10):"Valeur de x > 10"; // equivalent à cette expression (x>10) throw new AssertionError("Valeur de x >10");
		
		System.out.println("Valeur de x = "+x);
		

	}

}
