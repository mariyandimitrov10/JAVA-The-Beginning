package exercise_08;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Einkauf extends JFrame {

	private JPanel contentPane;
	private JLabel lblStueckzahl;
	private JLabel lblStueckpreis;
	private JLabel lblRabatt;
	private JButton btnBerechnen;
	private JTextField tfStueckzahl;
	private JTextField tfStueckpreis;
	private JTextField tfRabatt;
	private JButton btnEnde;
	private JLabel lblResultEinkaufspreis;
	private JLabel lblAlertMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einkauf frame = new Einkauf();
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
	public Einkauf() {
		setTitle("Einkaufspreis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStueckzahl = new JLabel("Stueckzahl");
		lblStueckzahl.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStueckzahl.setBounds(10, 12, 92, 15);
		contentPane.add(lblStueckzahl);
		
		
		lblStueckpreis = new JLabel("Stueckpreis");
		lblStueckpreis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStueckpreis.setBounds(132, 12, 92, 15);
		contentPane.add(lblStueckpreis);
		
		lblRabatt = new JLabel("Rabatt ( % )");
		lblRabatt.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRabatt.setBounds(251, 12, 92, 15);
		contentPane.add(lblRabatt);
		
		btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				
				double result = 0;
				double brutto = 0;
				
				if( tfStueckzahl.getText().isEmpty() || tfStueckpreis.getText().isEmpty()
						|| tfRabatt.getText().isEmpty()) {
					lblResultEinkaufspreis.setText("Die Eingaben sind unvollstandig ! ");
				} else {
					int stueckzahl = Integer.parseInt(tfStueckzahl.getText());
					double stueckpreis = Double.parseDouble(tfStueckpreis.getText());
					double rabatt = Double.parseDouble(tfRabatt.getText());
					brutto =  stueckzahl * stueckpreis;
					result = brutto - (brutto * rabatt / 100);
					lblResultEinkaufspreis.setText("Einkaufspreis: " + f.format(result) + " €");
				}
				tfStueckzahl.requestFocus();
				tfStueckzahl.selectAll();
			}
		});
		btnBerechnen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBerechnen.setBounds(385, 30, 110, 30);
		contentPane.add(btnBerechnen);
		
		tfStueckzahl = new JTextField();
		tfStueckzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfStueckpreis.requestFocus();
					tfStueckpreis.selectAll();
				}
			}
		});
		tfStueckzahl.setHorizontalAlignment(SwingConstants.CENTER);
		tfStueckzahl.setBounds(10, 37, 96, 19);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		
		tfStueckpreis = new JTextField();
		tfStueckpreis.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfRabatt.requestFocus();
					tfRabatt.selectAll();
				}
			}
		});
		tfStueckpreis.setHorizontalAlignment(SwingConstants.CENTER);
		tfStueckpreis.setColumns(10);
		tfStueckpreis.setBounds(132, 37, 96, 19);
		contentPane.add(tfStueckpreis);
		
		tfRabatt = new JTextField();
		tfRabatt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnBerechnen.doClick();
				}
			}
		});
		tfRabatt.setHorizontalAlignment(SwingConstants.CENTER);
		tfRabatt.setColumns(10);
		tfRabatt.setBounds(251, 37, 96, 19);
		contentPane.add(tfRabatt);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnde.setBounds(415, 85, 80, 30);
		contentPane.add(btnEnde);
		
		lblResultEinkaufspreis = new JLabel("");
		lblResultEinkaufspreis.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultEinkaufspreis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultEinkaufspreis.setBounds(10, 81, 333, 19);
		contentPane.add(lblResultEinkaufspreis);
		
		lblAlertMessage = new JLabel("");
		lblAlertMessage.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAlertMessage.setBounds(84, 145, 263, 13);
		contentPane.add(lblAlertMessage);
		setLocationRelativeTo(null);
	}

}
