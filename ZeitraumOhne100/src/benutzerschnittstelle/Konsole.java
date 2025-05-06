package benutzerschnittstelle;

import fachkonzeptklasse.ListeS;

public class Konsole {

	public static void main(String[] args) {
		
		int heute = 2028;
		int obergrenze = 2110;
		
		ListeS schaltjahr = new ListeS(heute, obergrenze);
		schaltjahr.ermittleSchaltjahrbisOber();
		System.out.println(schaltjahr.getSchalt());

	}

}
