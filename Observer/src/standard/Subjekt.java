package standard;
import java.util.ArrayList;

public abstract class Subjekt {

	//ArrayList<Beochbachter> dasBeochbachter = new ArrayList<Beochbachter>();
	private ArrayList <Beochbachter> dasBeochbachter;
	
	public Subjekt() {
		dasBeochbachter = new ArrayList<Beochbachter>();
	}
	public void entferneBeochbachter(Beochbachter pBeochbachter) {
		dasBeochbachter.remove(pBeochbachter);
	}
	
	public void fuegeHinzuBeochbachter (Beochbachter pBeochbachter) {
		dasBeochbachter.add(pBeochbachter);

	}
	
	protected void informiereAlleBeochbachter(String pErgebnis) {
		for (int i = 0; i < dasBeochbachter.size(); i++) {
			dasBeochbachter.get(i).passiertEreignis(pErgebnis);
		}
	}

}
