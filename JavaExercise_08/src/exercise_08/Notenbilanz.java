package exercise_08;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Notenbilanz extends JFrame {

	private JPanel contentPane;
	private JTextField tfAnzahlNoten;
	private JButton btnAnzahlUebernehmen;
	private JButton btnEnde;
	private JLabel lblNote;
	private JTextField tfNote;
	private JButton btnNotenUebernehmen;
	private JLabel lblNotenzahl;
	private JLabel lblNotenschnitt;
	private JLabel lblBesteNote;
	private JLabel lblSchlechtesteNote;
	private JButton btnNeueBerechnung;
	
	private int notenzahl, i;
	private double summe, besteNote, schlechtesteNote, notenschnitt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notenbilanz frame = new Notenbilanz();
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
	public Notenbilanz() {
		setTitle("Notenbilanz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		DecimalFormat f = new DecimalFormat("#0.00");
		
		JLabel lblAnzahlNoten = new JLabel("Anzahl Noten");
		lblAnzahlNoten.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnzahlNoten.setBounds(10, 10, 91, 20);
		contentPane.add(lblAnzahlNoten);
		
		tfAnzahlNoten = new JTextField();
		tfAnzahlNoten.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnAnzahlUebernehmen.doClick();
				}
			}
		});
		tfAnzahlNoten.setFont(new Font("Tahoma", Font.BOLD, 10));
		tfAnzahlNoten.setBounds(10, 40, 79, 19);
		contentPane.add(tfAnzahlNoten);
		tfAnzahlNoten.setColumns(10);
		
		btnAnzahlUebernehmen = new JButton("\u00DCbernehmen");
		btnAnzahlUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tfAnzahlNoten.getText().isEmpty()) {
					notenzahl = Integer.parseInt(tfAnzahlNoten.getText());
				    i = 1;
				    summe = 0;
				    besteNote = 6;
				    schlechtesteNote = 0;
				    btnAnzahlUebernehmen.setVisible(false);
				    tfAnzahlNoten.setEditable(false);
				    lblNote.setVisible(true);
				    tfNote.setVisible(true);
				    btnNotenUebernehmen.setVisible(true);
				    tfNote.requestFocus();
				} else {
				    JOptionPane.showMessageDialog(null, "Anzahl der Noten eingeben!");
				    tfAnzahlNoten.requestFocus();
				}
			}
		});
		btnAnzahlUebernehmen.setBounds(128, 35, 119, 29);
		contentPane.add(btnAnzahlUebernehmen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(366, 228, 91, 35);
		contentPane.add(btnEnde);
		
		lblNote = new JLabel("1. Note");
		lblNote.setVisible(false);
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNote.setBounds(10, 90, 91, 20);
		contentPane.add(lblNote);
		
		tfNote = new JTextField();
		tfNote.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnNotenUebernehmen.doClick();
				}
			}
		});
		tfNote.setVisible(false);
		tfNote.setBounds(5, 120, 96, 19);
		contentPane.add(tfNote);
		tfNote.setColumns(10);
		
		btnNotenUebernehmen = new JButton("\u00DCbernehmen");
		btnNotenUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tfNote.getText().isEmpty()
						&& Double.parseDouble(tfNote.getText()) >= 1
						&& Double.parseDouble(tfNote.getText()) <= 6) {
				
					    summe = summe + Double.parseDouble(tfNote.getText());
					    notenschnitt = summe / i;
					    lblNotenschnitt.setText("Notenschnitt: "
						    + f.format(notenschnitt));
					    lblNotenzahl.setText("Anzahl eingegebene Noten: "
						    + Integer.toString(i));

					    if (Double.parseDouble(tfNote.getText()) > schlechtesteNote) {
						schlechtesteNote = Double.parseDouble(tfNote.getText());
						lblSchlechtesteNote.setText("schlechteste Note: "
							+ Double.toString(schlechtesteNote));
					    }
					    if (Double.parseDouble(tfNote.getText()) < besteNote) {
						besteNote = Double.parseDouble(tfNote.getText());
						lblBesteNote
							.setText("beste Note: " + Double.toString(besteNote));
					    }
					    if (i == notenzahl) {
						notenschnitt = summe / notenzahl;
						btnNotenUebernehmen.setVisible(false);
						btnNeueBerechnung.setVisible(true);
						btnNeueBerechnung.requestFocus();
					    } else {
					    i++;
						lblNote.setText(Integer.toString(i) + ". Note");
						tfNote.setText("");
						tfNote.requestFocus();
					    }
					    
					} else {
					    JOptionPane.showMessageDialog(null, "gültige Note eingeben!");
					    tfNote.requestFocus();
					}
			}
		});
		btnNotenUebernehmen.setVisible(false);
		btnNotenUebernehmen.setBounds(128, 111, 119, 29);
		contentPane.add(btnNotenUebernehmen);
		
		lblNotenzahl = new JLabel("");
		lblNotenzahl.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNotenzahl.setBounds(10, 169, 193, 20);
		contentPane.add(lblNotenzahl);
		
		lblNotenschnitt = new JLabel("");
		lblNotenschnitt.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNotenschnitt.setBounds(10, 194, 193, 20);
		contentPane.add(lblNotenschnitt);
		
		lblBesteNote = new JLabel("");
		lblBesteNote.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBesteNote.setBounds(10, 217, 193, 20);
		contentPane.add(lblBesteNote);
		
		lblSchlechtesteNote = new JLabel("");
		lblSchlechtesteNote.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSchlechtesteNote.setBounds(10, 239, 193, 20);
		contentPane.add(lblSchlechtesteNote);
		
		btnNeueBerechnung = new JButton("Neue Berechnung");
		btnNeueBerechnung.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnNeueBerechnung.doClick();
				}
			}
		});
		btnNeueBerechnung.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			i = 1;
			lblNote.setText(Integer.toString(i) + ".Note");
			summe = 0;
			besteNote = 6;
			schlechtesteNote = 0;
			btnAnzahlUebernehmen.setVisible(true);
			tfAnzahlNoten.setEditable(true);
			lblNote.setVisible(false);
			tfNote.setVisible(false);
			tfNote.setText("");
			btnNeueBerechnung.setVisible(false);
			tfAnzahlNoten.setText("");
			tfAnzahlNoten.requestFocus();
			lblNotenschnitt.setText("");
			lblBesteNote.setText("");
			lblSchlechtesteNote.setText("");
			lblNotenzahl.setText("");
			btnNeueBerechnung.setVisible(false);
		    }
		});
		btnNeueBerechnung.setVisible(false);
		btnNeueBerechnung.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNeueBerechnung.setBounds(289, 34, 141, 29);
		contentPane.add(btnNeueBerechnung);
	}

}
