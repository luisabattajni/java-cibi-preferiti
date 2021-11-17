package org.generation.italy.array;

public class CibiPreferitiBonus {

	public static void main(String[] args) {

		String[]cibiPreferiti = {"Risotto alla milanese", "Pasta al ragù", "Risotto con l’ossobuco", "Polpette della nonna", "Focaccia ligure", "Pasta alla carbonara", "Cotolette alla milanese"};
		
		
		System.out.println("Questa lista contiene " + cibiPreferiti.length + " elementi");
		System.out.println("Cibo preferito: " + cibiPreferiti[0]);
		System.out.println("Cibo comunque preferito ma settimo: " + cibiPreferiti[cibiPreferiti.length -1]);
		System.out.println("Cibo preferito in posizione mediana: " + cibiPreferiti[cibiPreferiti.length /2]);
		
		/*
		 * alt:
		 * 	System.out.println("Cibo preferito in posizione mediana: " + cibiPreferiti[3]);

		 */

		
		
	}

}
