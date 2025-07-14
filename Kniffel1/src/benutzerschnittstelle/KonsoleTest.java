package benutzerschnittstelle;

public class KonsoleTest {

	public static void main(String[] args) {
		int pAugenZahl [] = {1,1,2,3,4,2};
		
		boolean dreiGleiche = false;
		int sumDrei [] = {0, 0, 0, 0, 0, 0}; //Zahlen Zähler
		int count = 0;
		
		
		for (int i = 0; i < pAugenZahl.length; i++) {
			int a = pAugenZahl[i]-1;
			sumDrei[a]++;
		}
		
		for (int b = 0; b < sumDrei.length; b++) {
			if (sumDrei[b] >= 3) {
				dreiGleiche = true;
			}
		}
		
		if (dreiGleiche) {
			for (int w = 0; w < pAugenZahl.length; w++) {
				count += pAugenZahl[w];
			}
		}
		
		System.out.println(count);

	}

}
