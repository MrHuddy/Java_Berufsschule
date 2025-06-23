package fachkonzept;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notiz
{
	private String notiz;
	private LocalDateTime zeitpunkt;

	public Notiz(String pNotiz)
	{
		notiz = pNotiz;
		zeitpunkt = LocalDateTime.now();
	}

	public String liesNotiz()
	{
		return notiz;
	}

	public String liesZeitpunkt()
	{
		return zeitpunkt
				.format(DateTimeFormatter.ofPattern("dd.MM. HH:mm"));
	}
}
