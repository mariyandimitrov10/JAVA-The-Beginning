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
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	private JTextField tfFahrenheit;
	private JTextField tfCelsius;
	private JLabel lblFahrenheit;
	private JLabel lblCelsius;
	private JButton btnUmrechnen;
	private JButton btnEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FahrenheitCelsius frame = new FahrenheitCelsius();
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
	public FahrenheitCelsius() {
		setTitle("Umrechnung Fahrenheit in Celsius");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null); // Programm wird in der Mitte gezeigt !!! 
		
		lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblFahrenheit.setBounds(10, 10, 107, 19);
		contentPane.add(lblFahrenheit);
		
		tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnUmrechnen.doClick();
				}
			}
		});
		tfFahrenheit.setBounds(10, 33, 126, 19);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);
		
		lblCelsius = new JLabel("Grad Celsius");
		lblCelsius.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCelsius.setBounds(10, 78, 107, 13);
		contentPane.add(lblCelsius);
		
		tfCelsius = new JTextField();
		tfCelsius.setBounds(10, 101, 251, 19);
		contentPane.add(tfCelsius);
		tfCelsius.setColumns(10);
		
		btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				try {
					double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
					double celsius = (fahrenheit - 32) * 5 / 9;
				
					tfCelsius.setText(f.format(celsius));
					tfFahrenheit.requestFocus();
					tfFahrenheit.selectAll();
				} catch (Exception e1){
					tfCelsius.setText("Keine korrekte Fahrenheit-Temperatur.");
				}
			}
		});
		btnUmrechnen.setBounds(262, 42, 164, 33);
		contentPane.add(btnUmrechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(313, 100, 102, 33);
		contentPane.add(btnEnde);
	}
}
