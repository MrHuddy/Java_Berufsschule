package programm;

import java.awt.EventQueue;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzept.Wuerfel;
import steuerung.Steuerung;

public class Programm {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Benutzerschnittstelle benutzerschnittstelle = new Benutzerschnittstelle();
					// TO DO: Weitere Objekte erzeugen
					Wuerfel wuerfel = new Wuerfel();
					Steuerung steuerung = new Steuerung(benutzerschnittstelle, wuerfel);
					benutzerschnittstelle.setzeSteuerung(steuerung);
					benutzerschnittstelle.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

	}

}
