
package exercise_10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Messreihe extends JFrame {

	private JPanel contentPane;
	private JTextField tfAnzahl;
	private JButton btnEingabeAnzahl;
	private JTextField tfMesswert;
	private JTextField tfIndexEingabe;
	private JTextField tfWert;
	private JLabel lblWievieleMesswerte;
	private JLabel lblMesswert;
	private JButton btnEingabeMesswert;
	private JLabel lblMesswerte;
	private JButton btnBearbeiten;
	private JButton btnMessreiheAuswerten;
	private JLabel lblMesswertindex;
	private JButton btnSpeichern;
	private JLabel lblWert;
	private JLabel lblMaximalwert;
	private JLabel lblMinimalwert;
	private JLabel lblMittelwert;
	private JButton btnEnde;

	private int inputIndex, i;
	private double[] inputArr;
	private double messwert, summe, minimum, maximum, mittelwert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Messreihe frame = new Messreihe();
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
	public Messreihe() {
		setTitle("Messreihe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblWievieleMesswerte = new JLabel("Wie viele Messwerte sollen eingegeben werden?");
		lblWievieleMesswerte.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWievieleMesswerte.setBounds(10, 11, 325, 14);
		contentPane.add(lblWievieleMesswerte);

		tfAnzahl = new JTextField();
		tfAnzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnEingabeAnzahl.doClick();
				}
			}
		});
		tfAnzahl.setBounds(345, 10, 70, 20);
		contentPane.add(tfAnzahl);
		tfAnzahl.setColumns(10); 
		btnEingabeAnzahl = new JButton("OK");
		btnEingabeAnzahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					if (!tfAnzahl.getText().isEmpty()) {

						inputArr = new double[Integer.parseInt(tfAnzahl.getText())];

						lblMesswert.setVisible(true);
						tfMesswert.setVisible(true);
						tfMesswert.requestFocus();
						btnEingabeMesswert.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(null, "Bitte tragen Sie in Textfeld eine Zahl ein");
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Ungültige Zahlformat !");
				}
			}
		});
		btnEingabeAnzahl.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEingabeAnzahl.setBounds(425, 9, 85, 21);
		contentPane.add(btnEingabeAnzahl);

		lblMesswert = new JLabel("Messwert");
		lblMesswert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMesswert.setVisible(false);
		lblMesswert.setBounds(10, 36, 100, 14);
		contentPane.add(lblMesswert);

		tfMesswert = new JTextField();
		tfMesswert.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnEingabeMesswert.doClick();
				}
			}
		});
		tfMesswert.setVisible(false);
		tfMesswert.setBounds(10, 51, 111, 20);
		contentPane.add(tfMesswert);
		tfMesswert.setColumns(10);

		btnEingabeMesswert = new JButton("OK");
		btnEingabeMesswert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEingabeMesswert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!tfMesswert.getText().isEmpty()) {
						if (inputIndex < inputArr.length) {
							inputArr[inputIndex] = Double.parseDouble(tfMesswert.getText());
							inputIndex++;

							lblMesswerte.setText("Messwerte: ");
							tfMesswert.requestFocus();
							tfMesswert.selectAll();
							lblMesswerte.setVisible(true);

							for (double a : inputArr) {
								lblMesswerte.setText(lblMesswerte.getText() + a + "   ");
							}

							if (inputIndex > inputArr.length - 1) {

								tfIndexEingabe.setVisible(true);
								tfIndexEingabe.requestFocus();
								lblMesswertindex.setVisible(true);
								btnBearbeiten.setVisible(true);
								lblWert.setVisible(true);
								tfWert.setVisible(true);
								btnMessreiheAuswerten.setVisible(true);
								btnMessreiheAuswerten.doClick();
								btnSpeichern.setVisible(true);
								lblMaximalwert.setVisible(true);
								lblMinimalwert.setVisible(true);
								lblMittelwert.setVisible(true);
								tfMesswert.setText("");
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, "Bitte Messwerte eintragen !");
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Ungültige Zahlformat !");
				}
			}
		});
		btnEingabeMesswert.setVisible(false);
		btnEingabeMesswert.setBounds(139, 50, 89, 23);
		contentPane.add(btnEingabeMesswert);

		lblMesswerte = new JLabel("Messwerte: ");
		lblMesswerte.setVisible(false);
		lblMesswerte.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMesswerte.setBounds(10, 82, 504, 14);
		contentPane.add(lblMesswerte);

		tfIndexEingabe = new JTextField();
		tfIndexEingabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnBearbeiten.doClick();
				}
			}
		});
		tfIndexEingabe.setVisible(false);
		tfIndexEingabe.setBounds(10, 107, 59, 20);
		contentPane.add(tfIndexEingabe);
		tfIndexEingabe.setColumns(10);

		lblMesswertindex = new JLabel(". Messwert");
		lblMesswertindex.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMesswertindex.setVisible(false);
		lblMesswertindex.setBounds(75, 110, 70, 14);
		contentPane.add(lblMesswertindex);

		btnBearbeiten = new JButton("Bearbeiten");
		btnBearbeiten.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBearbeiten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i = Integer.parseInt(tfIndexEingabe.getText());

					if (i > 0 && i < inputArr.length + 1) {
						messwert = inputArr[i - 1];
						tfWert.setText(String.valueOf(messwert));
						tfWert.requestFocus();
						tfWert.selectAll();
					} else {
						JOptionPane.showMessageDialog(null, "Index außerhalb der Messreihe!");
						tfIndexEingabe.requestFocus();
						tfIndexEingabe.selectAll();
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ungültiges Zahlenformat!");
					tfIndexEingabe.requestFocus();
				}
			}
		});
		btnBearbeiten.setVisible(false);
		btnBearbeiten.setBounds(155, 107, 132, 23);
		contentPane.add(btnBearbeiten);

		lblWert = new JLabel("Wert");
		lblWert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblWert.setVisible(false);
		lblWert.setBounds(10, 149, 75, 14);
		contentPane.add(lblWert);

		tfWert = new JTextField();
		tfWert.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnSpeichern.doClick();
				}
			}
		});
		tfWert.setVisible(false);
		tfWert.setBounds(10, 164, 111, 20);
		contentPane.add(tfWert);
		tfWert.setColumns(10);

		btnSpeichern = new JButton("Speichern");
		btnSpeichern.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int i = Integer.parseInt(tfIndexEingabe.getText());
					messwert = Double.parseDouble(tfWert.getText());
					inputArr[i - 1] = messwert;

					lblMesswerte.setText("Messwerte: ");
					for (double a : inputArr) {
						lblMesswerte.setText(lblMesswerte.getText() + a + "   ");
					}

					tfIndexEingabe.setText("");
					tfIndexEingabe.requestFocus();
					tfWert.setText("");
					btnMessreiheAuswerten.doClick();

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ungültiges Zahlenformat!");
					tfWert.requestFocus();
				}
			}
		});
		btnSpeichern.setVisible(false);
		btnSpeichern.setBounds(155, 163, 132, 23);
		contentPane.add(btnSpeichern);

		btnMessreiheAuswerten = new JButton("Messreihe auswerten");
		btnMessreiheAuswerten.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMessreiheAuswerten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				summe = 0;
				minimum = inputArr[0];
				maximum = inputArr[0];
				for (double x : inputArr) {
					if (minimum > x) {
						minimum = x;
					}
					if (maximum < x) {
						maximum = x;
					}
					summe = summe + x;
				}
				mittelwert = summe / inputArr.length;
				lblMinimalwert.setText("Minimalwert: " + String.valueOf(minimum));
				lblMaximalwert.setText("Maximalwert: " + String.valueOf(maximum));
				lblMittelwert.setText("Mittelwert: " + String.valueOf(String.format("%.2f", mittelwert)));
			}
		});
		btnMessreiheAuswerten.setVisible(false);
		btnMessreiheAuswerten.setBounds(10, 195, 200, 23);
		contentPane.add(btnMessreiheAuswerten);

		lblMaximalwert = new JLabel("Maximalwert");
		lblMaximalwert.setVisible(false);
		lblMaximalwert.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMaximalwert.setBounds(10, 229, 148, 14);
		contentPane.add(lblMaximalwert);

		lblMinimalwert = new JLabel("Minimalwert");
		lblMinimalwert.setVisible(false);
		lblMinimalwert.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMinimalwert.setBounds(10, 254, 148, 14);
		contentPane.add(lblMinimalwert);

		lblMittelwert = new JLabel("Mittelwert");
		lblMittelwert.setVisible(false);
		lblMittelwert.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMittelwert.setBounds(10, 279, 148, 14);
		contentPane.add(lblMittelwert);

		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnde.setBounds(414, 271, 100, 30);
		contentPane.add(btnEnde);

	}
}