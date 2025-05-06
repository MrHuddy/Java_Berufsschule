package benutzerschnittstelle;

import fachkonzept.*;

public class Konsole
{
	public static void main(String[] args)
	{
		// Objekt "meinDokument" der Klasse "CSV-Dokument" erzeugen
		CSVDokument meinDokument = new CSVDokument();
		// Objekt "meinDrucker" der Klasse "Drucker" erzeugen
		Drucker meinDrucker = new Drucker();
		// "meinDrucker" druckt "meinDokument"
		meinDrucker.drucke(meinDokument);
	}
}
