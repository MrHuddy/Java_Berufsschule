package fachkonzept;

public class Einser extends Figur
{
    public void trageEin(int[] pAugenzahl)
    {
        // nur 1er werden eingetragen

        for (int w = 0; w < pAugenzahl.length; w++)
        {
            if (pAugenzahl[w] == 1)
            {
                punktzahl += pAugenzahl[w];
            }
        }
        istEingetragen = true;
    }
}
