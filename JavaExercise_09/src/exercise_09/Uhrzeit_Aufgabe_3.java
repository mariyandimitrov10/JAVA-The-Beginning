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
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Uhrzeit_Aufgabe_3 extends JFrame {

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
					Uhrzeit_Aufgabe_3 frame = new Uhrzeit_Aufgabe_3();
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
	public Uhrzeit_Aufgabe_3() {
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
		tfStunden.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfMinuten.requestFocus();
					tfMinuten.selectAll();
				}
			}
		});
		tfStunden.setFont(new Font("Tahoma", Font.BOLD, 10));
		tfStunden.setBounds(10, 39, 96, 19);
		contentPane.add(tfStunden);
		tfStunden.setColumns(10);
		
		tfMinuten = new JTextField();
		tfMinuten.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnUebernehmen.requestFocus();
					btnUebernehmen.doClick();
				}
			}
		});
		tfMinuten.setFont(new Font("Tahoma", Font.BOLD, 10));
		tfMinuten.setColumns(10);
		tfMinuten.setBounds(146, 39, 96, 19);
		contentPane.add(tfMinuten);
		
		btnUebernehmen = new JButton("\u00DCbernehmen");
		btnUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblAusgabe.setText("Ihre Uhrzeit ist "
						    + tfStunden.getText() + ":" + tfMinuten.getText() + " Uhr.");
				    int stunden = Integer.parseInt(tfStunden.getText());
				    if ((stunden > 23) || (stunden < 0)) {
				    	throw new NumberFormatException(
				    			"Bitte nur Stundenwerte von 0 bis 23 !");
				    }
				    int minuten = Integer.parseInt(tfMinuten.getText());
				    if ((minuten == 0) || (minuten < 10)) {
				    	lblAusgabe.setText("Ihre Uhrzeit ist "
							    + tfStunden.getText() + ":0" + tfMinuten.getText() + " Uhr.");	
				    }
				    if ((minuten > 59) || (minuten < 0)) {
				    	throw new NumberFormatException(
				    			"Bitte nur Minutenwerte von 0 bis 59 !");
				    }
				} catch (NumberFormatException e1) {
				    lblAusgabe.setText(e1.getMessage());
				    //lblAusgabe.setText("Ungültige Uhrzeit ! ");
				}
				tfStunden.requestFocus();
				tfStunden.selectAll();
			}
		});
		btnUebernehmen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUebernehmen.setBounds(279, 38, 147, 32);
		contentPane.add(btnUebernehmen);
		
		lblAusgabe = new JLabel("");
		lblAusgabe.setHorizontalTextPosition(SwingConstants.LEFT);
		lblAusgabe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAusgabe.setBounds(10, 80, 282, 32);
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
