package benutzerschnittstelle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class RunderButton extends JButton{
	
	public RunderButton (String pJButtonText) {
		super(pJButtonText);
		setContentAreaFilled(false);
	}
	
	protected void paintComponent(Graphics g)
	{
	// sehr einfacher Button, zusätzliche 3D-Effekte möglich
	if (getModel().isArmed()) // falls gedrückt
	{
	g.setColor(Color.lightGray);
	}
	else
	{
	g.setColor(getBackground());
	}
	g.fillOval(0, 0, getWidth(), getHeight());
	super.paintComponent(g);
	}
	protected void paintBorder(Graphics g)
	{
	// sehr einfacher Button, zusätzliche 3D-Effekte möglich
	g.setColor(getForeground());
	g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
	}
}
