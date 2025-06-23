package fachkonzept;

import java.util.ArrayList;

public class Notizenliste
{
	private ArrayList<Notiz> notizen;
	
	public Notizenliste()
	{
		notizen = new ArrayList<>();
	}

	public ArrayList<Notiz> liesNotizen()
	{
		return notizen;
	}

	public void fuegeHinzu(String pNotiz)
	{
		notizen.add(new Notiz(pNotiz));
	}
}
