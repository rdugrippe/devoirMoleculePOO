package fyl.devoir;

import java.util.ArrayList;

public class Molecule {
	private String nom;
	private ArrayList<Atome> molecule = new ArrayList<Atome>();
	
	public Molecule(String nom, ArrayList<Atome> molecule) {
		this.nom = nom;
		this.molecule = molecule;
	}

	@Override
	public String toString() {
		String formule = new String();
		for(Atome a : this.molecule){
			formule = formule + a.getSymbole() + " ";
			
		}
		return "Molecule [nom=" + nom + ", formule = " + formule + ", masse = " + this.masseMoleculaire()+ "]";
	}

	//getters
	public String getNom() {
		return nom;
	}

	public ArrayList<Atome> getMolecule() {
		return molecule;
	}
	
	public int masseMoleculaire(){
		int masse = 0;
		for(Atome a: this.molecule){
			masse += a.getMasse();
		}
		return masse;
	}
}
