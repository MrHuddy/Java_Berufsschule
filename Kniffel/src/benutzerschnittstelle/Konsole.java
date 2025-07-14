package benutzerschnittstelle;

import fachkonzept.Dreierpasch;
import fachkonzept.Figur;
import fachkonzept.Kniffel;
import fachkonzept.Sechser;

public class Konsole
{
	public static void main(String[] args)
	{
		int[] augenzahlen = new int[] {6, 3, 6, 5, 6};
		Figur dieFigur = new Sechser();

		dieFigur.trageEin(augenzahlen);

		System.out.println(dieFigur.liesPunktzahl());

		Figur dreierPasch = new Dreierpasch();

		dreierPasch.trageEin(augenzahlen);

		System.out.println(dreierPasch.liesPunktzahl());

		Figur kniffel = new Kniffel();

		kniffel.trageEin(augenzahlen);
		System.out.println(kniffel.liesPunktzahl());
	}
}
