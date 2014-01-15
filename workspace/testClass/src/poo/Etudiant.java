package poo;

public class Etudiant extends Personne{
	private String diplomeEnCours;
	private static int nbEtudiants = 0;
	
	public Etudiant(String nom, String prenom, String rue, String ville, String diplomeEnCours) {
		super(nom, prenom,rue, ville);
		this.diplomeEnCours = diplomeEnCours;
		this.nbEtudiants++;
	}
	
	public String toString(){
		return super.toString() + diplomeEnCours;
	}
	
	public void ecrirePersonne(){
		System.out.println("Secrétaire : " + toString());
	}
	
	public static int nbEtudiants(){
		return nbEtudiants;
	}

}
