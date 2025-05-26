package fachkonzeptklasse;

public class Rechtseck extends GeometrischeForm{
	protected double a;
	private double b;

	public Rechtseck(double pA, double pB) {
		a = pA; 
		b = pB;
	}
	
	@Override
	public double berechneFlaesche() {
		return a*b;
	}

	@Override
	public double berechneUmfang() {
		return 2*a + 2*b;
	}

}
