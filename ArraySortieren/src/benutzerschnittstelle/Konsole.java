package benutzerschnittstelle;

import fachkonzept.Liste;

public class Konsole
{
	public static void main(String[] args)
	{
		int[] listeU = {5, 12, 6, 9, 8, 12, 3};

		System.out.println("vor Sortierung:");
		for (int z = 0; z < listeU.length; z++)
		{
			System.out.println(listeU[z] + " ");
		}

		Liste liste = new Liste();
		int[] listeS = liste.listeGanzerZahlenAufsteigendSortieren(listeU);

		System.out.println("nach Sortierung:");
		for (int z = 0; z < listeS.length; z++)
		{
			System.out.println(listeS[z] + " ");
		}
	}
}
