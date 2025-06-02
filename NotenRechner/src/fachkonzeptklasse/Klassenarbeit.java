package fachkonzeptklasse;

public class Klassenarbeit {

	private double punkteErreicht;
	private double punkteMaximal;
	private double Note;

	public double ermittleNote() {
		Note = 6 - 5 * (punkteErreicht / punkteMaximal);
		return Note;
	}

	public double ermittleNote(int pAnzahlNachkommaStellen) {
		Note = 6 - 5 * (punkteErreicht / punkteMaximal);
		if (pAnzahlNachkommaStellen == 0) {
			return Math.round(Note);
		} else {
			double faktor = Math.pow(10, pAnzahlNachkommaStellen);
			return (int) (Note * faktor) / faktor;
		}

	}

	public Klassenarbeit(double pPunkteErreicht, double pPunkteMaximal) {
		punkteErreicht = pPunkteErreicht;
		punkteMaximal = pPunkteMaximal;
	}
}
