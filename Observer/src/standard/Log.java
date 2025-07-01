package standard;

public class Log implements Beochbachter{

	@Override
	public void passiertEreignis(String pEreignis) {
		System.out.println("Log: " + pEreignis);		
	}

}
