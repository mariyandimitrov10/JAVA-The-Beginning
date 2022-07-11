package exercise_09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uhrzeit_Aufgabe_2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblStunden;
	private JLabel lblMinuten;
	private JTextField tfStunden;
	private JTextField tfMinuten;
	private JButton btnUebernehmen;
	private JLabel lblAusgabe;
	private JButton btnEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uhrzeit_Aufgabe_2 frame = new Uhrzeit_Aufgabe_2();
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
	public Uhrzeit_Aufgabe_2() {
		setTitle("Uhrzeit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStunden = new JLabel("Stunden");
		lblStunden.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStunden.setBounds(10, 10, 96, 22);
		contentPane.add(lblStunden);
		
		lblMinuten = new JLabel("Minuten");
		lblMinuten.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblMinuten.setBounds(146, 10, 96, 22);
		contentPane.add(lblMinuten);
		
		tfStunden = new JTextField();
		tfStunden.setFont(new Font("Tahoma", Font.BOLD, 10));
		tfStunden.setBounds(10, 39, 96, 19);
		contentPane.add(tfStunden);
		tfStunden.setColumns(10);
		
		tfMinuten = new JTextField();
		tfMinuten.setFont(new Font("Tahoma", Font.BOLD, 10));
		tfMinuten.setColumns(10);
		tfMinuten.setBounds(146, 39, 96, 19);
		contentPane.add(tfMinuten);
		
		btnUebernehmen = new JButton("\u00DCbernehmen");
		btnUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int stunden = Integer.parseInt(tfStunden.getText());
					if ((stunden > 23) || (stunden < 0)) {
				    	throw new UhrzeitFormatException(
				    			"Ungültige Stundenangabe !");
				    }
					int minuten = Integer.parseInt(tfMinuten.getText());
					if ((minuten > 59) || (minuten < 0)) {
				    	throw new UhrzeitFormatException(
				    			"Ungültige Minutenangabe !");
				    }
				    lblAusgabe.setText("Ihre Uhrzeit ist "
					    + String.format("%02d:%02d", stunden, minuten)+ " Uhr.");
				} catch (UhrzeitFormatException u1) {
				    lblAusgabe.setText(u1.getMessage());
				} catch (NumberFormatException nfe) {
				    lblAusgabe.setText("Ungültige Uhrzeit.");	    
				} catch (Exception nfe) {
					nfe.printStackTrace();
				}
				tfStunden.requestFocus();
				tfStunden.selectAll();
			}
		});
		btnUebernehmen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUebernehmen.setBounds(279, 38, 147, 32);
		contentPane.add(btnUebernehmen);
		
		lblAusgabe = new JLabel("");
		lblAusgabe.setBounds(10, 94, 255, 22);
		contentPane.add(lblAusgabe);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnde.setBounds(302, 123, 106, 32);
		contentPane.add(btnEnde);
	}
	
}
