package fachkonzeptklasse;

public class GroßeStraße extends Figur {

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		boolean dreiGleiche = false;
		int sumStrasse [] = {0, 0, 0, 0, 0, 0}; //Zahlen Zählerint
		int summe = 0;
		int count = 0;
		
		for (int i = 0; i < pAugenZahl.length; i++) {
			int a = pAugenZahl[i]-1;
			sumStrasse[a]++;
			summe +=pAugenZahl[i];
		}
		
		for (int s = 0; s < sumStrasse.length; s++) {
			if (sumStrasse[s] == 1) {
				count++;
			}
		}
		
		if (count == 5) {
			punktzahl = summe;
		}
		istEingetragen = true;
		
	}

}
