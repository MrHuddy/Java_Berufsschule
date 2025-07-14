package fachkonzept;

public abstract class Figur
{
    protected int punktzahl;
    protected boolean istEingetragen;

    public Figur()
    {
        istEingetragen = false;
        punktzahl = 0;
    }

    public boolean istEingetragen()
    {
        return istEingetragen;
    }

    public int liesPunktzahl()
    {
        return punktzahl;
    }

    public abstract void trageEin(int[] pAugenzahl);
}
