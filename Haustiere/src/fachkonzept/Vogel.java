package fachkonzept;

public class Vogel extends Haustier {

	public Vogel(String pName) {
		super(pName);
		
	}

	@Override
	public String gibLaut() {
		
		return "piep";
	}

}
