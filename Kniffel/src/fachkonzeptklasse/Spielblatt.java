package fachkonzeptklasse;

public class Spielblatt {

	private Figur [] dieFigur;
	
	public Spielblatt() {
		dieFigur = new Figur[13];
		dieFigur[0] = new Einser();
		dieFigur[1] = new Zweier();
		dieFigur[2] = new Dreier();
		dieFigur[3] = new Vierer();
		dieFigur[4] = new Fuenfer();
		dieFigur[5] = new Sechser();
		dieFigur[6] = new DreierPasch();
		dieFigur[7] = new ViererPasch();
		dieFigur[8] = new FullHouse();
		dieFigur[9] = new KleineStraße();
		dieFigur[10] = new GroßeStraße();
		dieFigur[11] = new Kniffel();
		dieFigur[12] = new Chance();
	}
	
	public int ermittleBonus() {
		return 0;
	}
	
	public int ermittleEndsumme() {
		return 0;
	}
	
	public int ermittlePunkteSummeOben() {
		return 0;
	}
	
	public int ermittlePunkteSummeObenMitBpnus() {
		return 0;
	}
	
	public int ermittlePunkteSummeUnten() {
		return 0;
	}
	
	public boolean istBeendetSpiel() {
		return false;
	}
	
	public void starteNeuesSpiel() {
		
	}
	
	public void TrageEin(int pFigurNr, int [] pAugenzahl) {
		
	}
}
