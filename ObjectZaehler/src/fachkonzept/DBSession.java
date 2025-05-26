package fachkonzept;

public class DBSession {
	
	private static int anzahlSession=0;
	private String benutzername;
	
	public DBSession(String pBenutzername) {
		anzahlSession++;
		benutzername = pBenutzername;
		
	}

	
	
	public static int liesAnzahlSession() {
		return anzahlSession;
	}
	
	public String liesBenutzername() {
		return benutzername;
	}
}
