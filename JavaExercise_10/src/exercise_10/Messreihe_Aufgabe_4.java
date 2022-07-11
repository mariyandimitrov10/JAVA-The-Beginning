
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
import java.util.ArrayList;
import java.util.Arrays;

public class Messreihe_Aufgabe_4 extends JFrame {

	private JPanel contentPane;
	private JTextField tfMesswert;
	private JTextField tfIndexEingabe;
	private JTextField tfWert;
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
	private JButton btnLoeschen;

	private int inputIndex, i;
	private ArrayList<Double> inputArr;
	private double messwert, summe, minimum, maximum, mittelwert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Messreihe_Aufgabe_4 frame = new Messreihe_Aufgabe_4();
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
	public Messreihe_Aufgabe_4() {
		setTitle("Messreihe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblMesswert = new JLabel("1. Messwert");
		lblMesswert.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMesswert.setBounds(10, 11, 100, 14);
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
		tfMesswert.setBounds(10, 35, 111, 20);
		contentPane.add(tfMesswert);
		tfMesswert.setColumns(10);

		btnEingabeMesswert = new JButton("OK");
		btnEingabeMesswert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEingabeMesswert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inputArr = new ArrayList<>();
				try {
						inputArr.add(Double.parseDouble(tfMesswert.getText()));
						
						lblMesswert.setText(i + 1 + ". Messwert");
			
						tfMesswert.requestFocus();
						tfMesswert.selectAll();
						lblMesswerte.setVisible(true);
						
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(rootPane, "Ungültige Zahlenformat !");
					}
				
					for (double a : inputArr) {
						lblMesswerte.setText(lblMesswerte.getText() + a + "   ");
					}
					
					tfIndexEingabe.setVisible(true);
					lblMesswertindex.setVisible(true);
					btnBearbeiten.setVisible(true);
					lblWert.setVisible(true);
					tfWert.setVisible(true);
					btnMessreiheAuswerten.setVisible(true);
					btnSpeichern.setVisible(true);
					lblMaximalwert.setVisible(true);
					lblMinimalwert.setVisible(true);
					lblMittelwert.setVisible(true);
					//tfMesswert.setText("");

			}
		}); 
		btnEingabeMesswert.setBounds(131, 32, 89, 23);
		contentPane.add(btnEingabeMesswert);

		lblMesswerte = new JLabel("Messwerte: ");
		lblMesswerte.setVisible(false);
		lblMesswerte.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMesswerte.setBounds(6, 65, 504, 14);
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
		tfIndexEingabe.setBounds(16, 89, 59, 20);
		contentPane.add(tfIndexEingabe);
		tfIndexEingabe.setColumns(10);

		lblMesswertindex = new JLabel(". Messwert");
		lblMesswertindex.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMesswertindex.setVisible(false);
		lblMesswertindex.setBounds(76, 90, 70, 14);
		contentPane.add(lblMesswertindex);

		btnBearbeiten = new JButton("Bearbeiten");
		btnBearbeiten.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBearbeiten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					i = Integer.parseInt(tfIndexEingabe.getText());
					
					if (i >= 0 && i < inputArr.size() ) {
						messwert = inputArr.get(i);
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
		btnBearbeiten.setBounds(156, 89, 132, 23);
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
					inputArr.add(i - 1, messwert);

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
				minimum = inputArr.get(0);
				maximum = inputArr.get(0);
				for (double x : inputArr) {
					if (minimum > x) {
						minimum = x;
					}
					if (maximum < x) {
						maximum = x;
					}
					summe = summe + x;
				}
				mittelwert = summe / inputArr.size();
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

		btnLoeschen = new JButton("L\u00F6schen");
		btnLoeschen.setVisible(false);
		btnLoeschen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLoeschen.setBounds(311, 163, 132, 21);
		contentPane.add(btnLoeschen);

	}
}