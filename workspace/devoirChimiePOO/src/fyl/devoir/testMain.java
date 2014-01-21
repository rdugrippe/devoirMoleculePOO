package fyl.devoir;

import java.util.ArrayList;

public class testMain {

	public static void main(String[] args) {
		Atome a1 = new Atome("Carbone", "C",12);
		Atome a2 = new Atome("Chlore", "Cl",17);
		String s = "abc";
		
		ArrayList<Atome> l1 = new ArrayList<Atome>();
		l1.add(a1);
		l1.add(a2);
		
		Molecule m1 = new Molecule("mojo",l1);
		
		System.out.println(m1.masseMoleculaire());
		System.out.println(m1);
		/*
		System.out.println(a1.compareTo(a2));
		System.out.println(a1.equals(a2));
		//System.out.println(a1.compareTo(s));
		System.out.println(a1.equals(s));
		*/
	}

}
