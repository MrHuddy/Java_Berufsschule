package fachkonzeptklasse;

public class Sechser extends Figur{

	@Override
	public void trageEin(int[] pAugenZahl) {
		
		//nur Sechser werden eingetragen
		
		for (int w = 0; w < pAugenZahl.length; w++) {
			if (pAugenZahl[w] == 1) {
				punktzahl += pAugenZahl[w]; 
			}
		}
		istEingetragen = true;
		
	}

}
