package lesgenerics;

public class Voiture {
	
	int id;
	String marque;
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + "]";
	}
	public Voiture(int id, String marque) {
		super();
		this.id = id;
		this.marque = marque;
	}

}
