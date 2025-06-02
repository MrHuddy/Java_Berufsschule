package benutzerschnittstelle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Benutzerschnittstelle extends JFrame {

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
		setTitle("Runder Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RunderGruenerButton btnMachWas = new RunderGruenerButton("mach was");
		btnMachWas.setBounds(171, 66, 100, 100); // x, y, Breite, Höhe
		btnMachWas.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		geklicktButton();
		}
		});
		contentPane.add(btnMachWas);
	}
	
	public void geklicktButton() {
		JOptionPane.showMessageDialog(this, "Hallo!");
	}
}
