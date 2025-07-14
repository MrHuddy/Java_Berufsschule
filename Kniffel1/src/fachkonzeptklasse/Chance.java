package fachkonzeptklasse;

public class Chance extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
	
		for (int i = 0; i < pAugenZahl.length; i++) {
			punktzahl += pAugenZahl[i];
		}
		istEingetragen = true;
		
	}

}
