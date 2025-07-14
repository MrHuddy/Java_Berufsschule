package fachkonzept;

public class Endstand implements Comparable<Endstand> {
    private String name;
    private int punkte;

    public Endstand(String pName, int pPunkte) {
        name = pName;
        punkte = pPunkte;
    }

    public String liesName() {
        return name;
    }

    public int liesPunkte() {
        return punkte;
    }

    @Override
    public int compareTo(Endstand compare) {
        return compare.punkte - this.punkte;
    }
}
