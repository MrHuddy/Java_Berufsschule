package steuerung;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzeptklasse.*;

public class Steuerung {
	private Wuerfel [] derWuerfel;
	private Spielblatt dasSpielblatt;
	private Bestenliste dieBestenliste;
	private Benutzerschnittstelle dieBenutzerschnittstelle;
	
	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle) {
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
		
		derWuerfel = new Wuerfel[5];
		for (int i = 0; i<derWuerfel.length; i++) {
			derWuerfel[i] = new Wuerfel();
		}
		
		dasSpielblatt = new Spielblatt();
		
		dieBestenliste = new Bestenliste();
	}
	
	public void geklicktEintragen(int pFigurNr) {
		//dasSpielblatt.TrageEin(pFigurNr, dieBenutzerschnittstelle.zeigeWuerfel());
	}
	
	public void geklicktNeuesSpiel() {
		dasSpielblatt.starteNeuesSpiel();
	}
	
	public void geklicktWuerfeln(boolean [] pWuerfelWerfen) {
		int [] wuerfelZahl = new int[5];
		for (int i = 0; i < derWuerfel.length; i++) {
			if (pWuerfelWerfen[i] == true || Wuerfel.darfNochmalWuerfelnAktFigur() == true) {
				derWuerfel[i].wirf();
				Wuerfel.geworfen();
				wuerfelZahl[i] = derWuerfel[i].getAugenzahl();
				
			}else {
				//TODO Exeption
			}
			dieBenutzerschnittstelle.zeigeWuerfel(wuerfelZahl);
		}
	}
}
