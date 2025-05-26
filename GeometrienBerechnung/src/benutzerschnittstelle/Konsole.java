package benutzerschnittstelle;

import fachkonzeptklasse.*;

public class Konsole {

	public static void main(String[] args) {
		
		GeometrischeForm [] dieForm = new GeometrischeForm[5];

		dieForm[0] = new Kreis(10);
		dieForm[1] = new Kreis(2);
		dieForm[2] = new Rechtseck(2, 5);
		dieForm[3] = new Quadrat(5);
		dieForm[4] = new Rechtseck(10, 5);
		
		
		for (int i = 0; i<dieForm.length; i++) {
			System.out.println("Form: " + dieForm[i].getClass().getSimpleName());
			System.out.println("Fläche vom Figur : " +  dieForm[i].berechneFlaesche());
			System.out.println("Umfang vom Figur : " +  dieForm[i].berechneUmfang());
			System.out.println();
		}
	}

}
