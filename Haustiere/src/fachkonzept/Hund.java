package fachkonzept;

public class Hund extends Haustier {

	public Hund(String pName) {
		super(pName);
		
	}

	@Override
	public String gibLaut() {
		
		return "wau";
	}

}
