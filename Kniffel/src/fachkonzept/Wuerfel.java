package fachkonzept;

import javax.swing.JOptionPane;

public class Wuerfel {
	private int augenzahl;

	private static int anzahlVersuche = 0;

	public void wirf() {
		augenzahl = (int) (Math.random() * 6) + 1;
	}

	public static boolean darfNochmalWuerfeln() {
		if (anzahlVersuche > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void geworfen() {
		--anzahlVersuche;
	}

	public static void starteNeueFigur() {
		anzahlVersuche = 3;
	}

	public int liesAugenzahl() {
		return augenzahl;
	}
}
