package fachkonzeptklasse;

public class ViererPasch extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		boolean vierGleiche = false;
		int sumVier [] = {0, 0, 0, 0, 0, 0}; //Zahlen Zähler
		
		for (int i = 0; i < pAugenZahl.length; i++) {
			int a = pAugenZahl[i]-1;
			sumVier[a]++;
		}
		
		for (int b = 0; b < sumVier.length; b++) {
			if (sumVier[b] >= 4) {
				vierGleiche = true;
			}
		}
		
		if (vierGleiche) {
			for (int w = 0; w < pAugenZahl.length; w++) {
				punktzahl += pAugenZahl[w];
			}
		}
		istEingetragen = true;
	}

}
