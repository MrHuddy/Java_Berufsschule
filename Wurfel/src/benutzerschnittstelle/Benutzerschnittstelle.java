package benutzerschnittstelle;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import steuerung.Steuerung;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class Benutzerschnittstelle extends JFrame
{
	private JPanel contentPane;
	private JLabel lblWuerfel;

	private Steuerung dieSteuerung;

	public static void main(String[] args)
	{
		
	}

	public Benutzerschnittstelle()
	{
		setResizable(false);
		setTitle("w\u00FCrfeln");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblWuerfel = new JLabel("");
		lblWuerfel.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				geklicktWuerfeln();
			}
		});
		lblWuerfel.setIcon(null);
		lblWuerfel.setBounds(10, 11, 250, 250);
		contentPane.add(lblWuerfel);

	}

	private void geklicktWuerfeln()
	{
		dieSteuerung.geklicktWuerfeln();
	}

	public void zeigeWuerfel(int pAugenzahl)
	{
		String dateiname = "/benutzerschnittstelle/Wuerfel" + pAugenzahl
				+ ".png";
		ImageIcon icon = new ImageIcon(
				Benutzerschnittstelle.class.getResource(dateiname));
		Image img = icon.getImage().getScaledInstance(lblWuerfel.getWidth(),
				lblWuerfel.getHeight(), java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		lblWuerfel.setIcon(icon);
	}
	
	public void setzeSteuerung(Steuerung pSteuerung) {
		dieSteuerung = pSteuerung;
	}
}
