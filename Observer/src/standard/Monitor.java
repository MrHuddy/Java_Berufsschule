package standard;

public class Monitor implements Beochbachter{

	@Override
	public void passiertEreignis(String pEreignis) {
		System.out.println("Monitor: " + pEreignis);
		
	}

}
