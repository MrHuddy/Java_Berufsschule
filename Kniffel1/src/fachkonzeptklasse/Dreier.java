package fachkonzeptklasse;

public class Dreier extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		//nur Dreier werden eingetragen
		
		for (int w = 0; w < pAugenZahl.length; w++) {
			if (pAugenZahl[w] == 3) {
				punktzahl += pAugenZahl[w]; 
			}
		}
		istEingetragen = true;
		
	}

}
