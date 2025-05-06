package fachkonzept;

public class Liste {
	private final int GESTRICHEN = Integer.MAX_VALUE;
	private int naechsterFreierPlatz = 0;

	public int[] listeGanzerZahlenAufsteigendSortieren(int[] pListeU) {
		int[] listeU = pListeU.clone();
		int[] listeS = new int[listeU.length];
		
		boolean alleGetrichen = pruefenObAlleZahlenAusListeUGestrichenSind(listeU);
		while(alleGetrichen != true) {
			int actKleinsteZahl = listeUNachDerKleinstenZahlDurchsuchen(pListeU);
			kleinsteZahlAnListeSAnhaengen(listeS, actKleinsteZahl);
			kleinsteZahlAusListeUStreichen(pListeU, actKleinsteZahl);
			alleGetrichen= pruefenObAlleZahlenAusListeUGestrichenSind(pListeU);
		}
		return listeS;
	}

	private boolean pruefenObAlleZahlenAusListeUGestrichenSind(int[] pListeU) {
		for(int i = 0; i < pListeU.length; i++) {
			if (pListeU[i] != GESTRICHEN) {
				return false;
			}
		}
		return true;
	}

	private int listeUNachDerKleinstenZahlDurchsuchen(int[] pListeU) {
		int kleinste = GESTRICHEN;
		for (int i = 0; i < pListeU.length; i++) {
			if(pListeU[i] != GESTRICHEN) {
				if(pListeU[i] < kleinste) {
					kleinste = pListeU[i];
				}
			}
		}
		return kleinste;
	}

	private int[] kleinsteZahlAnListeSAnhaengen(int[] pListeS, int pKleinsteZahl) {
		pListeS[naechsterFreierPlatz] = pKleinsteZahl;
		naechsterFreierPlatz++;
		return pListeS;
	}

	private int[] kleinsteZahlAusListeUStreichen(int[] pListeU, int pKleinsteZahl) {
		for (int i = 0; i < pListeU.length; i++) {
			if (pListeU[i] != GESTRICHEN) {
				if (pListeU[i] == pKleinsteZahl) {
					pListeU[i] = GESTRICHEN;
					return pListeU;
				}
			}
		}
		return pListeU;
	}
}
