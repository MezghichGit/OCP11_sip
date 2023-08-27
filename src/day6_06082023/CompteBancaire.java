package day6_06082023;

public class CompteBancaire {
	
	int solde = 0;

	public CompteBancaire(int solde) {
		super();
		this.solde = solde;
	}
	
	public void debiter(int valeur) throws CBException{

		if((this.solde - valeur)<0)
		{
			throw new CBException("Solde insuffissant");
		}
		else {
			this.solde = (this.solde - valeur);
		}
	}
	
	

}
