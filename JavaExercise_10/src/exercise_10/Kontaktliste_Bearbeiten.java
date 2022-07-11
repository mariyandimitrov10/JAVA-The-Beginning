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
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;


public class Kontaktliste_Bearbeiten extends JFrame {

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
	
	private DefaultListModel <String> kontakte;
	private JList listKontakte;
	private JButton btnLoeschen;
	private JButton btnBearbeiten;
	private final HashMap<String, Integer> INDEX_MAP;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kontaktliste_Bearbeiten frame = new Kontaktliste_Bearbeiten();
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
	public Kontaktliste_Bearbeiten() {
		setTitle("Kontaktliste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		INDEX_MAP = new HashMap<>();
		INDEX_MAP.put("Nachname", 0);
		INDEX_MAP.put("Vorname", 1);
		INDEX_MAP.put("Telefon", 2);
		INDEX_MAP.put("EMail", 3);
		
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
		
		
		btnUebernehmen = new JButton("\u00DCbernehmen");
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
		btnUebernehmen.setBounds(310, 90, 116, 20);
		contentPane.add(btnUebernehmen);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 431, 105);
		contentPane.add(scrollPane);
		
		JList <String> listKontakte = new JList<>();
		listKontakte.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
		btnEnde.setBounds(346, 239, 95, 24);
		contentPane.add(btnEnde);
		
		kontakte = new DefaultListModel<>();
		listKontakte.setModel(kontakte);
		
		btnLoeschen = new JButton("markierte Eintrag l\u00F6schen");
		btnLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				int i = listKontakte.getSelectedIndex();
			    if (i >= 0) {
				kontakte.remove(i);
			    } else {
				JOptionPane.showMessageDialog(null, "Kein Eintrag markiert.");
			    }
			}
		});
		btnLoeschen.setBounds(8, 241, 205, 21);
		contentPane.add(btnLoeschen);
		
		btnBearbeiten = new JButton("Bearbeiten");
		btnBearbeiten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//entryString enthaelt Selected Item aus der Liste, ungetrennt
				String entryString = new String();
				
				//entryStringArr enthaelt jede Kategorie getrennt nach Semikolon
				String[] entryStringArr = new String[INDEX_MAP.size()];
				
				entryString = kontakte.getElementAt(listKontakte.getSelectedIndex());
				entryStringArr = entryString.split(";");
				
				//Einzelne Werte innerhalb entryStringArr werden in Textfelder gesetzt
				//um richtigen Index herauszufinden, schlage ich in der INDEX_MAP nach, 
				//auf welchem Index Vorname, Nachname usw gespeichert wurde
				tfNachname.setText(entryStringArr[INDEX_MAP.get("Nachname")]);
				tfVorname.setText(entryStringArr[INDEX_MAP.get("Vorname")]);
				tfTelefon.setText(entryStringArr[INDEX_MAP.get("Telefon")]);
				tfEmail.setText(entryStringArr[INDEX_MAP.get("EMail")]);
				
				//sobald selected Item wieder in den Textfeldern steht, wird es aus der Liste entfernt
				kontakte.remove(listKontakte.getSelectedIndex());
			}
		});
		btnBearbeiten.setBounds(223, 241, 113, 21);
		contentPane.add(btnBearbeiten);

	}
}
