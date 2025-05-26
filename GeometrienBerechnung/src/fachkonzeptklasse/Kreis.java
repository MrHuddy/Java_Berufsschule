package fachkonzeptklasse;

public class Kreis extends GeometrischeForm{
	private double r; 
	
	public Kreis(double pR) {
		r = pR;
	}
	@Override
	public double berechneFlaesche() {
		return Math.PI * r*r;
	}

	@Override
	public double berechneUmfang() {
		return 2*r*Math.PI;
	}

}
