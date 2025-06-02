package benutzerschnittstelle;

import java.awt.Color;
import java.awt.Graphics;

public class RunderGruenerButton extends RunderButton{

	public RunderGruenerButton(String pJButtonText) {
		super(pJButtonText);
		setBackground(Color.green);
		setContentAreaFilled(false);
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
	// sehr einfacher Button, zusätzliche 3D-Effekte möglich
	if (getModel().isArmed()) // falls gedrückt
	{
	g.setColor(Color.YELLOW);
	}
	else
	{
	g.setColor(Color.green);
	}
	g.fillOval(0, 0, getWidth(), getHeight());
	super.paintComponent(g);
	}
	@Override
	protected void paintBorder(Graphics g)
	{
	// sehr einfacher Button, zusätzliche 3D-Effekte möglich
	g.setColor(getForeground());
	g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
	}
}
