package lescollections;

//public class Etudiant implements Comparable<Etudiant>{
public class Etudiant {
	int age;
	String nom;
	public Etudiant(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Etudiant [age=" + age + ", nom=" + nom + "]";
	}
	/*
	@Override
	public int compareTo(Etudiant o) {
		// TODO Auto-generated method stub
		//return  o.hashCode() - this.hashCode();
		//return this.age-o.age;
		
		return this.nom.compareTo(o.nom);
		
	}*/


}
