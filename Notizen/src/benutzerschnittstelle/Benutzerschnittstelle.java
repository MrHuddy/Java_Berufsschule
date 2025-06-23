package benutzerschnittstelle;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import fachkonzept.Notiz;
import steuerung.Steuerung;

@SuppressWarnings("serial")
public class Benutzerschnittstelle extends JFrame
{
	private JPanel contentPane;
	private JLabel lblNotiz;
	private JTextField txtNotiz;
	private JButton btnHinzufuegen;
	private JButton btnAlleAnzeigen;
	private JTextArea txtNotizen;
	private JScrollPane scpNotizen;

	private Steuerung dieSteuerung;

	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Benutzerschnittstelle frame = new Benutzerschnittstelle();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Benutzerschnittstelle()
	{
		setTitle("Notizen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNotiz = new JLabel("Notiz");
		lblNotiz.setBounds(10, 11, 36, 14);
		contentPane.add(lblNotiz);

		txtNotiz = new JTextField();
		txtNotiz.setBounds(45, 8, 223, 20);
		contentPane.add(txtNotiz);
		txtNotiz.setColumns(10);

		btnHinzufuegen = new JButton("hinzufügen");
		btnHinzufuegen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				geklicktHinzufuegen();
			}
		});
		btnHinzufuegen.setBounds(10, 39, 258, 23);
		contentPane.add(btnHinzufuegen);

		btnAlleAnzeigen = new JButton("alle anzeigen");
		btnAlleAnzeigen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				geklicktAlleAnzeigen();
			}
		});
		btnAlleAnzeigen.setBounds(10, 73, 258, 23);
		contentPane.add(btnAlleAnzeigen);

		scpNotizen = new JScrollPane();
		scpNotizen.setBounds(10, 107, 258, 145);
		contentPane.add(scpNotizen);

		txtNotizen = new JTextArea();
		txtNotizen.setBackground(SystemColor.control);
		scpNotizen.setViewportView(txtNotizen);

		dieSteuerung = new Steuerung(this);
	}

	private void geklicktAlleAnzeigen()
	{
		dieSteuerung.geklicktAlleAnzeigen();
		txtNotiz.requestFocusInWindow();
	}

	private void geklicktHinzufuegen()
	{
		String name = txtNotiz.getText();
		if (name.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "Notiz eingeben!");
			txtNotiz.requestFocusInWindow();
			return;
		}
		dieSteuerung.geklicktHinzufuegen(name);
		txtNotiz.setText(null);
		txtNotiz.requestFocusInWindow();
	}

	public void zeigeNotizen(ArrayList<Notiz> pNotizen)
	{
		txtNotizen.setText(null);
		for (int n = 0; n < pNotizen.size(); n++)
		{
			txtNotizen.append(pNotizen.get(n).liesZeitpunkt() + ": "
					+ pNotizen.get(n).liesNotiz() + System.lineSeparator());
		}
		txtNotizen.setCaretPosition(0);
	}
}
