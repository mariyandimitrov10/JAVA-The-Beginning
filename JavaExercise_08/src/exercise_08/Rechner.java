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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rechner extends JFrame {

	private JPanel contentPane;
	private JLabel lblOperand1;
	private JLabel lblOperand2;
	private JTextField tfOperand1;
	private JTextField tfOperand2;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultiplizieren;
	private JButton btnDividieren;
	private JLabel lblErgebnis;
	private JTextField tfErgebniss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner frame = new Rechner();
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
	public Rechner() {
		setTitle("Rechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblOperand1 = new JLabel("Operand 1");
		lblOperand1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOperand1.setBounds(10, 10, 100, 21);
		contentPane.add(lblOperand1);
		
		lblOperand2 = new JLabel("Operand 2");
		lblOperand2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOperand2.setBounds(282, 10, 100, 21);
		contentPane.add(lblOperand2);
		
		tfOperand1 = new JTextField();
		tfOperand1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfOperand2.requestFocus();
				}
			}
		});
		tfOperand1.setBounds(10, 41, 96, 21);
		contentPane.add(tfOperand1);
		tfOperand1.setColumns(10);
		
		tfOperand2 = new JTextField();
		tfOperand2.setColumns(10);
		tfOperand2.setBounds(282, 41, 96, 21);
		contentPane.add(tfOperand2);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				double operand1 = Double.parseDouble(tfOperand1.getText());
				double operand2 = Double.parseDouble(tfOperand2.getText());
				
				double resultPlus = operand1 + operand2;
				
				tfErgebniss.setText(f.format(resultPlus));
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(119, 38, 68, 32);
		contentPane.add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				double operand1 = Double.parseDouble(tfOperand1.getText());
				double operand2 = Double.parseDouble(tfOperand2.getText());
				
				double resultMinus = operand1 - operand2;
				
				tfErgebniss.setText(f.format(resultMinus));
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(204, 38, 68, 32);
		contentPane.add(btnMinus);
		
		btnMultiplizieren = new JButton("*");
		btnMultiplizieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				double operand1 = Double.parseDouble(tfOperand1.getText());
				double operand2 = Double.parseDouble(tfOperand2.getText());
				
				double resultMultiplizieren = operand1 * operand2;
				
				tfErgebniss.setText(f.format(resultMultiplizieren));
			}
		});
		btnMultiplizieren.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplizieren.setBounds(119, 84, 68, 32);
		contentPane.add(btnMultiplizieren);
		
		btnDividieren = new JButton("/");
		btnDividieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				double operand1 = Double.parseDouble(tfOperand1.getText());
				double operand2 = Double.parseDouble(tfOperand2.getText());
				
				double resultDividieren = operand1 / operand2;
				
				tfErgebniss.setText(f.format(resultDividieren));
			}
		});
		btnDividieren.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDividieren.setBounds(204, 84, 68, 32);
		contentPane.add(btnDividieren);
		
		lblErgebnis = new JLabel("Ergebnis");
		lblErgebnis.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblErgebnis.setBounds(22, 139, 88, 26);
		contentPane.add(lblErgebnis);
		
		tfErgebniss = new JTextField();
		tfErgebniss.setEditable(false);
		tfErgebniss.setFont(new Font("Tahoma", Font.BOLD, 13));
		tfErgebniss.setBounds(10, 167, 358, 19);
		contentPane.add(tfErgebniss);
		tfErgebniss.setColumns(10);
	}

}
