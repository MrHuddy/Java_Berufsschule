package steuerung;

import java.util.Timer;
import java.util.TimerTask;

import Benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzept.Systemzeit;

public class Steuerung
{
	private Benutzerschnittstelle dieBenutzerschnittstelle;
	private Systemzeit dieSystemzeit;
	public Steuerung(Benutzerschnittstelle pBenutzerschnittstelle)
	{
		dieBenutzerschnittstelle = pBenutzerschnittstelle;
		dieSystemzeit = new Systemzeit();
		boolean imHintergrund = true;
		Timer t = new Timer(imHintergrund);
		int verzoegerung = 0;
		int frequenzMillisekunden = 1000;
		t.schedule(new TimerAufgabe(), verzoegerung, frequenzMillisekunden);

		
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
		dieSystemzeit.schalteUmFormat();
	}

	private void liesSystemzeit()
	{
		int stunden = dieSystemzeit.liesStunden();
		int minuten = dieSystemzeit.liesMinuten();
		int sekunden = dieSystemzeit.liesSekunden();
		String ampm = dieSystemzeit.liesAMPM();
		dieBenutzerschnittstelle.stelleDarUhrzeit(stunden, minuten, sekunden, ampm);
		// TO DO: Stunden, Minuten, Sekunden sowie AM/PM der Systemzeit lesen
		// TO DO: Benutzerschnittstelle die Uhrzeit darstelllen lassen
	}
}
