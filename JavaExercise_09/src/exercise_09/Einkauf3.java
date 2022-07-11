package exercise_09;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class Einkauf3 extends JFrame {

    private JPanel contentPane;
    private JTextField tfStueckzahl;
    private JTextField tfStueckpreis;
    private JTextField tfRabatt;
    private JLabel lblErgebnis;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Einkauf3 frame = new Einkauf3();
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
    public Einkauf3() {
	setTitle("Einkaufspreis");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 514, 178);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblStueckzahl = new JLabel("St\u00FCckzahl");
	lblStueckzahl.setBounds(10, 11, 80, 14);
	contentPane.add(lblStueckzahl);

	JLabel lblStueckpreis = new JLabel("St\u00FCckpreis");
	lblStueckpreis.setBounds(127, 11, 88, 14);
	contentPane.add(lblStueckpreis);

	JLabel lblRabatt = new JLabel("Rabatt (%)");
	lblRabatt.setBounds(246, 11, 74, 14);
	contentPane.add(lblRabatt);

	tfStueckzahl = new JTextField();
	tfStueckzahl.addKeyListener(new KeyAdapter() {
	    @Override
	    public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		    tfStueckpreis.requestFocus();
		}
	    }
	});
	tfStueckzahl.setBounds(10, 25, 86, 20);
	contentPane.add(tfStueckzahl);
	tfStueckzahl.setColumns(10);

	tfStueckpreis = new JTextField();
	tfStueckpreis.addKeyListener(new KeyAdapter() {
	    @Override
	    public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		    tfRabatt.requestFocus();
		}
	    }
	});
	tfStueckpreis.setBounds(127, 25, 86, 20);
	contentPane.add(tfStueckpreis);
	tfStueckpreis.setColumns(10);

	tfRabatt = new JTextField();
	tfRabatt.addKeyListener(new KeyAdapter() {
	    @Override
	    public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		    berechnen();
		}
	    }
	});
	tfRabatt.setBounds(246, 25, 86, 20);
	contentPane.add(tfRabatt);
	tfRabatt.setColumns(10);

	JButton btnBerechnen = new JButton("Berechnen");
	btnBerechnen.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		berechnen();
	    }
	});
	btnBerechnen.setBounds(352, 24, 118, 23);
	contentPane.add(btnBerechnen);

	JButton btnEnde = new JButton("Ende");
	btnEnde.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		System.exit(0);
	    }
	});
	btnEnde.setBounds(368, 97, 89, 23);
	contentPane.add(btnEnde);

	lblErgebnis = new JLabel("");
	lblErgebnis.setBounds(10, 64, 478, 14);
	contentPane.add(lblErgebnis);
    }

    private void berechnen() {
	try {
	    if (tfStueckzahl.getText().equals(""))
		throw new LeereEingabeException("Bitte geben Sie eine Stückzahl an.");
	    if (tfStueckpreis.getText().equals(""))
		throw new LeereEingabeException("Bitte geben Sie einen Stückpreis an.");
	    if (tfRabatt.getText().equals(""))
		throw new LeereEingabeException("Bitte geben Sie einen Rabattsatz an.");
	    var stueckzahl = Integer.parseInt(tfStueckzahl.getText());
	    var stueckpreis = Double.parseDouble(tfStueckpreis.getText());
	    var rabattsatz = Double.parseDouble(tfRabatt.getText());
	    var bruttopreis = stueckzahl * stueckpreis;
	    var rabatt = bruttopreis * rabattsatz / 100;
	    var einkaufspreis = bruttopreis - rabatt;
	    var f = new DecimalFormat("#0.00");
	    lblErgebnis.setText("Der Einkaufspreis beträgt "
		    + f.format(einkaufspreis) + " €");
	    tfStueckzahl.requestFocus();
	    tfStueckzahl.selectAll();
	}
	catch (LeereEingabeException e) {
	    JOptionPane.showMessageDialog(null, e.getMessage());
	}
	catch (NumberFormatException e) {
	    lblErgebnis.setText("Formatfehler bei den Zahleneingaben.");
	}
	catch (Exception e) {
	    lblErgebnis.setText("Fehler bei der Eingabe. " + e.getMessage());
	}
    }

}
