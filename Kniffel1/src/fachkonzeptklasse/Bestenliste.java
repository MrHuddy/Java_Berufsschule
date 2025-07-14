package fachkonzeptklasse;
import datenspeicherung.*;
public class Bestenliste {

	
	private BestenlisteSpeicher derBestenlisteSpeicher;
	
	public Bestenliste() {
		derBestenlisteSpeicher = new BestenlisteSpeicher();
	}
	
	public Endstand[] liesAlleEndstaende() {
		derBestenlisteSpeicher.liesEndstaendeAusSpeicher();
		return null;
		
	}
	
	public void trageEndstandEin(Endstand pEndstand) {
		derBestenlisteSpeicher.schreibeEndstandInSpeicher(pEndstand);
	}
	
}
