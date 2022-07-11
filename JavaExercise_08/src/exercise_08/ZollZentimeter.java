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
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class ZollZentimeter extends JFrame {

	private JPanel contentPane;
	private JLabel lblZoll;
	private JTextField tfZoll;
	private JButton btnUmrechnen;
	private JButton btnEnde;
	private JLabel lblErgebnis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZollZentimeter frame = new ZollZentimeter();
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
	public ZollZentimeter() {
		setTitle("Umrechnung von Zoll in Zentimeter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblZoll = new JLabel("Zoll");
		lblZoll.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblZoll.setBounds(10, 24, 57, 21);
		contentPane.add(lblZoll);
		
		tfZoll = new JTextField();
		tfZoll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnUmrechnen.doClick();
				}
			}
		});
		tfZoll.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfZoll.setBounds(10, 55, 114, 18);
		contentPane.add(tfZoll);
		tfZoll.setColumns(10);
		
		btnUmrechnen = new JButton("Umrechnen");
		
			
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				double zoll = Double.parseDouble(tfZoll.getText());
				double ergebnis = zoll * 2.54;
				lblErgebnis.setText(" = " + f.format(ergebnis) + " cm.");
				
				tfZoll.requestFocus();
				tfZoll.selectAll();
			}
		});
		btnUmrechnen.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUmrechnen.setBounds(10, 105, 128, 33);
		contentPane.add(btnUmrechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnde.setBounds(228, 106, 114, 33);
		contentPane.add(btnEnde);
		
		lblErgebnis = new JLabel("");
		lblErgebnis.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblErgebnis.setHorizontalAlignment(SwingConstants.LEFT);
		lblErgebnis.setBounds(134, 55, 114, 18);
		contentPane.add(lblErgebnis);
	}
}
