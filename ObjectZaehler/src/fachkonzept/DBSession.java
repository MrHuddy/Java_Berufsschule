package fachkonzept;

public class DBSession implements AutoCloseable{
	
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



	@Override
	public void close() throws Exception {
		System.out.println("Hier wird geschlossen");
		anzahlSession--;
	}
	
	public void loescheSeassionCount(DBSession pDbSession) {
		anzahlSession = 0;
		pDbSession = null;
		System.gc();
	}
}
