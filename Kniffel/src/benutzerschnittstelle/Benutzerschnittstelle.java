package benutzerschnittstelle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fachkonzept.Endstand;
import steuerung.Steuerung;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class benutzerschnittstelle extends JFrame {

	private JPanel contentPane;
	private JLabel labelWuerfel1;
	private JLabel labelWuerfel3;
	private JLabel labelWuerfel2;
	private JLabel labelWuerfel5;
	private JCheckBox checkbocWuerfel1;
	private JCheckBox checkbocWuerfel2;
	private JCheckBox checkbocWuerfel3;
	private JCheckBox checkbocWuerfel4;
	private JCheckBox checkbocWuerfel5;
	private JButton btnWuerfeln;
	private JButton btnEIntragem;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextPane txtBestenliste;
	private JPanel panelFiguren;
	private JRadioButton rbEinser;
	private JTextField tfEinser;
	private JRadioButton rbZweier;
	private JTextField tfZweier;
	private JRadioButton rdbtnDreier;
	private JTextField tfDreier;
	private JRadioButton rdbtnVierer;
	private JTextField tfVierer;
	private JRadioButton rdbtnFuenfer;
	private JTextField tfFuenfer;
	private JRadioButton rdbtnSechser;
	private JTextField tfSechser;
	private JRadioButton rdbtnDreierPasch;
	private JTextField tfDreierPasch;
	private JRadioButton rdbtnViererPasch;
	private JTextField tfViererPasch;
	private JRadioButton rdbtnFullHouse;
	private JTextField tfFullHouse;
	private JRadioButton rdbtnKleineStrasse;
	private JTextField tfKleineStrasse;
	private JRadioButton rdbtnGrosseStrasse;
	private JTextField tfGrosseStrasse;
	private JRadioButton rdbtnKniffel;
	private JTextField tfKniffel;
	private JRadioButton rdbtnChance;
	private JTextField tfChance;
	private JTextField tfSumme;
	private JTextField tfBonus;
	private JLabel SummeOben;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tfSummeUnten;
	private JLabel lblNewLabel_3;
	private JTextField tfEndergebnis;
	private JButton btnNeuesSpiel;
	private Steuerung dieSteuerung;
	private JScrollPane scpBestenliste;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel[] lblWuerfel;
	private JCheckBox[] cbxWuerfel;
	private JRadioButton[] rbtFiguren;
	private JTextField[] txtFiguren;
	private JTextField[] txtSummen;
	private JLabel labelWuerfel4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					UIManager.setLookAndFeel(
							UIManager.getSystemLookAndFeelClassName());
					benutzerschnittstelle frame = new benutzerschnittstelle();
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
	public benutzerschnittstelle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "W\u00FCrfel",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 220, 161);
		contentPane.add(panel);
		panel.setLayout(null);

		labelWuerfel1 = new JLabel("");
		labelWuerfel1.setBounds(10, 16, 30, 30);
		panel.add(labelWuerfel1);

		labelWuerfel2 = new JLabel("");
		labelWuerfel2.setBounds(52, 16, 30, 30);
		panel.add(labelWuerfel2);

		labelWuerfel3 = new JLabel("");
		labelWuerfel3.setBounds(91, 16, 30, 30);
		panel.add(labelWuerfel3);

		labelWuerfel4 = new JLabel("");
		labelWuerfel4.setBounds(135, 16, 30, 30);
		panel.add(labelWuerfel4);

		labelWuerfel5 = new JLabel("");
		labelWuerfel5.setBounds(174, 16, 30, 30);
		panel.add(labelWuerfel5);

		lblWuerfel = new JLabel[] { labelWuerfel1, labelWuerfel2, labelWuerfel3, labelWuerfel4, labelWuerfel5 };

		checkbocWuerfel1 = new JCheckBox("");
		checkbocWuerfel1.setBounds(17, 51, 23, 23);
		panel.add(checkbocWuerfel1);

		checkbocWuerfel2 = new JCheckBox("");
		checkbocWuerfel2.setBounds(57, 51, 23, 23);
		panel.add(checkbocWuerfel2);

		checkbocWuerfel3 = new JCheckBox("");
		checkbocWuerfel3.setBounds(97, 51, 23, 23);
		panel.add(checkbocWuerfel3);

		checkbocWuerfel4 = new JCheckBox("");
		checkbocWuerfel4.setBounds(139, 51, 23, 23);
		panel.add(checkbocWuerfel4);

		checkbocWuerfel5 = new JCheckBox("");
		checkbocWuerfel5.setBounds(180, 51, 23, 23);
		panel.add(checkbocWuerfel5);

		cbxWuerfel = new JCheckBox[] { checkbocWuerfel1, checkbocWuerfel2, checkbocWuerfel3, checkbocWuerfel4,
				checkbocWuerfel5 };

		btnWuerfeln = new JButton("Würfeln");
		btnWuerfeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				geklicktWuerfeln();
			}
		});
		btnWuerfeln.setBounds(10, 91, 202, 23);
		panel.add(btnWuerfeln);

		btnEIntragem = new JButton("Eintragen >>");
		btnEIntragem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				geklicktEintragen();
			}
		});
		btnEIntragem.setBounds(10, 125, 202, 23);
		panel.add(btnEIntragem);

		lblNewLabel = new JLabel("Bestenliste");
		lblNewLabel.setBounds(17, 185, 75, 14);
		contentPane.add(lblNewLabel);

		scpBestenliste = new JScrollPane();
		scpBestenliste.setBounds(10, 215, 214, 252);
		contentPane.add(scpBestenliste);

		txtBestenliste = new JTextPane();
		scpBestenliste.setViewportView(txtBestenliste);
		txtBestenliste.setEditable(false);

		panelFiguren = new JPanel();
		panelFiguren.setBorder(new TitledBorder(null, "Blatt",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFiguren.setBounds(236, 11, 199, 499);
		contentPane.add(panelFiguren);
		panelFiguren.setLayout(null);

		rbEinser = new JRadioButton("Einser");
		buttonGroup.add(rbEinser);
		rbEinser.setBounds(6, 19, 96, 20);
		panelFiguren.add(rbEinser);

		tfEinser = new JTextField();
		tfEinser.setEditable(false);
		tfEinser.setBounds(103, 19, 86, 20);
		panelFiguren.add(tfEinser);
		tfEinser.setColumns(10);

		rbZweier = new JRadioButton("Zweier");
		buttonGroup.add(rbZweier);
		rbZweier.setBounds(6, 46, 96, 20);
		panelFiguren.add(rbZweier);

		tfZweier = new JTextField();
		tfZweier.setEditable(false);
		tfZweier.setColumns(10);
		tfZweier.setBounds(103, 46, 86, 20);
		panelFiguren.add(tfZweier);

		rdbtnDreier = new JRadioButton("Dreier");
		buttonGroup.add(rdbtnDreier);
		rdbtnDreier.setBounds(6, 75, 96, 20);
		panelFiguren.add(rdbtnDreier);

		tfDreier = new JTextField();
		tfDreier.setEditable(false);
		tfDreier.setColumns(10);
		tfDreier.setBounds(103, 73, 86, 20);
		panelFiguren.add(tfDreier);

		rdbtnVierer = new JRadioButton("Vierer");
		buttonGroup.add(rdbtnVierer);
		rdbtnVierer.setBounds(6, 104, 96, 20);
		panelFiguren.add(rdbtnVierer);

		tfVierer = new JTextField();
		tfVierer.setEditable(false);
		tfVierer.setColumns(10);
		tfVierer.setBounds(103, 101, 86, 20);
		panelFiguren.add(tfVierer);

		rdbtnFuenfer = new JRadioButton("Fuenfer");
		buttonGroup.add(rdbtnFuenfer);
		rdbtnFuenfer.setBounds(6, 134, 96, 20);
		panelFiguren.add(rdbtnFuenfer);

		tfFuenfer = new JTextField();
		tfFuenfer.setEditable(false);
		tfFuenfer.setColumns(10);
		tfFuenfer.setBounds(103, 134, 86, 20);
		panelFiguren.add(tfFuenfer);

		rdbtnSechser = new JRadioButton("Sechser");
		buttonGroup.add(rdbtnSechser);
		rdbtnSechser.setBounds(6, 162, 96, 20);
		panelFiguren.add(rdbtnSechser);

		tfSechser = new JTextField();
		tfSechser.setEditable(false);
		tfSechser.setColumns(10);
		tfSechser.setBounds(103, 163, 86, 20);
		panelFiguren.add(tfSechser);

		rdbtnDreierPasch = new JRadioButton("dreier Pasch");
		buttonGroup.add(rdbtnDreierPasch);
		rdbtnDreierPasch.setBounds(6, 248, 96, 20);
		panelFiguren.add(rdbtnDreierPasch);

		tfDreierPasch = new JTextField();
		tfDreierPasch.setEditable(false);
		tfDreierPasch.setColumns(10);
		tfDreierPasch.setBounds(103, 249, 86, 20);
		panelFiguren.add(tfDreierPasch);

		rdbtnViererPasch = new JRadioButton("vierer Pasch");
		buttonGroup.add(rdbtnViererPasch);
		rdbtnViererPasch.setBounds(6, 277, 96, 20);
		panelFiguren.add(rdbtnViererPasch);

		tfViererPasch = new JTextField();
		tfViererPasch.setEditable(false);
		tfViererPasch.setColumns(10);
		tfViererPasch.setBounds(103, 275, 86, 20);
		panelFiguren.add(tfViererPasch);

		rdbtnFullHouse = new JRadioButton("Full House");
		buttonGroup.add(rdbtnFullHouse);
		rdbtnFullHouse.setBounds(6, 305, 96, 20);
		panelFiguren.add(rdbtnFullHouse);

		tfFullHouse = new JTextField();
		tfFullHouse.setEditable(false);
		tfFullHouse.setColumns(10);
		tfFullHouse.setBounds(103, 305, 86, 20);
		panelFiguren.add(tfFullHouse);

		rdbtnKleineStrasse = new JRadioButton("kleine Strasse");
		buttonGroup.add(rdbtnKleineStrasse);
		rdbtnKleineStrasse.setBounds(6, 332, 96, 20);
		panelFiguren.add(rdbtnKleineStrasse);

		tfKleineStrasse = new JTextField();
		tfKleineStrasse.setEditable(false);
		tfKleineStrasse.setColumns(10);
		tfKleineStrasse.setBounds(103, 332, 86, 20);
		panelFiguren.add(tfKleineStrasse);

		rdbtnGrosseStrasse = new JRadioButton("grosse Strasse");
		buttonGroup.add(rdbtnGrosseStrasse);
		rdbtnGrosseStrasse.setBounds(6, 361, 96, 20);
		panelFiguren.add(rdbtnGrosseStrasse);

		tfGrosseStrasse = new JTextField();
		tfGrosseStrasse.setEditable(false);
		tfGrosseStrasse.setColumns(10);
		tfGrosseStrasse.setBounds(103, 359, 86, 20);
		panelFiguren.add(tfGrosseStrasse);

		rdbtnKniffel = new JRadioButton("Kniffel");
		buttonGroup.add(rdbtnKniffel);
		rdbtnKniffel.setBounds(6, 390, 96, 20);
		panelFiguren.add(rdbtnKniffel);

		tfKniffel = new JTextField();
		tfKniffel.setEditable(false);
		tfKniffel.setColumns(10);
		tfKniffel.setBounds(103, 389, 86, 20);
		panelFiguren.add(tfKniffel);

		rdbtnChance = new JRadioButton("Chance");
		buttonGroup.add(rdbtnChance);
		rdbtnChance.setBounds(6, 418, 96, 20);
		panelFiguren.add(rdbtnChance);

		rbtFiguren = new JRadioButton[] {
				rbEinser,
				rbZweier,
				rdbtnDreier,
				rdbtnVierer,
				rdbtnFuenfer,
				rdbtnSechser,
				rdbtnDreierPasch,
				rdbtnViererPasch,
				rdbtnFullHouse,
				rdbtnKleineStrasse,
				rdbtnGrosseStrasse,
				rdbtnKniffel,
				rdbtnChance
		};

		tfChance = new JTextField();
		tfChance.setEditable(false);
		tfChance.setColumns(10);
		tfChance.setBounds(103, 418, 86, 20);
		panelFiguren.add(tfChance);

		txtFiguren = new JTextField[] {
				tfEinser,
				tfZweier,
				tfDreier,
				tfVierer,
				tfFuenfer,
				tfSechser,
				tfDreierPasch,
				tfViererPasch,
				tfFullHouse,
				tfKleineStrasse,
				tfGrosseStrasse,
				tfKniffel,
				tfChance,
		};

		tfSumme = new JTextField();
		tfSumme.setEditable(false);
		tfSumme.setBounds(103, 191, 86, 20);
		panelFiguren.add(tfSumme);
		tfSumme.setColumns(10);

		tfBonus = new JTextField();
		tfBonus.setEditable(false);
		tfBonus.setBounds(103, 222, 86, 20);
		panelFiguren.add(tfBonus);
		tfBonus.setColumns(10);

		SummeOben = new JLabel("Summe");
		SummeOben.setHorizontalAlignment(SwingConstants.LEFT);
		SummeOben.setBounds(20, 194, 46, 14);
		panelFiguren.add(SummeOben);

		lblNewLabel_1 = new JLabel("Bonus");
		lblNewLabel_1.setBounds(20, 225, 46, 14);
		panelFiguren.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Summe unten");
		lblNewLabel_2.setBounds(10, 445, 65, 14);
		panelFiguren.add(lblNewLabel_2);

		tfSummeUnten = new JTextField();
		tfSummeUnten.setEditable(false);
		tfSummeUnten.setBounds(103, 442, 86, 20);
		panelFiguren.add(tfSummeUnten);
		tfSummeUnten.setColumns(10);

		lblNewLabel_3 = new JLabel("Endergebnis");
		lblNewLabel_3.setBounds(20, 471, 60, 14);
		panelFiguren.add(lblNewLabel_3);

		tfEndergebnis = new JTextField();
		tfEndergebnis.setEditable(false);
		tfEndergebnis.setBounds(103, 468, 86, 20);
		panelFiguren.add(tfEndergebnis);
		tfEndergebnis.setColumns(10);

		txtSummen = new JTextField[] {
				tfSumme,
				tfBonus,
				tfSummeUnten,
				tfEndergebnis
		};

		btnNeuesSpiel = new JButton("neues Spiel");
		btnNeuesSpiel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				geklicktNeuesSpiel();
			}
		});
		btnNeuesSpiel.setBounds(10, 478, 214, 32);
		contentPane.add(btnNeuesSpiel);

		dieSteuerung = new Steuerung(this);
		aktiviereWuerfeln(true);

	}

	public String erfrageSpielername() {
		return JOptionPane.showInputDialog(rootPane, accessibleContext);
	}

	public void aktiviereWuerfelauswahl(boolean pAktiv) {
		for (JCheckBox jCheckBox : cbxWuerfel) {
			jCheckBox.setEnabled(pAktiv);
		}
	}

	public void geklicktNeuesSpiel() {
		// String Spielername = erfrageSpielername();
		int antwort = JOptionPane.showConfirmDialog(null, "Möchten Sie ein neues Spiel starten?");
		if (antwort == JOptionPane.YES_OPTION) {
			dieSteuerung.geklicktNeuesSpiel();
		}
	}

	public void geklicktWuerfeln() {
		boolean[] werfen = new boolean[5];

		for (int i = 0; i < werfen.length; i++) {
			werfen[i] = cbxWuerfel[i].isSelected();
		}

		dieSteuerung.geklicktWuerfeln(werfen);
	}

	public void geklicktEintragen() {
		int figurNr = -1;
		for (int i = 0; i < rbtFiguren.length; i++) {
			if (rbtFiguren[i].isSelected()) {
				figurNr = i;
			}
		}

		if (figurNr < 0) {
			JOptionPane.showMessageDialog(rootPane, "Eingaben nicht korrekt");
			return;
		}
		try {
			dieSteuerung.geklicktEingetragen(figurNr);
		} catch (Exception e) {
			zeigeNachricht(e.getMessage());
		}
	}

	private void zeigeNachricht(String pNachricht) {
		JOptionPane.showMessageDialog(null, pNachricht);
	}

	public void zeigeBestenliste(Endstand[] pEndstand) {
		String liste = "";
		for (Endstand endstand : pEndstand) {
			liste += endstand.liesName() + "  -  " + endstand.liesPunkte() + "\n";
		}

		txtBestenliste.setText(liste);
		txtBestenliste.setCaretPosition(0);
	}

	public void zeigeGewinnkarte(boolean[] pEingetragen, int[] pPunktzahl) {
		for (int i = 0; i < pPunktzahl.length; i++) {
			if (i < 13) {
				if (pEingetragen[i]) {
					txtFiguren[i].setText(Integer.toString(pPunktzahl[i]));
				} else {
					txtFiguren[i].setText(null);
				}
			} else {
				txtSummen[(i - 13)].setText(Integer.toString(pPunktzahl[i]));
			}
		}
	}

	public void zeigeWuerfel(int[] pAugenzahl) {
		for (int i = 0; i < pAugenzahl.length; i++) {
			String dateiname = "/benutzerschnittstelle/wuerfel" + pAugenzahl[i] + ".png";
			ImageIcon icon = new ImageIcon(benutzerschnittstelle.class.getResource(dateiname));
			Image img = icon.getImage().getScaledInstance(
					lblWuerfel[i].getWidth(),
					lblWuerfel[i].getHeight(),
					java.awt.Image.SCALE_SMOOTH);
			icon = new ImageIcon(img);
			lblWuerfel[i].setIcon(icon);

		}
	}

	public void waehleAlleWuerfelAus() {
		for (JCheckBox wuerfel : cbxWuerfel) {
			wuerfel.setSelected(true);
		}
	}

	public void aktiviereWuerfeln(boolean pAktiv) {
		btnWuerfeln.setEnabled(pAktiv);
	}

	public void aktiviereEintragen(boolean pAktiv) {
		btnEIntragem.setEnabled(pAktiv);
	}
}
