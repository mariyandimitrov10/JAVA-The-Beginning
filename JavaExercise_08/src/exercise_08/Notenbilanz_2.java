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
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Notenbilanz_2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfQuantityGrades;
	private JLabel lblInputGrade;
	private JTextField tfInputGrade;
	private JLabel lblQuantityGrades;
	private JLabel lblQuantityEnteredGrades;
	private JLabel lblAverageGrade;
	private JLabel lblBestGrade;
	private JLabel lblWorstGrade;
	private JButton btnApplyGrade;
	private JButton btnApplyQuantity;
	private JButton btnReset;
	private JButton btnEnd;
	
	private double[] noten;
	private int arrIndex;
	private double sum = 0;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notenbilanz_2 frame = new Notenbilanz_2();
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
	public Notenbilanz_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Notenbilanz");
		setLocationRelativeTo(null);
		
		lblQuantityGrades = new JLabel("Anzahl Noten");
		lblQuantityGrades.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantityGrades.setBounds(10, 19, 89, 14);
		contentPane.add(lblQuantityGrades);
		
		tfQuantityGrades = new JTextField();
		tfQuantityGrades.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnApplyQuantity.doClick();
				}
			}
		});
		tfQuantityGrades.setBounds(13, 36, 86, 20);
		contentPane.add(tfQuantityGrades);
		tfQuantityGrades.setColumns(10);
		
		lblInputGrade = new JLabel("1. Note");
		lblInputGrade.setVisible(false);
		lblInputGrade.setForeground(Color.BLACK);
		lblInputGrade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInputGrade.setBounds(10, 86, 89, 14);
		contentPane.add(lblInputGrade);
		
		tfInputGrade = new JTextField();
		tfInputGrade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnApplyGrade.doClick();
				}
			}
		});
		tfInputGrade.setVisible(false);
		tfInputGrade.setBounds(13, 103, 86, 20);
		contentPane.add(tfInputGrade);
		tfInputGrade.setColumns(10);
		
		btnApplyQuantity = new JButton("\u00DCbernehmen");
		btnApplyQuantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!tfQuantityGrades.getText().isEmpty()) {
					noten = new double[Integer.parseInt(tfQuantityGrades.getText())];
				}
				
				lblInputGrade.setVisible(true);
				tfInputGrade.setVisible(true);
				tfInputGrade.requestFocus();
				btnApplyGrade.setVisible(true);
			}
		});
		btnApplyQuantity.setBounds(125, 35, 166, 23);
		contentPane.add(btnApplyQuantity);
		
		btnApplyGrade = new JButton("\u00DCbernehmen");
		btnApplyGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hinzufuegen der Noten zum Array mit Pruefung ob Note eingetragen werden darf
				if(arrIndex < noten.length) {
					noten[arrIndex] = Double.parseDouble(tfInputGrade.getText());
					sum += noten[arrIndex];
					arrIndex++;
					
					tfInputGrade.requestFocus();
					tfInputGrade.selectAll();
				}
				
				if(arrIndex == noten.length) {
					
					tfInputGrade.setEditable(false);
					btnApplyGrade.setVisible(false);
					lblInputGrade.setVisible(false);
					
					//Ergebnisausgaben
					lblQuantityEnteredGrades.setText("Anzahl einegebener Noten: " + String.valueOf(noten.length));
					
					//Array sortieren um Max-Note und Min-Note zu erfahren
					Arrays.sort(noten);
					
					lblWorstGrade.setText("Schlechteste Note: " + String.valueOf(noten[noten.length -1]));
					lblBestGrade.setText("Beste Note: " + String.valueOf(noten[0]));
					
					//Notendurchschnitt berechnen mit bereits berechneter Summe
					lblAverageGrade.setText("Notendurchschnitt: " + String.valueOf(String.format("%.2f", sum / noten.length)));
					
					btnReset.setVisible(true);
					btnReset.requestFocus();
				} else {
					lblInputGrade.setText((arrIndex + 1) + ". Note");
				}
				
				
			}
		});
		btnApplyGrade.setVisible(false);
		btnApplyGrade.setBounds(125, 102, 166, 23);
		contentPane.add(btnApplyGrade);
		
		lblQuantityEnteredGrades = new JLabel("");
		lblQuantityEnteredGrades.setBounds(10, 153, 281, 14);
		contentPane.add(lblQuantityEnteredGrades);
		
		lblAverageGrade = new JLabel("");
		lblAverageGrade.setBounds(10, 178, 281, 14);
		contentPane.add(lblAverageGrade);
		
		lblBestGrade = new JLabel("");
		lblBestGrade.setBounds(10, 203, 275, 14);
		contentPane.add(lblBestGrade);
		
		lblWorstGrade = new JLabel("");
		lblWorstGrade.setBounds(10, 228, 281, 14);
		contentPane.add(lblWorstGrade);
		
		btnReset = new JButton("Neue Berechnung");
		btnReset.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnReset.doClick();
				}
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//zurueck setzen der Laufvariablen
				sum = 0;
				arrIndex = 0;
				
				tfInputGrade.setEditable(true);
				tfInputGrade.setVisible(false);
				tfInputGrade.setText("");
			
				
				lblQuantityEnteredGrades.setText("");
				lblBestGrade.setText("");
				lblWorstGrade.setText("");
				lblAverageGrade.setText("");
				
				tfQuantityGrades.setText("");
				tfQuantityGrades.requestFocus();
				
				lblInputGrade.setText((arrIndex + 1) + ". Note");
				btnReset.setVisible(false);
			}
		});
		btnReset.setVisible(false);
		btnReset.setBounds(301, 35, 183, 23);
		contentPane.add(btnReset);
		
		btnEnd = new JButton("Ende");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnd.setBounds(395, 227, 89, 23);
		contentPane.add(btnEnd);
	}
}
