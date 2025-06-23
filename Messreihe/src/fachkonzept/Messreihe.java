package fachkonzept;

import java.util.Arrays;

public class Messreihe {

	private Messwert [] derMesswert;
	int i = 0;
	
	public Messreihe() {
		derMesswert = new Messwert[1000];
	}
	
	public void fuegeMesswertHinzu(double pWert) {
		Messwert neuerMesswert = new Messwert(pWert);
		derMesswert[i] = neuerMesswert;
		i++;
	}
	
	public Messwert liesMaximalerWert() {
		if (i == 0) {
			throw new IllegalArgumentException();
		}
		System.out.println(derMesswert.length);
		Messwert max = null;
		for (int j = 0; j < i; j++) {
			if (max == null || derMesswert[j].liesWert() > max.liesWert()) {
				max = derMesswert[j];
			}
		}
		return max;
	}
}
