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

public class Rechner_2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblOperand1;
	private JTextField tfOperand1;
	private JLabel lblOperand2;
	private JTextField tfOperand2;
	private JButton btnAddiere;
	private JButton btnSubtrahiere;
	private JButton btnMultipliziere;
	private JButton btnDividiere;
	private JLabel lblErgebnis;
	private JTextField tfErgebnis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner_2 frame = new Rechner_2();
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
	public Rechner_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Rechner");
		
		lblOperand1 = new JLabel("Operand 1");
		lblOperand1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOperand1.setBounds(10, 11, 70, 14);
		contentPane.add(lblOperand1);
		
		tfOperand1 = new JTextField();
		tfOperand1.setBounds(10, 33, 86, 20);
		contentPane.add(tfOperand1);
		tfOperand1.setColumns(10);
		
		lblOperand2 = new JLabel("Operand 2");
		lblOperand2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOperand2.setBounds(339, 11, 70, 14);
		contentPane.add(lblOperand2);
		
		tfOperand2 = new JTextField();
		tfOperand2.setColumns(10);
		tfOperand2.setBounds(338, 33, 86, 20);
		contentPane.add(tfOperand2);
		
		btnAddiere = new JButton("+");
		btnAddiere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfOperand1.getText().isEmpty() && !tfOperand2.getText().isEmpty()) {
					double result = Double.parseDouble(tfOperand1.getText()) 
							+ Double.parseDouble(tfOperand2.getText());
					tfErgebnis.setText(tfOperand1.getText() + " + " + tfOperand2.getText() + " = " + result);
				} else {
					tfErgebnis.setText("Eingaben unvollständig!");
				}
			}
		});
		btnAddiere.setBounds(120, 11, 89, 23);
		contentPane.add(btnAddiere);
		
		btnSubtrahiere = new JButton("-");
		btnSubtrahiere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfOperand1.getText().isEmpty() && !tfOperand2.getText().isEmpty()) {
					double result = Double.parseDouble(tfOperand1.getText()) 
							- Double.parseDouble(tfOperand2.getText());
					tfErgebnis.setText(tfOperand1.getText() + " - " + tfOperand2.getText() + " = " + result);
				} else {
					tfErgebnis.setText("Eingaben unvollständig!");
				}
			}
		});
		btnSubtrahiere.setBounds(219, 11, 89, 23);
		contentPane.add(btnSubtrahiere);
		
		btnMultipliziere = new JButton("*");
		btnMultipliziere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfOperand1.getText().isEmpty() && !tfOperand2.getText().isEmpty()) {
					double result = Double.parseDouble(tfOperand1.getText()) 
							* Double.parseDouble(tfOperand2.getText());
					tfErgebnis.setText(tfOperand1.getText() + " * " + tfOperand2.getText() + " = " + result);
				} else {
					tfErgebnis.setText("Eingaben unvollständig!");
				}
			}
		});
		btnMultipliziere.setBounds(120, 45, 89, 23);
		contentPane.add(btnMultipliziere);
		
		btnDividiere = new JButton("/");
		btnDividiere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfOperand1.getText().isEmpty() && !tfOperand2.getText().isEmpty() && !tfOperand2.getText().equals("0")) {
					double result = Double.parseDouble(tfOperand1.getText()) 
							/ Double.parseDouble(tfOperand2.getText());
					tfErgebnis.setText(tfOperand1.getText() + " / " + tfOperand2.getText() + " = " + result);
				} else {
					tfErgebnis.setText("Eingaben unvollständig! Oder du Hans hast durch 0 geteilt! Du bist nicht Chuck Norris!");
				}
			}
		});
		btnDividiere.setBounds(219, 45, 89, 23);
		contentPane.add(btnDividiere);
		
		lblErgebnis = new JLabel("Ergebnis");
		lblErgebnis.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblErgebnis.setBounds(10, 110, 70, 14);
		contentPane.add(lblErgebnis);
		
		tfErgebnis = new JTextField();
		tfErgebnis.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tfErgebnis.setEditable(false);
		tfErgebnis.setBounds(10, 135, 414, 20);
		contentPane.add(tfErgebnis);
		tfErgebnis.setColumns(10);
	}
}