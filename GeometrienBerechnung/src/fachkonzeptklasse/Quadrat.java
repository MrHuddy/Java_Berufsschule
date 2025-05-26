package fachkonzeptklasse;

public class Quadrat extends Rechtseck{
	public Quadrat(double pA) {
		super(pA, 0);
	}

	@Override
	public double berechneFlaesche() {
		return a*a;
	}

	@Override
	public double berechneUmfang() {
		return 4*a;
	}
}
