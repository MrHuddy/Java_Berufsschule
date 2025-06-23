package steuerung;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzept.Messreihe;

public class Steuerung {
	
	private Benutzerschnittstelle dieBenutzerschnittstelle;
	private Messreihe dieMessreihe;
	
	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle) {
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
		dieMessreihe = new Messreihe();
	}
	
	public void geklicktHinzufuegen(double pWert) {
		dieMessreihe.fuegeMesswertHinzu(pWert);
		dieBenutzerschnittstelle.zeigeMaximum(dieMessreihe.liesMaximalerWert());
	}

}
