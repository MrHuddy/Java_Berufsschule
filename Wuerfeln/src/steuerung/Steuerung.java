package steuerung;

import fachkonzept.Wuerfel;
import benutzerschnittstelle.Benutzerschnittstelle;

public class Steuerung
{
	private Benutzerschnittstelle dieBenutzerschnittstelle;
	private Wuerfel derWuerfel;
	
	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle)
	{
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
		derWuerfel = new Wuerfel();
		geklicktWuerfeln();
	}
	
	public void geklicktWuerfeln()
	{
		dieBenutzerschnittstelle.zeigeWuerfel(derWuerfel.wirf());
	}
}
