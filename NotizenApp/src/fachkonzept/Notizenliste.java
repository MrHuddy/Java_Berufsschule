package fachkonzept;

import java.util.ArrayList;

public class Notizenliste
{
	private static final Notizenliste OBJ = new Notizenliste();
	private ArrayList<Notiz> notizen;
	
	private Notizenliste()
	{
		notizen = new ArrayList<>();
	}

	public static Notizenliste GetInstance() {
		return OBJ;
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
