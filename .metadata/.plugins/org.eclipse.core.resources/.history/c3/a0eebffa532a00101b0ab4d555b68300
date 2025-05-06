package fachkonzept;

public class Flaeche implements Comparable<Flaeche> {
	
	private String name;
	private double breite;
	private double laenge;
	
	@Override
	public int compareTo(Flaeche pFlache) {
		return (int) (breite*laenge - pFlache.liesBreite() - +pFlache.liesLaenge());
	}
	/*
	 * Sehr Wichtig! Neues! Das ist eine Interface, welches für Arrays.Sort() zuständig ist
	 * Wenn man Nummer etc vergleicht und sortiert, es kann aber keine Objekte vergleichen, weil der
	 * Sortierer nicht weißt was er vegleichen soll. 
	 * Deswegen ist genau diesen Interface dafür zuständig, diese muss so implementiert werden und man 
	 * verlgeicht in diesem Fall die Fläche miteinander.
	 */
	public Flaeche(String pName, double pBreite, double pLaenge) {
		this.name = pName;
		this.breite = pBreite;
		this.laenge = pLaenge;
	}
	
	public String liesName() {
		return name;
	}

	public double liesBreite() {
		return breite;
	}

	public double liesLaenge() {
		return laenge;
	}

}
