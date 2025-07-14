package fachkonzeptklasse;

public class Zweier extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		//nur Zweier werden eingetragen
		
		for (int w = 0; w < pAugenZahl.length; w++) {
			if (pAugenZahl[w] == 2) {
				punktzahl += pAugenZahl[w]; 
			}
		}
		istEingetragen = true;
		
	}

}
