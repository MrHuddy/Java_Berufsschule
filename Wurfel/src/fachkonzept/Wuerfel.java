package fachkonzept;

public class Wuerfel
{
	public int wirf()
	{
		return (int) (Math.random() * 6) + 1;
	}
}
