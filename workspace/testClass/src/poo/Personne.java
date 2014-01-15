package poo;

public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected String rue;
	protected String ville;
	protected static int nbPersonnes = 0;

	public Personne(String nom, String prenom, String rue, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		nbPersonnes++;
	}
	
	public String toString(){
		return nom + " "+ prenom + ", " + rue + ", " + ville + " ";
	}
	
	public abstract void ecrirePersonne();
	
	public static void nbPersonnes(){
		System.out.println("nbPer "+nbPersonnes+" nbSec "+Secretaire.nbSecretaires()+" nbEns "+Enseignant.nbEnseignants()+" nbEtu "+Etudiant.nbEtudiants());
	}
	
	public void modifierPersonne(String rue, String ville){
		this.rue = rue;
		this.ville = ville;
		this.ecrirePersonne();
	}
	
	//test classes
	public static void main(String[] args) {
		Secretaire s1 = new Secretaire("John","Petit", "Gougeard","LE MANS","202");
		s1.ecrirePersonne();
		
		Enseignant e1 = new Enseignant("Peter","Seb","Bollee","LE MANS","Info");
		e1.ecrirePersonne();
		Personne.nbPersonnes();
	}
}

