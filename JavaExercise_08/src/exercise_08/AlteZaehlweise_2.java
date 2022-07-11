package exercise_08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AlteZaehlweise_2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblStueckzahl;
	private JTextField tfStueckzahl;
	private JButton btnUmrechnen;
	private JLabel lblGros;
	private JLabel lblSchock;
	private JLabel lblDutzend;
	private JLabel lblStueck;
	private JButton btnEnde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteZaehlweise_2 frame = new AlteZaehlweise_2();
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
	public AlteZaehlweise_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStueckzahl = new JLabel("Geben Sie eine Stückzahl ein: ");
		lblStueckzahl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStueckzahl.setBounds(10, 11, 181, 14);
		contentPane.add(lblStueckzahl);
		
		tfStueckzahl = new JTextField();
		tfStueckzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnUmrechnen.doClick();
				}
			}
		});
		tfStueckzahl.setBounds(10, 36, 141, 20);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		btnUmrechnen = new JButton("In alte Zählmaße umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfStueckzahl.getText() != null && !tfStueckzahl.getText().isEmpty()) {
					int stueck = Integer.parseInt(tfStueckzahl.getText());
					
					lblGros.setText(String.valueOf((int)(stueck / 144)) + " Gros");
					int rest = stueck % 144;
					
					lblSchock.setText((String.valueOf((int) (rest / 60) )) + " Schock");
					rest = rest % 60;
					
					lblDutzend.setText(String.valueOf((int) (rest / 12)) + " Dutzend");
					rest %= 12;
					
					lblStueck.setText(rest + " Stück");
					
					tfStueckzahl.requestFocus();
					tfStueckzahl.selectAll();
				}	
			}
		});
		btnUmrechnen.setBounds(181, 36, 243, 23);
		contentPane.add(btnUmrechnen);
		
		lblGros = new JLabel("Gros");
		lblGros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGros.setBounds(10, 91, 57, 14);
		contentPane.add(lblGros);
		
		lblSchock = new JLabel("Schock");
		lblSchock.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSchock.setBounds(10, 116, 57, 14);
		contentPane.add(lblSchock);
		
		lblDutzend = new JLabel("Dutzend");
		lblDutzend.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDutzend.setBounds(10, 141, 57, 14);
		contentPane.add(lblDutzend);
		
		lblStueck = new JLabel("Stück");
		lblStueck.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStueck.setBounds(10, 166, 57, 14);
		contentPane.add(lblStueck);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(335, 162, 89, 23);
		contentPane.add(btnEnde);
	}

}