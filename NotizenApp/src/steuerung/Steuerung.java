package steuerung;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzept.Notizenliste;

public class Steuerung
{
	private Notizenliste dieNotizenliste;
	
	private Benutzerschnittstelle dieBenutzerschnittstelle;

	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle)
	{
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
		dieNotizenliste = Notizenliste.GetInstance();
	}

	public void geklicktAlleAnzeigen()
	{
		//Notizenliste dieNotizenliste = new Notizenliste();
		dieBenutzerschnittstelle.zeigeNotizen(dieNotizenliste.liesNotizen());
	}

	public void geklicktHinzufuegen(String pNotiz)
	{
		//Notizenliste dieNotizenliste = new Notizenliste();
		dieNotizenliste.fuegeHinzu(pNotiz);
	}
}
