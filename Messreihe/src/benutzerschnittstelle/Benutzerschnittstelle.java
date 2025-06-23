package benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fachkonzept.Messwert;
import steuerung.Steuerung;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Benutzerschnittstelle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Steuerung dieSteuerung; 
	private JTextField txtMesswert;
	private JTextField txtMaxWert;
	private JTextField txtDatum;

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
		setTitle("Messreihe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Messwert");
		lblNewLabel.setBounds(21, 22, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblMaxWert = new JLabel("max. Wert");
		lblMaxWert.setBounds(21, 94, 102, 16);
		contentPane.add(lblMaxWert);
		
		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setBounds(21, 122, 61, 16);
		contentPane.add(lblDatum);
		
		txtMesswert = new JTextField();
		txtMesswert.setBounds(140, 17, 130, 26);
		contentPane.add(txtMesswert);
		txtMesswert.setColumns(10);
		
		JButton btnNewButton = new JButton("Hinzufügen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				geklicktHinzufuegen();
			}
		});

		btnNewButton.setBounds(21, 53, 249, 29);
		contentPane.add(btnNewButton);
		
		txtMaxWert = new JTextField();
		txtMaxWert.setBounds(140, 89, 130, 26);
		contentPane.add(txtMaxWert);
		txtMaxWert.setColumns(10);
		
		txtDatum = new JTextField();
		txtDatum.setBounds(140, 117, 130, 26);
		contentPane.add(txtDatum);
		txtDatum.setColumns(10);
		dieSteuerung = new Steuerung (this);
	}
	
	private void geklicktHinzufuegen() {
		dieSteuerung.geklicktHinzufuegen(Double.parseDouble(txtMesswert.getText()));
		
	}
	
	public void zeigeMaximum(Messwert pMesswert) {
		txtMaxWert.setText(Double.toString(pMesswert.liesWert()));
		txtDatum.setText(pMesswert.liesDatumAlsString());
	}
}
