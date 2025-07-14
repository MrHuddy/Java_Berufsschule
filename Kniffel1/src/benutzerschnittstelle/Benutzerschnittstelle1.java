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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Benutzerschnittstelle1 extends JFrame {

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
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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
	public Benutzerschnittstelle1() {
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
		rbtEinser.setBounds(284, 6, 52, 23);
		contentPane.add(rbtEinser);
		
		JRadioButton rbtZweier = new JRadioButton("2er");
		rbtZweier.setBounds(284, 51, 52, 23);
		contentPane.add(rbtZweier);
		
		JRadioButton rbtDreier = new JRadioButton("3er");
		rbtDreier.setBounds(284, 100, 52, 23);
		contentPane.add(rbtDreier);
		
		JRadioButton rbtVierer = new JRadioButton("4er");
		rbtVierer.setBounds(284, 141, 52, 23);
		contentPane.add(rbtVierer);
		
		JRadioButton rbtFuenfer = new JRadioButton("5er");
		rbtFuenfer.setBounds(284, 176, 52, 23);
		contentPane.add(rbtFuenfer);
		
		JRadioButton rbtSechser = new JRadioButton("6er");
		rbtSechser.setBounds(284, 213, 52, 23);
		contentPane.add(rbtSechser);
		
		JRadioButton rbtDreierPasch = new JRadioButton("Dreierpasch");
		rbtDreierPasch.setBounds(284, 252, 158, 23);
		contentPane.add(rbtDreierPasch);
		
		JRadioButton rbtViererPasch = new JRadioButton("Viererpasch");
		rbtViererPasch.setBounds(284, 287, 130, 23);
		contentPane.add(rbtViererPasch);
		
		JRadioButton rbtFullHouse = new JRadioButton("Full House");
		rbtFullHouse.setBounds(284, 322, 117, 23);
		contentPane.add(rbtFullHouse);
		
		JRadioButton rbtKleineStrasse = new JRadioButton("kl. Straße");
		rbtKleineStrasse.setBounds(284, 367, 117, 23);
		contentPane.add(rbtKleineStrasse);
		
		JRadioButton rbtGrosserStrasse = new JRadioButton("gr. Straße");
		rbtGrosserStrasse.setBounds(284, 402, 92, 23);
		contentPane.add(rbtGrosserStrasse);
		
		JRadioButton rbtKniffel = new JRadioButton("Kniffel");
		rbtKniffel.setBounds(284, 454, 111, 23);
		contentPane.add(rbtKniffel);
		
		JRadioButton rbtChance = new JRadioButton("Chance");
		rbtChance.setBounds(284, 483, 130, 23);
		contentPane.add(rbtChance);
		
		txtEinser = new JTextField();
		txtEinser.setBounds(517, 5, 52, 26);
		contentPane.add(txtEinser);
		txtEinser.setColumns(10);
		
		txtZweier = new JTextField();
		txtZweier.setColumns(10);
		txtZweier.setBounds(517, 50, 52, 26);
		contentPane.add(txtZweier);
		
		txtDreier = new JTextField();
		txtDreier.setColumns(10);
		txtDreier.setBounds(517, 82, 52, 26);
		contentPane.add(txtDreier);
		
		txtVierer = new JTextField();
		txtVierer.setColumns(10);
		txtVierer.setBounds(517, 120, 52, 26);
		contentPane.add(txtVierer);
		
		txtfuenfer = new JTextField();
		txtfuenfer.setColumns(10);
		txtfuenfer.setBounds(517, 154, 52, 26);
		contentPane.add(txtfuenfer);
		
		txtSechser = new JTextField();
		txtSechser.setColumns(10);
		txtSechser.setBounds(517, 186, 52, 26);
		contentPane.add(txtSechser);
		
		txtDreierpasch = new JTextField();
		txtDreierpasch.setColumns(10);
		txtDreierpasch.setBounds(517, 224, 52, 26);
		contentPane.add(txtDreierpasch);
		
		txtViererpasch = new JTextField();
		txtViererpasch.setColumns(10);
		txtViererpasch.setBounds(517, 251, 52, 26);
		contentPane.add(txtViererpasch);
		
		txtFullHouse = new JTextField();
		txtFullHouse.setColumns(10);
		txtFullHouse.setBounds(517, 286, 52, 26);
		contentPane.add(txtFullHouse);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(517, 321, 52, 26);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(517, 350, 52, 26);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(517, 385, 52, 26);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(517, 416, 52, 26);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(517, 442, 52, 26);
		contentPane.add(textField_11);

		dieSteuerung = new Steuerung(this);
	}
}
