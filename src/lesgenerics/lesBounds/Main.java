package lesgenerics.lesBounds;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		a = o;  // OK
		//o = a;  KO
		
		ArrayList<Animal>la;
		ArrayList<Oiseau>lo;
		
		//Unbounded
		/*
		List<?>l = new ArrayList<String>();
		l = new ArrayList<Animal>();
		l = new ArrayList<Oiseau>();*/
		
		//Upper Bound
		/*List<? extends A> list = new ArrayList<A>();
		list = new ArrayList<B>();
		list = new ArrayList<C>();*/
		
		//Lower Bound
		List<? super B> list = new ArrayList<A>();
		list = new ArrayList<B>();
		//list = new ArrayList<C>();

	}

}
