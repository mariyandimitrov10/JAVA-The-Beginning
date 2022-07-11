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
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Osterdatum extends JFrame {

	private JPanel contentPane;
	private JLabel lblJahr;
	private JTextField tfJahr;
	private JButton btnDatumBerechnen;
	private JLabel lblDatumOstersonntag;
	private JButton btnEnde;
	private JLabel lblDatumErgebniss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Osterdatum frame = new Osterdatum();
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
	public Osterdatum() {
		setTitle("Osterdatum");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblJahr = new JLabel("Jahr");
		lblJahr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJahr.setBounds(10, 10, 62, 17);
		contentPane.add(lblJahr);

		tfJahr = new JTextField();
		tfJahr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnDatumBerechnen.doClick();
				}
			}
		});
		tfJahr.setFont(new Font("Tahoma", Font.BOLD, 13));
		tfJahr.setBounds(10, 37, 96, 19);
		contentPane.add(tfJahr);
		tfJahr.setColumns(10);

		btnDatumBerechnen = new JButton("Datum f\u00FCr Ostersonntag berechnen");
		btnDatumBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!tfJahr.getText().isEmpty()) {
					int y = Integer.parseInt(tfJahr.getText());
					if (y > 1583) {
						int g = y % 19;
						int c = y % 100;
						int h = (c - c / 4 - (8 * c + 13) / 25 + 19 * g + 15) % 30;
						int i = h - (h / 28) * (1 - (29 / (h + 1)) * ((21 - g) / 11));
						int j = (y + y / 4 + i + 2 - c + c / 4) % 7;
						int l = i - j;
						int m = 3 + (l + 40) / 44;
						int d = l + 28 - 31 * (m / 4);
						lblDatumErgebniss.setText(d + ". " + m + "." + y);
					} else {
						lblDatumErgebniss.setText("Berechnung nur für Jahreszahl > 1583");
					}
					tfJahr.requestFocus();
					tfJahr.selectAll();
				}else {
					lblDatumErgebniss.setText("Geben Sie ein Jahr ein !");
				}
			}
		});
		btnDatumBerechnen.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDatumBerechnen.setBounds(135, 37, 301, 21);
		contentPane.add(btnDatumBerechnen);

		lblDatumOstersonntag = new JLabel("Datum f\u00FCr Ostersonntag:");
		lblDatumOstersonntag.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatumOstersonntag.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatumOstersonntag.setBounds(10, 96, 200, 19);
		contentPane.add(lblDatumOstersonntag);

		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnde.setBounds(228, 152, 103, 34);
		contentPane.add(btnEnde);

		lblDatumErgebniss = new JLabel("");
		lblDatumErgebniss.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatumErgebniss.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDatumErgebniss.setBounds(236, 96, 320, 19);
		contentPane.add(lblDatumErgebniss);
	}

}
