package exercise_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JOptionPane;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Arrayausgabe extends JFrame {

	private JPanel contentPane;
	private JLabel lblWievieleZahlen;
	private JTextField tfAnzahl;
	private JButton btnEingabeAnzahl;
	private JLabel lblZahl;
	private JTextField tfZahl;
	private JButton btnEingabeZahl;
	private JButton btnNeueAngabe;
	private JLabel lblAusgabeVorwaerts;
	private JLabel lblAusgabeRueckwaerts;
	private JButton btnEnde;

	private int anzahl, i;
	private int[] zahlen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arrayausgabe frame = new Arrayausgabe();
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
	public Arrayausgabe() {
		setTitle("Arrayausgabe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblWievieleZahlen = new JLabel("Wie viele Zahlen sollen  eingegeben werden ?");
		lblWievieleZahlen.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWievieleZahlen.setBounds(10, 10, 329, 21);
		contentPane.add(lblWievieleZahlen);

		tfAnzahl = new JTextField();
		tfAnzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnEingabeAnzahl.doClick();
				}
			}
		});
		tfAnzahl.setBounds(317, 12, 96, 19);
		contentPane.add(tfAnzahl);
		tfAnzahl.setColumns(10);

		btnEingabeAnzahl = new JButton("OK");
		btnEingabeAnzahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					anzahl = Integer.parseInt(tfAnzahl.getText());
					i++;
					lblZahl.setText(i + ". Zahl");
					zahlen = new int[anzahl];

					lblZahl.setVisible(true);
					tfZahl.setVisible(true);
					btnEingabeZahl.setVisible(true);
					tfZahl.requestFocus();
					tfZahl.selectAll();
					btnEnde.setVisible(true);
					;
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Falsches Zahlenformat!");
					tfAnzahl.requestFocus();
				}
			}
		});
		btnEingabeAnzahl.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEingabeAnzahl.setBounds(423, 10, 85, 21);
		contentPane.add(btnEingabeAnzahl);

		lblZahl = new JLabel("Zahl");
		lblZahl.setVisible(false);
		lblZahl.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblZahl.setBounds(10, 73, 60, 21);
		contentPane.add(lblZahl);

		tfZahl = new JTextField();
		tfZahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnEingabeZahl.doClick();
				}
			}
		});
		tfZahl.setVisible(false);
		tfZahl.setBounds(10, 97, 96, 19);
		contentPane.add(tfZahl);
		tfZahl.setColumns(10);

		btnEingabeZahl = new JButton("OK");
		btnEingabeZahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (i <= anzahl) {
					try {
						zahlen[i - 1] = Integer.parseInt(tfZahl.getText());
						i++;
						lblZahl.setText(i + ". Zahl:");
						tfZahl.setText("");
						tfZahl.requestFocus();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Ungültige Zahlenangabe!");
					}
				}
				if (i > anzahl) {
					lblAusgabeVorwaerts.setText("Ausgabe vorwärts: ");
					lblAusgabeRueckwaerts.setText("Ausgabe rückwärts: ");

					for (int a : zahlen) {
						lblAusgabeVorwaerts.setText(lblAusgabeVorwaerts.getText() + a + " ");
					}

					for (int y = i - 2; y >= 0; y--) {
						lblAusgabeRueckwaerts.setText(lblAusgabeRueckwaerts.getText() + zahlen[y] + " ");
					}

					lblAusgabeVorwaerts.setVisible(true);
					lblAusgabeRueckwaerts.setVisible(true);
					lblZahl.setVisible(false);
					tfZahl.setVisible(false);
					btnEingabeZahl.setVisible(false);
					btnNeueAngabe.setVisible(true);
					btnNeueAngabe.requestFocus();
				}
			}
		});
		btnEingabeZahl.setVisible(false);
		btnEingabeZahl.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEingabeZahl.setBounds(133, 96, 85, 21);
		contentPane.add(btnEingabeZahl);

		btnNeueAngabe = new JButton("Neue Angabe");
		btnNeueAngabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					lblAusgabeVorwaerts.setVisible(false);
					lblAusgabeRueckwaerts.setVisible(false);
					btnNeueAngabe.setVisible(false);
					lblWievieleZahlen.setVisible(true);
					tfAnzahl.setVisible(true);
					btnEingabeAnzahl.setVisible(true);
					i = 0;
					tfAnzahl.setText("");
					tfAnzahl.requestFocus();
				}
			}
		});
		btnNeueAngabe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAusgabeVorwaerts.setVisible(false);
				lblAusgabeRueckwaerts.setVisible(false);
				btnNeueAngabe.setVisible(false);
				lblWievieleZahlen.setVisible(true);
				tfAnzahl.setVisible(true);
				btnEingabeAnzahl.setVisible(true);
				i = 0;
				tfAnzahl.setText("");
				tfAnzahl.requestFocus();
			}
		});
		btnNeueAngabe.setVisible(false);
		btnNeueAngabe.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNeueAngabe.setBounds(268, 89, 133, 32);
		contentPane.add(btnNeueAngabe);

		lblAusgabeVorwaerts = new JLabel("");
		lblAusgabeVorwaerts.setVisible(false);
		lblAusgabeVorwaerts.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAusgabeVorwaerts.setBounds(10, 131, 133, 21);
		contentPane.add(lblAusgabeVorwaerts);

		lblAusgabeRueckwaerts = new JLabel("");
		lblAusgabeRueckwaerts.setVisible(false);
		lblAusgabeRueckwaerts.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAusgabeRueckwaerts.setBounds(10, 162, 133, 21);
		contentPane.add(lblAusgabeRueckwaerts);

		btnEnde = new JButton("Ende");
		btnEnde.setVisible(false);
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnde.setBounds(394, 155, 110, 34);
		contentPane.add(btnEnde);
	}
}
