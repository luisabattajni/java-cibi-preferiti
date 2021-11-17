package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {

		String[]cibiPreferiti = {"Risotto alla milanese", "Pasta al ragù", "Risotto con l’ossobuco", "Polpette della nonna", "Focaccia ligure", "Pasta alla carbonara", "Cotolette alla milanese"};
		
		/*
		 * Poi stampate a video:
* 		la lunghezza della classifica
* 		il vostro cibo top (prima posizione della classifica)
* 		il vostro cibo preferito ma non troppo (ultima posizione della classifica)
		 */
		
		System.out.println("Questa lista contiene " + cibiPreferiti.length + " elementi");
		System.out.println("Cibo preferito: " + cibiPreferiti[0]);
		System.out.println("Cibo comunque preferito ma settimo: " + cibiPreferiti[cibiPreferiti.length -1]);

	}

}
