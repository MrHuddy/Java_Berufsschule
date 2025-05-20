package Benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import steuerung.Steuerung;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Benutzerschnittstelle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton buttonFormat;
	private Steuerung dieSteuerung;
	private JTextField txt_stunden;
	private JTextField txt_minuten;
	private JTextField txt_sekunden;
	private JTextField txt_anzeige;
	private JLabel lblNewLabel_1;

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
		setResizable(false);
		setTitle("Digitaluhr");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		dieSteuerung = new Steuerung(this);
		
		contentPane.setLayout(null);
		
		buttonFormat = new JButton("12/24-Std.-Format");
		buttonFormat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dieSteuerung.geklicktFormatUmschalten();
			}
		});
		buttonFormat.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		buttonFormat.setBounds(16, 78, 226, 29);
		contentPane.add(buttonFormat);
		
		txt_stunden = new JTextField();
		txt_stunden.setEditable(false);
		txt_stunden.setBounds(16, 18, 39, 36);
		contentPane.add(txt_stunden);
		txt_stunden.setColumns(10);
		
		txt_minuten = new JTextField();
		txt_minuten.setEditable(false);
		txt_minuten.setColumns(10);
		txt_minuten.setBounds(67, 18, 39, 36);
		contentPane.add(txt_minuten);
		
		
		txt_sekunden = new JTextField();
		txt_sekunden.setEditable(false);
		txt_sekunden.setColumns(10);
		txt_sekunden.setBounds(118, 18, 39, 36);
		contentPane.add(txt_sekunden);
		
		txt_anzeige = new JTextField();
		txt_anzeige.setEditable(false);
		txt_anzeige.setColumns(10);
		txt_anzeige.setBounds(175, 18, 52, 36);
		contentPane.add(txt_anzeige);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblNewLabel.setBounds(60, 13, 6, 38);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblNewLabel_1.setBounds(110, 13, 6, 38);
		contentPane.add(lblNewLabel_1);
	}
	
	public void stelleDarUhrzeit(int stunden, int minuten, int sekunden, String pAMPM) {
		txt_stunden.setText(Integer.toString(stunden));
		txt_minuten.setText(Integer.toString(minuten));
		txt_sekunden.setText(Integer.toString(sekunden));
		txt_anzeige.setText(pAMPM);
	}
}
