package benutzerschnittstelle;

import java.util.Scanner;

import fachkonzeptklasse.Klassenarbeit;

public class Konsole {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Notenrechner");
		System.out.println("============");
		System.out.println("Maximale Punktzahl:");
		double max = eingabe.nextDouble();
		if (max <= 0) {
			eingabe.close();
			throw new IllegalArgumentException();
		}
		System.out.println("erreichte Punktzahl:");
		double erreicht = eingabe.nextDouble();
		if (erreicht < 0 || erreicht > max) {
			eingabe.close();
			throw new IllegalArgumentException();
		}
		System.out.println("Anzahl Nachkommastellen:");
		int nachKomma = eingabe.nextInt();
		if (nachKomma < 0) {
			eingabe.close();
			throw new IllegalArgumentException();
		}
		System.out.println();
		Klassenarbeit dieKlassenarbeit = new Klassenarbeit(erreicht, max);//hier die exception
		//im try catch bzw werfen.
		eingabe.close();
		System.out.println("Note ungerundet: " + dieKlassenarbeit.ermittleNote());
		System.out.println("Noten gerundet: " + dieKlassenarbeit.ermittleNote(nachKomma));

	}

}
