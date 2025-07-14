package benutzerschnittstelle;

import fachkonzeptklasse.Wuerfel;

public class Konsole
{
	public static void main(String[] args)
	{
		Wuerfel[] dieWuerfeln = new Wuerfel[5];
		// 5 Wuerfel erzeugen und in Array "derWuerfel" ablegen
		for(int i = 0; i < dieWuerfeln.length; i++) {
			dieWuerfeln[i] = new Wuerfel();
			dieWuerfeln[i].wirf();
		}
		Wuerfel.geworfen();
		System.out.println("Darf der Spieler nochmal werfen?: ");
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
		
		// ueber Schleife alle W�rfel werfen, der Klasse "Wuerfel"
		
		// mitteilen, dass die W�rfel geworfen wurden
		
		// ausgeben, ob der Spieler noch einmal w�rfeln darf
		dieWuerfeln[2].wirf();
		// Wuerfel Nr. 2 werfen, der Klasse "Wuerfel"
		Wuerfel.geworfen();
		// mitteilen, dass die W�rfel geworfen wurden
		System.out.println("Darf der Spieler nochmal werfen?: ");
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
		// ausgeben, ob der Spieler noch einmal w�rfeln darf
		
		dieWuerfeln[4].wirf();
		// Wuerfel Nr. 4 werfen, der Klasse "Wuerfel"
		Wuerfel.geworfen();
		// mitteilen, dass die W�rfel geworfen wurden
		System.out.println("Darf der Spieler nochmal werfen?: ");
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
		// ausgeben, ob der Spieler noch einmal w�rfeln darf
		
		Wuerfel.starteNeueFigur();
		// der Klasse "Wuerfel" mitteilen, dass der Spieler eine
		// neue Figur gestartet hat
		System.out.println("Darf der Spieler nochmal werfen?: ");
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
		// ausgeben, ob der Spieler noch einmal w�rfeln darf

	}
}
