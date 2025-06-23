package steuerung;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzept.Notizenliste;

public class Steuerung
{
	private Benutzerschnittstelle dieBenutzerschnittstelle;

	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle)
	{
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
	}

	public void geklicktAlleAnzeigen()
	{
		Notizenliste dieNotizenliste = new Notizenliste();
		dieBenutzerschnittstelle
				.zeigeNotizen(dieNotizenliste.liesNotizen());
	}

	public void geklicktHinzufuegen(String pNotiz)
	{
		Notizenliste dieNotizenliste = new Notizenliste();
		dieNotizenliste.fuegeHinzu(pNotiz);
	}
}
