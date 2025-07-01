package standard;

public class Konsole {

	public static void main(String[] args) {
		
		Log log = new Log();
		Monitor monitor = new Monitor();
		Netzwerk netzwerk = new Netzwerk();
		Maschine maschine = new Maschine();
		Drucker drucker = new Drucker();
		
		maschine.fuegeHinzuBeochbachter(log);
		maschine.fuegeHinzuBeochbachter(netzwerk);
		maschine.fuegeHinzuBeochbachter(monitor);
		maschine.fuegeHinzuBeochbachter(drucker);
		
		maschine.starte();

	}

}
