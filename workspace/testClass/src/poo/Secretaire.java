package poo;

public class Secretaire extends Personne{
	private String numeroBureau;
	private static int nbSecretaires = 0;
	
	public Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
		super(nom, prenom,rue, ville);
		this.numeroBureau = numeroBureau;
		this.nbSecretaires++;
	}
	
	public String toString(){
		return super.toString() + numeroBureau;
	}
	
	public void ecrirePersonne(){
		System.out.println("Secrétaire : " + toString());
	}
	
	public static int nbSecretaires(){
		return nbSecretaires;
	}

}
