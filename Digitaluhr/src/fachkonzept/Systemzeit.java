package fachkonzept;

import java.util.Calendar;

public class Systemzeit
{
	private boolean format24Std;

	public Systemzeit()
	{
		format24Std = true;
	}

	public int liesMinuten()
	{
		Calendar kalender = Calendar.getInstance();
		return kalender.get(Calendar.MINUTE);
	}

	public int liesSekunden()
	{
		Calendar kalender = Calendar.getInstance();
		return kalender.get(Calendar.SECOND);
	}

	public int liesStunden()
	{
		Calendar kalender = Calendar.getInstance();
		if (format24Std)
		{
			return kalender.get(Calendar.HOUR_OF_DAY);
		}
		else
		{
			return kalender.get(Calendar.HOUR);
		}
	}

	public String liesAMPM()
	{
		if (format24Std)
		{
			return "";
		}
		else
		{
			Calendar kalender = Calendar.getInstance();
			if (kalender.get(Calendar.AM_PM) == Calendar.AM)
			{
				return "AM";
			}
			else
			{
				return "PM";
			}
		}
	}

	public void schalteUmFormat()
	{
		if (format24Std)
		{
			format24Std = false;
		}
		else
		{
			format24Std = true;
		}
	}
}
