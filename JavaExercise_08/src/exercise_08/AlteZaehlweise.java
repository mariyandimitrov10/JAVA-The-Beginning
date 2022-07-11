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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AlteZaehlweise extends JFrame {

	private JPanel contentPane;
	private JLabel lblStueckzahl;
	private JTextField tfStueckzahl;
	private JButton btnUmrechnen;
	private JButton btnEnde;
	private JLabel lblGros;
	private JLabel lblSchock;
	private JLabel lblDutzend;
	private JLabel lblStueck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteZaehlweise frame = new AlteZaehlweise();
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
	public AlteZaehlweise() {
		setTitle("Alte Zählweise");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 214);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStueckzahl = new JLabel("Geben Sie eine St\u00FCckzahl an:");
		lblStueckzahl.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStueckzahl.setBounds(10, 10, 163, 23);
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
		tfStueckzahl.setFont(new Font("Tahoma", Font.BOLD, 10));
		tfStueckzahl.setBounds(10, 40, 88, 19);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		btnUmrechnen = new JButton("In alte Z\u00E4hlma\u00DFe umrechnen");
			
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
		btnUmrechnen.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnUmrechnen.setBounds(191, 39, 215, 23);
		contentPane.add(btnUmrechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnde.setBounds(256, 127, 103, 36);
		contentPane.add(btnEnde);
		
		lblGros = new JLabel("Gros");
		lblGros.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblGros.setBounds(10, 90, 70, 13);
		contentPane.add(lblGros);
		
		lblSchock = new JLabel("Schock");
		lblSchock.setHorizontalAlignment(SwingConstants.LEFT);
		lblSchock.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSchock.setBounds(10, 110, 70, 13);
		contentPane.add(lblSchock);
		
		lblDutzend = new JLabel("Dutzend");
		lblDutzend.setHorizontalAlignment(SwingConstants.LEFT);
		lblDutzend.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblDutzend.setBounds(10, 130, 70, 13);
		contentPane.add(lblDutzend);
		
		lblStueck = new JLabel("St\u00FCck");
		lblStueck.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStueck.setBounds(10, 150, 70, 13);
		contentPane.add(lblStueck);
	}

}
