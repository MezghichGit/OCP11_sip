package day6_06082023.multicatch;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			String ch = null;
			System.out.println(ch.length());
		}
		catch(ArithmeticException | NullPointerException ex) //multi-catch
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();	
		}
		
		catch(Exception ex)
		{
			System.out.println("Oups problem here");
		}


	}

}
