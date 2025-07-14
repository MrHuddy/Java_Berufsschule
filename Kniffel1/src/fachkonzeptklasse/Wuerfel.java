package fachkonzeptklasse;

public class Wuerfel {

	private int augenzahl;
	private static int anzahlVersucheAktFigur = 0;
	
	public static boolean darfNochmalWuerfelnAktFigur() {
		if (anzahlVersucheAktFigur != 3) {
			return true;
		}
		return false;
	}
	
	public void wirf() {
		augenzahl = (int)(Math.random() * 6) + 1;
		
	}
	
	public int getAugenzahl() {
		return augenzahl;
	}
	
	public static void geworfen() {
		anzahlVersucheAktFigur++;
	}
	
	public static void starteNeueFigur() {
		anzahlVersucheAktFigur = 0;
	}
}
