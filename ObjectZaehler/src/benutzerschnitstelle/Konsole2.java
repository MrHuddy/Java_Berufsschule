//package benutzerschnitstelle;
//import java.io.*;
//
//public class Konsole2 implements AutoCloseable {
//
//	public Konsole2() {
//		System.out.println("Resource acquired.");
//	}
//
//	@Override
//	public void close() {
//		System.out.println("Resource released.");
//	}
//
//	public static void main(String[] args) {
//		try (Konsole2 resource = new Konsole2()) {
//			System.out.println("Using the resource.");
//		} // close() is automatically called here
//		System.out.println("End of program.");
//	}
//}


package benutzerschnitstelle;
import fachkonzept.DBSession;

public class Konsole2 {

	public static void main(String[] args) throws Exception {
		
		System.out.println(DBSession.liesAnzahlSession());
		
		try (DBSession dieSession = new DBSession("Test")){
			System.out.println("MittenDrin: " + DBSession.liesAnzahlSession());
			System.out.println(dieSession.liesBenutzername());
			try (DBSession dieSession2 = new DBSession("Test2")) {
				System.out.println("MittenDrin: " + DBSession.liesAnzahlSession());
			}
			System.out.println("MittenDrin: " + DBSession.liesAnzahlSession());
		}

		
		System.out.println("Am Ende: " + DBSession.liesAnzahlSession());	

//		DBSession dieSession = new DBSession("Leon");
//		DBSession dieSession2 = new DBSession("Hudi");
//		System.out.println(DBSession.liesAnzahlSession());
//		//dieSession = null;
//		//dieSession2 = null;
//		//System.gc();
//		System.out.println(dieSession.liesBenutzername());
//		System.out.println(DBSession.liesAnzahlSession());
//		
//		
//		System.out.println("NEU:---------------");
//		
//		DBSession dieSession3 = new DBSession("Leon");
//		dieSession3.liesBenutzername();
//		System.out.println(DBSession.liesAnzahlSession());
//		dieSession3.loescheSeassionCount(dieSession3);
//		System.out.println(dieSession3.liesBenutzername());
//		System.out.println(DBSession.liesAnzahlSession());
	}

}
