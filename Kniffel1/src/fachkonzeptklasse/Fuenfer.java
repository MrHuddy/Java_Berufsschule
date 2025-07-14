package fachkonzeptklasse;

public class Fuenfer extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		//nur fuenfer werden eingetragen
		
		for (int w = 0; w < pAugenZahl.length; w++) {
			if (pAugenZahl[w] == 5) {
				punktzahl += pAugenZahl[w]; 
			}
		}
		istEingetragen = true;
		
	}

}
