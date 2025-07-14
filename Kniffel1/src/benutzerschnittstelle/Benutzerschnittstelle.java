package benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fachkonzeptklasse.Endstand;
import steuerung.Steuerung;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Benutzerschnittstelle extends JFrame {

	private Steuerung dieSteuerung;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEinser;
	private JTextField txtZweier;
	private JTextField txtDreier;
	private JTextField txtVierer;
	private JTextField txtfuenfer;
	private JTextField txtSechser;
	private JTextField txtDreierpasch;
	private JTextField txtViererpasch;
	private JTextField txtFullHouse;
	private JTextField txtKlStr;
	private JTextField txtGrStr;
	private JTextField txtKniffel;
	private JTextField txtChance;
	private JTextField txtSummeUnten;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtEndsumme;

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
		setBounds(100, 100, 621, 540);
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
		
		JButton btnNeuesSpiel = new JButton("neues Spiel");
		btnNeuesSpiel.setBounds(23, 385, 117, 29);
		contentPane.add(btnNeuesSpiel);
		
		JRadioButton rbtEinser = new JRadioButton("1er");
		rbtEinser.setBounds(284, 5, 52, 23);
		contentPane.add(rbtEinser);
		
		JRadioButton rbtZweier = new JRadioButton("2er");
		rbtZweier.setBounds(284, 30, 52, 23);
		contentPane.add(rbtZweier);
		
		JRadioButton rbtDreier = new JRadioButton("3er");
		rbtDreier.setBounds(284, 55, 52, 23);
		contentPane.add(rbtDreier);
		
		JRadioButton rbtVierer = new JRadioButton("4er");
		rbtVierer.setBounds(284, 80, 52, 23);
		contentPane.add(rbtVierer);
		
		JRadioButton rbtFuenfer = new JRadioButton("5er");
		rbtFuenfer.setBounds(284, 105, 52, 23);
		contentPane.add(rbtFuenfer);
		
		JRadioButton rbtSechser = new JRadioButton("6er");
		rbtSechser.setBounds(284, 130, 52, 23);
		contentPane.add(rbtSechser);
		
		JRadioButton rbtDreierPasch = new JRadioButton("Dreierpasch");
		rbtDreierPasch.setBounds(284, 230, 158, 23);
		contentPane.add(rbtDreierPasch);
		
		JRadioButton rbtViererPasch = new JRadioButton("Viererpasch");
		rbtViererPasch.setBounds(284, 255, 130, 23);
		contentPane.add(rbtViererPasch);
		
		JRadioButton rbtFullHouse = new JRadioButton("Full House");
		rbtFullHouse.setBounds(284, 280, 117, 23);
		contentPane.add(rbtFullHouse);
		
		JRadioButton rbtKleineStrasse = new JRadioButton("kl. Straße");
		rbtKleineStrasse.setBounds(284, 305, 117, 23);
		contentPane.add(rbtKleineStrasse);
		
		JRadioButton rbtGrosserStrasse = new JRadioButton("gr. Straße");
		rbtGrosserStrasse.setBounds(284, 330, 92, 23);
		contentPane.add(rbtGrosserStrasse);
		
		JRadioButton rbtKniffel = new JRadioButton("Kniffel");
		rbtKniffel.setBounds(284, 355, 111, 23);
		contentPane.add(rbtKniffel);
		
		JRadioButton rbtChance = new JRadioButton("Chance");
		rbtChance.setBounds(284, 380, 130, 23);
		contentPane.add(rbtChance);
		
		txtEinser = new JTextField();
		txtEinser.setBounds(424, 4, 52, 26);
		contentPane.add(txtEinser);
		txtEinser.setColumns(10);
		
		txtZweier = new JTextField();
		txtZweier.setColumns(10);
		txtZweier.setBounds(424, 29, 52, 26);
		contentPane.add(txtZweier);
		
		txtDreier = new JTextField();
		txtDreier.setColumns(10);
		txtDreier.setBounds(424, 54, 52, 26);
		contentPane.add(txtDreier);
		
		txtVierer = new JTextField();
		txtVierer.setColumns(10);
		txtVierer.setBounds(424, 79, 52, 26);
		contentPane.add(txtVierer);
		
		txtfuenfer = new JTextField();
		txtfuenfer.setColumns(10);
		txtfuenfer.setBounds(424, 104, 52, 26);
		contentPane.add(txtfuenfer);
		
		txtSechser = new JTextField();
		txtSechser.setColumns(10);
		txtSechser.setBounds(424, 129, 52, 26);
		contentPane.add(txtSechser);
		
		txtDreierpasch = new JTextField();
		txtDreierpasch.setColumns(10);
		txtDreierpasch.setBounds(424, 229, 52, 26);
		contentPane.add(txtDreierpasch);
		
		txtViererpasch = new JTextField();
		txtViererpasch.setColumns(10);
		txtViererpasch.setBounds(424, 254, 52, 26);
		contentPane.add(txtViererpasch);
		
		txtFullHouse = new JTextField();
		txtFullHouse.setColumns(10);
		txtFullHouse.setBounds(424, 279, 52, 26);
		contentPane.add(txtFullHouse);
		
		txtKlStr = new JTextField();
		txtKlStr.setColumns(10);
		txtKlStr.setBounds(424, 304, 52, 26);
		contentPane.add(txtKlStr);
		
		txtGrStr = new JTextField();
		txtGrStr.setColumns(10);
		txtGrStr.setBounds(424, 329, 52, 26);
		contentPane.add(txtGrStr);
		
		txtKniffel = new JTextField();
		txtKniffel.setColumns(10);
		txtKniffel.setBounds(424, 354, 52, 26);
		contentPane.add(txtKniffel);
		
		txtChance = new JTextField();
		txtChance.setColumns(10);
		txtChance.setBounds(424, 379, 52, 26);
		contentPane.add(txtChance);
		
		txtSummeUnten = new JTextField();
		txtSummeUnten.setColumns(10);
		txtSummeUnten.setBounds(424, 404, 52, 26);
		contentPane.add(txtSummeUnten);
		
		JLabel lblNewLabel = new JLabel("Summe");
		lblNewLabel.setBounds(312, 153, 52, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(312, 181, 52, 23);
		contentPane.add(lblBonus);
		
		JLabel lblSummeOben = new JLabel("Summe oben");
		lblSummeOben.setBounds(312, 206, 89, 23);
		contentPane.add(lblSummeOben);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(424, 154, 52, 26);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(424, 179, 52, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(424, 204, 52, 26);
		contentPane.add(textField_2);
		
		JLabel lblSummeUnten = new JLabel("Summe unten");
		lblSummeUnten.setBounds(312, 409, 89, 23);
		contentPane.add(lblSummeUnten);
		
		JLabel lblSummeOben_1_1 = new JLabel("Endsumme");
		lblSummeOben_1_1.setBounds(312, 433, 89, 23);
		contentPane.add(lblSummeOben_1_1);
		
		txtEndsumme = new JTextField();
		txtEndsumme.setColumns(10);
		txtEndsumme.setBounds(424, 431, 52, 26);
		contentPane.add(txtEndsumme);

		dieSteuerung = new Steuerung(this);

	}
	public String erfrageSpielername() {
		
	}
	
	private void geklicktEintragen() {
		
	}
	private void geklicktNeuesSpiel() {
		
	}
	private void geklicktWuerfeln() {
		
	}
	public void ZeigeBestenliste(Endstand [] pEndstand) {
		
	}
	public void zeigeGewinnkarte(boolean [] pEingetragen, int [] pPunktzahl) {
		
	}
	public void zeigeWuerfel (int [] pAugenzahl) {
		
	}
}
