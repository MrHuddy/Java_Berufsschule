package fachkonzept;

public class Katze extends Haustier {

	public Katze(String pName) {
		super(pName);
	}

	@Override
	public String gibLaut() {
		return "miau";
	}

}
