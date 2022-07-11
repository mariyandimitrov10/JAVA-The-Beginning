package exercise_08;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Einkauf_2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfQuantity;
	private JTextField tfUnitPrice;
	private JTextField tfDiscount;
	private JLabel lblResult;
	private JButton btnCalculation;
	private JLabel lblQuantity;
	private JLabel lblUnitPrice;
	private JLabel lblDiscount;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einkauf_2 frame = new Einkauf_2();
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
	public Einkauf_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Einkaufspreis");
		setLocationRelativeTo(null);
		
		lblQuantity = new JLabel("St\u00FCckzahl");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantity.setBounds(10, 11, 79, 14);
		contentPane.add(lblQuantity);
		
		tfQuantity = new JTextField();
		tfQuantity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfUnitPrice.requestFocus();
					tfUnitPrice.selectAll();
				}
			}
		});
		tfQuantity.setBounds(10, 36, 86, 20);
		contentPane.add(tfQuantity);
		tfQuantity.setColumns(10);
		
		lblUnitPrice = new JLabel("St\u00FCckpreis");
		lblUnitPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUnitPrice.setBounds(134, 11, 79, 14);
		contentPane.add(lblUnitPrice);
		
		tfUnitPrice = new JTextField();
		tfUnitPrice.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfDiscount.requestFocus();
					tfDiscount.selectAll();
				}
			}
		});
		tfUnitPrice.setColumns(10);
		tfUnitPrice.setBounds(134, 36, 86, 20);
		contentPane.add(tfUnitPrice);
		
		lblDiscount = new JLabel("Rabatt (%)");
		lblDiscount.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDiscount.setBounds(260, 11, 79, 14);
		contentPane.add(lblDiscount);
		
		tfDiscount = new JTextField();
		tfDiscount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnCalculation.doClick();
				}
			}
		});
		tfDiscount.setColumns(10);
		tfDiscount.setBounds(260, 36, 86, 20);
		contentPane.add(tfDiscount);
		
		btnCalculation = new JButton("Berechnung");
		btnCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfQuantity.getText().isEmpty() && !tfUnitPrice.getText().isEmpty() && !tfDiscount.getText().isEmpty()) {
					//(E) Eingaben holen 
					double quantity = Double.parseDouble(tfQuantity.getText());
					double unitPrice = Double.parseDouble(tfUnitPrice.getText());
					double discount = Double.parseDouble(tfDiscount.getText());
					
					//(V) Werte verarbeiten
					double result = quantity * unitPrice * ((100 - discount) / 100);
					
					//(A) Ergebnis ausgeben
					lblResult.setText("Ergebnis: " + String.format("%.2f", result) + "€");
					
					//Focus zurück auf das Stueckzahl Textfeld damit User von vorne beginnen kann
					tfQuantity.requestFocus();
					tfQuantity.selectAll();
				} else {
					lblResult.setText("Die Eingaben sind unvollständig!");
				}
			}
		});
		btnCalculation.setBounds(428, 35, 214, 23);
		contentPane.add(btnCalculation);
		
		lblResult = new JLabel("");
		lblResult.setBounds(10, 116, 401, 14);
		contentPane.add(lblResult);
		
		btnExit = new JButton("Ende");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(553, 107, 89, 23);
		contentPane.add(btnExit);

	}
}