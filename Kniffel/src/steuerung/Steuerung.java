package steuerung;

import javax.swing.JCheckBox;

import benutzerschnittstelle.benutzerschnittstelle;
import fachkonzept.Bestenliste;
import fachkonzept.Endstand;
import fachkonzept.Spielblatt;
import fachkonzept.Wuerfel;

public class Steuerung {
    private benutzerschnittstelle dieBenutzerschnittstelle;
    private Wuerfel[] dieWuerfel;
    private Bestenliste dieBestenliste;
    private Spielblatt dasSpielblatt;
    private boolean kannSpeichern;

    public Steuerung(benutzerschnittstelle pBenutzerschnittstelle) {
        dieBenutzerschnittstelle = pBenutzerschnittstelle;
        dieWuerfel = new Wuerfel[5];
        dieBestenliste = new Bestenliste();
        dasSpielblatt = new Spielblatt();

        for (int i = 0; i < dieWuerfel.length; i++) {
            dieWuerfel[i] = new Wuerfel();
        }
        starteNeueFigur();
        dieBenutzerschnittstelle.waehleAlleWuerfelAus();
        dieBenutzerschnittstelle.aktiviereWuerfelauswahl(true);
        dieBenutzerschnittstelle.aktiviereWuerfeln(true);
        dieBenutzerschnittstelle.aktiviereEintragen(false);
        dieBenutzerschnittstelle.zeigeBestenliste(dieBestenliste.liesAlleEndstaende());
    }

    private int[] getAugenzahlen() {
        int[] augenzahlen = new int[dieWuerfel.length];

        for (int i = 0; i < augenzahlen.length; i++) {
            augenzahlen[i] = dieWuerfel[i].liesAugenzahl();
        }

        return augenzahlen;
    }

    public void geklicktEingetragen(int pFigurNr) throws Exception {
        dasSpielblatt.trageEin(pFigurNr, getAugenzahlen());
        starteNeueFigur();
        lasseGewinnkarteAnzeigen();
        dieBenutzerschnittstelle.waehleAlleWuerfelAus();

        if (dasSpielblatt.istBeendetSpiel()) {
            beendeSpiel();
        }
    }

    public void geklicktNeuesSpiel() {
        Wuerfel.starteNeueFigur();
        dasSpielblatt.starteSpielNeu();
        dieBenutzerschnittstelle.waehleAlleWuerfelAus();
        dieBenutzerschnittstelle.aktiviereWuerfelauswahl(true);
        dieBenutzerschnittstelle.aktiviereWuerfeln(true);
        dieBenutzerschnittstelle.aktiviereEintragen(false);
        lasseGewinnkarteAnzeigen();
    }

    public void geklicktWuerfeln(boolean[] pWuerfelWerfen) {
        if (!Wuerfel.darfNochmalWuerfeln()) {
            return;
        }

        dieBenutzerschnittstelle.aktiviereEintragen(true);

        for (int i = 0; i < dieWuerfel.length; i++) {
            if (pWuerfelWerfen[i]) {
                dieWuerfel[i].wirf();
            }
        }
        Wuerfel.geworfen();
        dieBenutzerschnittstelle.zeigeWuerfel(getAugenzahlen());

        if (!Wuerfel.darfNochmalWuerfeln()) {
            dieBenutzerschnittstelle.aktiviereWuerfeln(false);
        }
    }

    private void starteNeueFigur() {
        Wuerfel.starteNeueFigur();
        dieBenutzerschnittstelle.aktiviereEintragen(false);
        dieBenutzerschnittstelle.aktiviereWuerfeln(true);
    }

    private void lasseGewinnkarteAnzeigen() {

        boolean[] istEingetragen = new boolean[13];
        int[] punktzahlenFiguren = new int[17];

        for (int i = 0; i < istEingetragen.length; i++) {
            punktzahlenFiguren[i] = dasSpielblatt.liesPunktzahlFigur(i);
            istEingetragen[i] = dasSpielblatt.istEingetragen(i);
        }

        punktzahlenFiguren[13] = dasSpielblatt.ermittlePunktsummeOben();
        punktzahlenFiguren[14] = dasSpielblatt.ermittleBonus();
        punktzahlenFiguren[15] = dasSpielblatt.ermittlePunktsummeUnten();
        punktzahlenFiguren[16] = dasSpielblatt.ermittleEndsumme();

        dieBenutzerschnittstelle.zeigeGewinnkarte(istEingetragen, punktzahlenFiguren);
    }

    private void beendeSpiel() {
        dieBenutzerschnittstelle.aktiviereEintragen(false);
        dieBenutzerschnittstelle.aktiviereWuerfelauswahl(false);
        dieBenutzerschnittstelle.aktiviereWuerfeln(false);
        dieBenutzerschnittstelle.waehleAlleWuerfelAus();

        aktualiesiereBestenliste();
    }

    private void aktualiesiereBestenliste() {
        String spielerName = dieBenutzerschnittstelle.erfrageSpielername();
        int endstand = dasSpielblatt.ermittleEndsumme();

        Endstand ergebnis = new Endstand(spielerName, endstand);

        dieBestenliste.trageEndstandEin(ergebnis);

        dieBenutzerschnittstelle.zeigeBestenliste(dieBestenliste.liesAlleEndstaende());
    }
}
