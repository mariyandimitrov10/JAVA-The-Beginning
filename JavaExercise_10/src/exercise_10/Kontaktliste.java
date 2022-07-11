package exercise_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Kontaktliste extends JFrame {

	private JPanel contentPane;
	private JLabel lblNachname;
	private JLabel lblVorname;
	private JLabel lblTelefon;
	private JTextField tfNachname;
	private JTextField tfVorname;
	private JTextField tfTelefon;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JButton btnUebernehmen;
	private JLabel lblKontaktliste;
	private JButton btnEnde;
	
	private JList listKontakte;
	private JScrollPane scrollPane;
	private DefaultListModel <String> kontakte;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kontaktliste frame = new Kontaktliste();
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
	public Kontaktliste() {
		setTitle("Kontaktliste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(10, 10, 83, 19);
		contentPane.add(lblNachname);
		
		lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(165, 10, 83, 19);
		contentPane.add(lblVorname);
		
		lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(312, 10, 83, 19);
		contentPane.add(lblTelefon);
		
		tfNachname = new JTextField();
		tfNachname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfVorname.requestFocus();
					tfVorname.selectAll();
				}
			}
		});
		tfNachname.setBounds(10, 28, 126, 19);
		contentPane.add(tfNachname);
		tfNachname.setColumns(10);
		
		tfVorname = new JTextField();
		tfVorname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfTelefon.requestFocus();
					tfTelefon.selectAll();
				}
			}
		});
		tfVorname.setColumns(10);
		tfVorname.setBounds(165, 28, 126, 19);
		contentPane.add(tfVorname);
		
		tfTelefon = new JTextField();
		tfTelefon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfEmail.requestFocus();
					tfEmail.selectAll();
				}
			}
		});
		tfTelefon.setColumns(10);
		tfTelefon.setBounds(312, 28, 126, 19);
		contentPane.add(tfTelefon);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 74, 83, 19);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if( e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnUebernehmen.doClick();
				}
			}
		});
		tfEmail.setBounds(10, 91, 281, 19);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		btnUebernehmen = new JButton("\u00DCbernehmen >>");
		btnUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfNachname.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Kein Name angegeben.");
				    tfNachname.requestFocus();
				} else {
				    kontakte.addElement(tfNachname.getText() + ";"
					    + tfVorname.getText() + ";" + tfTelefon.getText() + ";"
					    + tfEmail.getText());
				    tfNachname.setText("");
				    tfVorname.setText("");
				    tfTelefon.setText("");
				    tfEmail.setText("");
				    tfNachname.requestFocus();
				}
			}
		});
		btnUebernehmen.setBounds(310, 90, 128, 20);
		contentPane.add(btnUebernehmen);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 504, 105);
		contentPane.add(scrollPane);
		
		JList <String> listKontakte = new JList<>();
		scrollPane.setViewportView(listKontakte);
		
		lblKontaktliste = new JLabel("Kontaktliste");
		lblKontaktliste.setBounds(10, 131, 126, 13);
		contentPane.add(lblKontaktliste);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(331, 239, 95, 24);
		contentPane.add(btnEnde);
		
		kontakte = new DefaultListModel<>();
		listKontakte.setModel(kontakte);
		
	}
}
