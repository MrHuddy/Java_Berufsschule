package fachkonzeptklasse;

public class Kniffel extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		boolean kniffel = true;
		int summe = 0;
		
		for (int i = 0; i < pAugenZahl.length; i++) {
			if (pAugenZahl[0] != pAugenZahl[i]) {
				kniffel = false;
			}
			summe+= pAugenZahl[i];
		}
		if (kniffel) {
			punktzahl = summe;
		}
	}

}
