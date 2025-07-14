package fachkonzept;

import datenspeicherung.BestenlisteSpeicher;

public class Bestenliste {
    private BestenlisteSpeicher derBestenlisteSpeicher;

    public Bestenliste() {
        derBestenlisteSpeicher = new BestenlisteSpeicher();
    }

    public Endstand[] liesAlleEndstaende() {
        try {

            return derBestenlisteSpeicher.liesEndtstaendeAusSpeicher();
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    public void trageEndstandEin(Endstand pEndstand) {
        try {

            derBestenlisteSpeicher.schreibeEndstandInSpeicher(pEndstand);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
