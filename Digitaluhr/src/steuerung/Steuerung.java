package steuerung;

import java.util.Timer;
import java.util.TimerTask;

import benutzerschnittstelle.Benutzerschnittstelle;

public class Steuerung
{
	private Benutzerschnittstelle dieBenutzerschnittstelle;
	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle)
	{
		boolean imHintergrund = true;
		Timer t = new Timer(imHintergrund);
		int verzoegerung = 0;
		int frequenzMillisekunden = 1000;
		t.schedule(new TimerAufgabe(), verzoegerung, frequenzMillisekunden);
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
	}

	class TimerAufgabe extends TimerTask
	{
		public void run()
		{
			liesSystemzeit();
		}
	}
	
	public void geklicktFormatUmschalten()
	{
		// TO DO: Systemzeit Format umschalten lassen
	}

	private void liesSystemzeit()
	{
		// TO DO: Stunden, Minuten, Sekunden sowie AM/PM der Systemzeit lesen
		// TO DO: Benutzerschnittstelle die Uhrzeit darstelllen lassen
	}
}
