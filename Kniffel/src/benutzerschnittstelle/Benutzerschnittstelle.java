package benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import steuerung.Steuerung;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Benutzerschnittstelle extends JFrame {

	private Steuerung dieSteuerung;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Benutzerschnittstelle frame = new Benutzerschnittstelle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Benutzerschnittstelle() {
		setTitle("Kniffel");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWuerfel1 = new JLabel("New label");
		lblWuerfel1.setBounds(38, 22, 30, 30);
		contentPane.add(lblWuerfel1);
		
		JLabel lblWuerfel2 = new JLabel("New label");
		lblWuerfel2.setBounds(85, 22, 30, 30);
		contentPane.add(lblWuerfel2);
		
		JLabel lblWuerfel3 = new JLabel("New label");
		lblWuerfel3.setBounds(132, 22, 30, 30);
		contentPane.add(lblWuerfel3);
		
		JLabel lblWuerfel4 = new JLabel("New label");
		lblWuerfel4.setBounds(174, 22, 30, 30);
		contentPane.add(lblWuerfel4);
		
		JLabel lblWuerfel5 = new JLabel("New label");
		lblWuerfel5.setBounds(216, 22, 30, 30);
		contentPane.add(lblWuerfel5);
		
		JCheckBox cbxWuerfel1 = new JCheckBox("");
		cbxWuerfel1.setBounds(23, 64, 28, 23);
		contentPane.add(cbxWuerfel1);
		
		JCheckBox cbxWuerfel2 = new JCheckBox("");
		cbxWuerfel2.setBounds(58, 64, 28, 23);
		contentPane.add(cbxWuerfel2);
		
		JCheckBox cbxWuerfel3 = new JCheckBox("");
		cbxWuerfel3.setBounds(95, 64, 28, 23);
		contentPane.add(cbxWuerfel3);
		
		JCheckBox cbxWuerfel4 = new JCheckBox("");
		cbxWuerfel4.setBounds(132, 64, 28, 23);
		contentPane.add(cbxWuerfel4);
		
		JCheckBox cbxWuerfel5 = new JCheckBox("");
		cbxWuerfel5.setBounds(172, 64, 28, 23);
		contentPane.add(cbxWuerfel5);
		
		JButton btnWuerfel = new JButton("Würfeln");
		btnWuerfel.setBounds(23, 99, 117, 29);
		contentPane.add(btnWuerfel);
		
		JButton btnEintragen = new JButton("Eintragen als >>");
		btnEintragen.setBounds(23, 140, 117, 29);
		contentPane.add(btnEintragen);
		
		JTextArea txtBestenliste = new JTextArea();
		txtBestenliste.setBounds(29, 213, 74, 113);
		contentPane.add(txtBestenliste);

		dieSteuerung = new Steuerung(this);
	}
}
