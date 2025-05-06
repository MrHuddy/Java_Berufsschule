package fachkonzept;

public abstract class Haustier {
	private String name;
	
	public Haustier(String pName) {
		name = pName;
	}
	
	public abstract String gibLaut();
	
	public String liesName() {
		return name;
	}
}
