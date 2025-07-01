package standard;

public class Netzwerk implements Beochbachter{

	@Override
	public void passiertEreignis(String pEreignis) {
		System.out.println("Netzwerk: " + pEreignis);
		
	}

}
