package standard;

public class Drucker implements Beochbachter{

	@Override
	public void passiertEreignis(String pEreignis) {
		System.out.println("Drucker: " + pEreignis);
		
	}

}
