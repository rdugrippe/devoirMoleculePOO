package poo;

public class Enseignant extends Personne{
	private String specialite;
	private static int nbEnseignants = 0;

	public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
		super(nom, prenom,rue, ville);
		this.specialite=specialite;
		this.nbEnseignants++;
	}
	
	public String toString(){
		return super.toString() + specialite;
	}
	
	public void ecrirePersonne(){
		System.out.println("Enseignants : " + toString());
	}
	
	public static int nbEnseignants(){
		return nbEnseignants;
	}

}
