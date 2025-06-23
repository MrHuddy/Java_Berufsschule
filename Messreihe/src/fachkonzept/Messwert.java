package fachkonzept;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Messwert {
	
	private LocalDate datum = LocalDate.now();
	private double wert;
	
	public Messwert(double pWert) {
		wert = pWert;
	}
	
	public String liesDatumAlsString() {
		return datum.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}
	
	public double liesWert() {
		return wert;
	}

}
