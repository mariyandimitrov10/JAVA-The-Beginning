package Exercise;

import javax.swing.JOptionPane;


public class DiscoEinlass {

	public static void main(String[] args) {
		int alter = Integer.parseInt(JOptionPane.showInputDialog("Bitte die Alter der Gast geben: "));
	
		if (alter < 18) {
			JOptionPane.showMessageDialog(null, " Disco verbot ! Geh nach Hause! ");
		} else {
			if (alter >= 18) {
				String vip = JOptionPane.showInputDialog("VIP ? Antworten Sie mit ja oder nein");
				String frau = JOptionPane.showInputDialog("Frau ? Antworten Sie mit ja oder nein");
				
				if (vip.toLowerCase().equals("ja") && frau.toLowerCase().equals("ja")) {
					JOptionPane.showMessageDialog(null, "Herzlich Willkommen !!! \n"
							+ "Sie bekommen spezielles Angebot f�r VIP-G�ste und auch 15 % bei allen Getr�nken ");
					
				} else if (vip.toLowerCase().equals("ja") && frau.toLowerCase().equals("nein")) {
					JOptionPane.showMessageDialog(null,
							"Herzlich Willkommen !!! Sie bekommen spezielles Angebot f�r VIP-G�ste");
					
				} else if (vip.toLowerCase().equals("nein") && frau.toLowerCase().equals("ja")) {
					JOptionPane.showMessageDialog(null, "Herzlich Willkommen!!! \n"
							+ "Sie bekommen spezielles Angebot f�r VIP-G�ste und auch 15 % bei allen Getr�nken ");
					
				} else {
					JOptionPane.showMessageDialog(null, "Herzlich Willkommen !!! ");
				}
			}
		}
	}
}
