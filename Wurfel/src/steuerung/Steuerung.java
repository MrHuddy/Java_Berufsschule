package steuerung;

import fachkonzept.Wuerfel;
import benutzerschnittstelle.Benutzerschnittstelle;

public class Steuerung
{
	private Benutzerschnittstelle dieBenutzerschnittstelle;
	private Wuerfel derWuerfel;
	
	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle, Wuerfel pWuerfel)
	{
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
		derWuerfel = pWuerfel;
		geklicktWuerfeln();
	}
	
	public void geklicktWuerfeln()
	{
		dieBenutzerschnittstelle.zeigeWuerfel(derWuerfel.wirf());
	}
}
