package fachkonzeptklasse;

public class Vierer extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		//nur vierer werden eingetragen
		
		for (int w = 0; w < pAugenZahl.length; w++) {
			if (pAugenZahl[w] == 4) {
				punktzahl += pAugenZahl[w]; 
			}
		}
		istEingetragen = true;
		
	}

}
