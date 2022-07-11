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
							+ "Sie bekommen spezielles Angebot für VIP-Gäste und auch 15 % bei allen Getränken ");
					
				} else if (vip.toLowerCase().equals("ja") && frau.toLowerCase().equals("nein")) {
					JOptionPane.showMessageDialog(null,
							"Herzlich Willkommen !!! Sie bekommen spezielles Angebot für VIP-Gäste");
					
				} else if (vip.toLowerCase().equals("nein") && frau.toLowerCase().equals("ja")) {
					JOptionPane.showMessageDialog(null, "Herzlich Willkommen!!! \n"
							+ "Sie bekommen spezielles Angebot für VIP-Gäste und auch 15 % bei allen Getränken ");
					
				} else {
					JOptionPane.showMessageDialog(null, "Herzlich Willkommen !!! ");
				}
			}
		}
	}
}
