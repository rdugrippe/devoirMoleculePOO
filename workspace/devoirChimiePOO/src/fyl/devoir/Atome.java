package fyl.devoir;

public class Atome implements Comparable<Object>{
	
	private String nom;
	private String symbole;
	private int masse;
	
	public Atome(String nom, String symbole, int masse) {
		this.nom = nom;
		this.symbole = symbole;
		this.masse = masse;
	}

	


	@Override
	public String toString() {
		return "Atome [nom=" + nom + ", symbole=" + symbole + ", masse="
				+ masse + "]";
	}  
	
	

}
