package fachkonzeptklasse;

import java.util.ArrayList;

public class ListeS {

	private int heute;
	private int obergrenze;
	ArrayList<Integer> schalt = new ArrayList();

	public ListeS(int heute, int obergrebze) {
		this.heute = heute;
		this.obergrenze = obergrebze;

	}

	public void ermittleSchaltjahrbisOber() {
		for (int i = heute; i < obergrenze; i++) {
			if (pruefenObJahrSchaltjahrist(i) == true) {
				schalt.add(i);
			}
		}
	}

	private boolean pruefenObJahrSchaltjahrist(int pJahr) {
		if (pJahr % 4 == 0) {
			if (pJahr % 400 == 0) {
				return true;
			}
		}
		return false; 
	}

	public ArrayList<Integer> getSchalt() {
		return schalt;
	}
}