package benutzerschnitstelle;
import fachkonzept.DBSession;

public class Konsole {

	public static void main(String[] args) {
		
		System.out.println(DBSession.liesAnzahlSession());
		
		DBSession DieSession = new DBSession("Hudi");
		DBSession DieSession2 = new DBSession("Leon");
		DBSession DieSession3 = new DBSession("Paul");
		
		System.out.println(DBSession.liesAnzahlSession());
		System.out.println(DieSession.liesBenutzername());
		System.out.println(DieSession2.liesAnzahlSession());
	
		//lol xD

	}

}
