package fachkonzept;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class DruckbaresDokument{
	private LocalDateTime zeitPunktGedruckt;
	
	public void gedruckt() {
		this.zeitPunktGedruckt=LocalDateTime.now();
	}
	
	public String liesZeitpunktGedruckt() {
		return zeitPunktGedruckt.toString();
	}
	
	public abstract String liesInhaltAlsText();
	
}
