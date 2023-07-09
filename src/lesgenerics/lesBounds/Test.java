package lesgenerics.lesBounds;
import java.util.*;
public class Test {
	
	/*public static void addElement(List<?>list)  //unbounded Objects are immutable
	{
		
		Object obj = new Object();
		list.add(obj);
		
		String temp;
		for(Object o : list)
		  {
			temp = (String)o;
			//temp = String.valueOf(o);
			System.out.println(temp.toUpperCase());
		  }
	}*/
	
	/*public static void addElement(List<? extends C>list)  //upperBounded Objects are immutable
	{
		C obj = new C();
		list.add(obj);
		
	}*/
	
	public static void addElement(List<? super B>list)  //LowerBounded Objects are mutable
	{
		A obj = new A();
		list.add((B)obj);
		
	}

	
	public static void main(String[] args) {
		ArrayList<A>la = new ArrayList<>();
		ArrayList<B>lb = new ArrayList<>();
		ArrayList<C>lc = new ArrayList<>();
		
		//addElement(la);
		addElement(lb);
		//addElement(lc);

	}

}
