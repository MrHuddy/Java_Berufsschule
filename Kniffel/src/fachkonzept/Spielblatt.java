package fachkonzept;

public class Spielblatt {
    private Figur[] dieFigur;

    public Spielblatt() {
        // dieFigur = new Figur[13];
        initFiguren();
    }

    private void initFiguren() {
        dieFigur = new Figur[13];
        dieFigur[0] = new Einser();
        dieFigur[1] = new Zweier();
        dieFigur[2] = new Dreier();
        dieFigur[3] = new Vierer();
        dieFigur[4] = new Fuenfer();
        dieFigur[5] = new Sechser();
        dieFigur[6] = new Dreierpasch();
        dieFigur[7] = new Viererpasch();
        dieFigur[8] = new FullHouse();
        dieFigur[9] = new KleineStrasse();
        dieFigur[10] = new GrosseStrasse();
        dieFigur[11] = new Kniffel();
        dieFigur[12] = new Chance();
    }

    public int ermittleBonus() {
        int punkte = ermittlePunktsummeOben();

        if (punkte > 63) {
            return 35;
        } else {
            return 0;
        }
    }

    public int ermittleEndsumme() {
        return (ermittlePunktsummeObenMitBonus() + ermittlePunktsummeUnten());
    }

    public int ermittlePunktsummeOben() {
        int punkte = 0;

        for (int i = 0; i < 6; i++) {
            punkte += dieFigur[i].punktzahl;
        }

        return punkte;
    }

    public int ermittlePunktsummeObenMitBonus() {
        return (ermittlePunktsummeOben() + ermittleBonus());
    }

    public int ermittlePunktsummeUnten() {
        int punkte = 0;

        for (int i = 6; i < dieFigur.length; i++) {
            punkte += dieFigur[i].punktzahl;
        }

        return punkte;
    }

    public boolean istBeendetSpiel() {
        for (int i = 0; i < dieFigur.length; i++) {
            if (!dieFigur[i].istEingetragen) {
                return false;
            }
        }
        return true;
    }

    public void starteSpielNeu() {
        initFiguren();
    }

    public void trageEin(int pFigurNr, int[] pAugenzahl) throws Exception {
        if (!dieFigur[pFigurNr].istEingetragen)
            dieFigur[pFigurNr].trageEin(pAugenzahl);
        else
            throw new Exception("Figur bereits eingetragen");
    }

    public int liesPunktzahlFigur(int pFigurNr) {
        return dieFigur[pFigurNr].punktzahl;
    }

    public boolean istEingetragen(int pFigurNr) {
        return dieFigur[pFigurNr].istEingetragen;
    }
}
