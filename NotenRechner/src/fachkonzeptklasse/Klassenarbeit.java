package fachkonzeptklasse;

public class Klassenarbeit {

	private double punkteErreicht;
	private double punkteMaximal;
	private double Note;

	public double ermittleNote() {
		Note = 6 - 5 * (punkteErreicht / punkteMaximal);
		return Note;
	} //fehler Handling lieber in der Fachkonzept ebene.
	// es hängt ja vom Fachprogramm / anwendungslogik es kann grundsätzlich -10 rein, 
	//aber es liegt am Anwendung, dass eine minus zahl falsch ist.
	// in den Attribute dürfen in keinster fall einen falschen Wert Initalisert werden.

	public double ermittleNote(int pAnzahlNachkommaStellen) {
		Note = ermittleNote();
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
