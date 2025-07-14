package fachkonzeptklasse;

public class Spielblatt {

	private Figur [] dieFigur;
	
	public Spielblatt() {
		initFiguren();
	}
	
	private void initFiguren() {
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
		if (ermittlePunkteSummeOben() >= 63) {
			return 35;
		}
		return 0;
	}
	
	public int ermittleEndsumme() {
		int endsumme = 0;
		if (ermittleBonus() == 35) {
			endsumme = ermittlePunkteSummeUnten() + ermittleBonus();
			return endsumme;
		}
		return endsumme;
	}
	
	public int ermittlePunkteSummeOben() {
		int ergebnis = 0;
		for (int i = 0; i < 5; i++) {
			ergebnis = ergebnis + dieFigur[i].liesPunktzahl();
		}
		return ergebnis;
	}
	
	public int ermittlePunkteSummeObenMitBonus() {
		return ermittlePunkteSummeOben() + 35;
	}
	
	public int ermittlePunkteSummeUnten() {
		int summeUnten = 0;
		for (int j = 6; j < dieFigur.length; j++) {
			summeUnten += dieFigur[j].liesPunktzahl();
		}
		return summeUnten;
	}
	
	public boolean istBeendetSpiel() {
		for (int i = 0; i < dieFigur.length; i++) {
			if (!dieFigur[i].istEingetragen) {
				return false;
			}
		}
		return true;
	}
	
	public void starteNeuesSpiel() {
		initFiguren();
	}
	
	public void TrageEin(int pFigurNr, int [] pAugenzahl) {
		if (!dieFigur[pFigurNr].istEingetragen) {
			dieFigur[pFigurNr].trageEin(pAugenzahl);
		}
	}
}
