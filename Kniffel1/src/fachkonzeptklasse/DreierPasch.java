package fachkonzeptklasse;

public class DreierPasch extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		boolean dreiGleiche = false;
		int sumDrei [] = {0, 0, 0, 0, 0, 0}; //Zahlen Zähler
		int count = 0;
		
		for (int i = 0; i < pAugenZahl.length; i++) {
			int a = pAugenZahl[i]-1;
			sumDrei[a]++;
		}
		
		for (int b = 0; b < sumDrei.length; b++) {
			if (sumDrei[b] >= 3) {
				dreiGleiche = true;
			}
		}
		
		if (dreiGleiche) {
			for (int w = 0; w < pAugenZahl.length; w++) {
				punktzahl += pAugenZahl[w];
			}
		}
		istEingetragen = true;

		
	}

}
