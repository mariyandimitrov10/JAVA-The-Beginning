package Exercise;

import javax.swing.JOptionPane;

public class Fakultaet {

	public static void main(String[] args) {
		
		int eingabeZahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl von 1 bis 10 geben: "));
		int ergebnis = 1;
		
		String ergebnisMsg = "Das Ergebnis der " + eingabeZahl + "! ist: " + ergebnis;
		
		if (eingabeZahl >= 0 && eingabeZahl <= 10) {
			if(eingabeZahl == 0 || eingabeZahl == 1) {
				JOptionPane.showMessageDialog(null, ergebnisMsg);	
			} else {
				for(int i = 1; i <= eingabeZahl; i++) {
					ergebnis *= i;
				}
				JOptionPane.showMessageDialog(null, "Das Ergebnis der " + eingabeZahl + "! ist: " + ergebnis);
			}
		} else {
			JOptionPane.showMessageDialog(null,"Bitte beim naechsten mal ein Zahl zwische 0 und 10 eingeben");
		}
	}

}
