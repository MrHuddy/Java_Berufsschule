package fachkonzept;

public class Chance extends Figur
{
    public void trageEin(int[] pAugenzahl)
    {
        for (int i : pAugenzahl)
        {
            punktzahl += i;
        }

        istEingetragen = true;
    }

}
