package benutzerschnittstelle;
import fachkonzept.*;
public class Konsole {

	public static void main(String[] args) {

		Hund Bello = new Hund("Bello");
		Katze Felix = new Katze("Felix");
		Vogel Lora = new Vogel("Lora");
		Katze Cleo = new Katze("Cleo");
		Hund Hasso = new Hund("Hasso");
		
		Haustier [] dasHaustier = {Bello, Felix, Lora, Cleo, Hasso};
		
		for (int i = 0; i<dasHaustier.length; i++) {
			System.out.println(dasHaustier[i].liesName() + " sagt: " + dasHaustier[i].gibLaut());
		}
		
        Haustier[] haustiere = {
                new Hund("Bello"),
                new Katze("Felix"),
                new Vogel("Lora"),
                new Katze("Cleo"),
                new Hund("Hasso")
            };

            for (Haustier tier : haustiere) {
                System.out.println(tier.liesName() + " sagt: " + tier.gibLaut());
            }
            
            System.out.println();
            System.out.println(Bello.getClass().getSuperclass());

	}

}
