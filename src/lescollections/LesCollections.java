package lescollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LesCollections {

	public static void main(String[] args) {
		// Le type Set n'accepte pas les doublons
		// Le type TreeSet fait un sort de ses elements
		
		//1)Exemple TreeSet
		/*
		Set<Integer> numbers = new TreeSet<>();
		System.out.println(numbers.add(12)); // true
		System.out.println(numbers.add(14)); // true
		System.out.println(numbers.add(new Integer(12))); // false
		System.out.println(numbers.add(16)); // true
		System.out.println(numbers);
		*/
		//2)Exemple TreeSet
		
		Set<Integer> numbers = new HashSet<>();
		System.out.println(numbers.add(12)); // true
		System.out.println(numbers.add(14)); // true
		System.out.println(numbers.add(new Integer(12))); // false
		System.out.println(numbers.add(16)); // true
		System.out.println(numbers);
		
		/*
		Set<Etudiant> students = new TreeSet<>();
		Etudiant e1 = new Etudiant(25,"Amine");
		Etudiant e2 = new Etudiant(24,"Mokhtar");
		Etudiant e3 = new Etudiant(21,"Wael");
		Etudiant e4 = new Etudiant(21,"Wael2");
		System.out.println(e3.equals(e4));
		students.add(e1);
		students.add(e2);
		students.add(e3);
		students.add(e4);
		System.out.println(students);*/
		
		List<Etudiant> students = new ArrayList<>();
		Etudiant e1 = new Etudiant(25,"Amine");
		Etudiant e2 = new Etudiant(24,"Mokhtar");
		Etudiant e3 = new Etudiant(21,"Wael");
		Etudiant e4 = new Etudiant(21,"Wael2");
	
		students.add(e1);
		students.add(e2);
		students.add(e3);
		students.add(e4);
		
		Comparator<Etudiant> compAge =(u, v)->u.age-v.age;
		Comparator<Etudiant> compNom =(u, v)->u.nom.compareTo(v.nom);
		
		Collections.sort(students,compAge);
		System.out.println(students);
		
		Collections.sort(students,compNom);
		System.out.println(students);
	}

}
