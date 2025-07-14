package fachkonzeptklasse;

public class FullHouse extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		boolean FullHouse = false;
		int sumFullHouse [] = {0, 0, 0, 0, 0, 0}; //Zahlen Zähler
		int count = 0;
		int summe = 0;
		
		for (int i = 0; i < pAugenZahl.length; i++) {
			int a = pAugenZahl[i]-1;
			sumFullHouse[a]++;
			summe += pAugenZahl[i];
		}
		for (int h = 0; h < sumFullHouse.length; h++) {
			if (sumFullHouse[h] == 0) {
				count++;
			}
		}
		
		if (count == 4) {
			punktzahl = summe;
		}
		
		istEingetragen = true;
		
		
		
	}

}
