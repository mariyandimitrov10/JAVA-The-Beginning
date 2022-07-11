package Exercise;

import javax.swing.JOptionPane;

public class Zahlenraten {

	static int versuche;
	static boolean istFertig = false, hatAbgebrochen = false;

	public static void main(String[] args) {

		while (istFertig == false && hatAbgebrochen == false) {
			String gerateneZahl = JOptionPane.showInputDialog("Gib eine Zahl zwischen 1 und 30 ein");
			int umgZahl = Integer.parseInt(gerateneZahl);
			System.out.println(gerateneZahl);
			versuche++;

			if (umgZahl >= 1 && umgZahl <= 30 && umgZahl % 5 == 0) {
				istFertig = true;
			} // Spieler hat gewonnen
			else if (versuche == 3) {
				String weiterspielen = JOptionPane.showInputDialog("Möchtest du das Spiel verlassen? (Ja / Nein) ");
				if (weiterspielen.toLowerCase().equals("ja")) {
					hatAbgebrochen = true;
				}
			} // Spieler bekommt Tipp
			else if (versuche == 5) {
				JOptionPane.showMessageDialog(null, "Tipp: Die Zahl muss zwischen 1 und 30 liegt !");
				
			} // Spiel abgebrochen
			else if (versuche == 30) {
				JOptionPane.showMessageDialog(null, "30 Versuche !!! Wir brechen hier ab!");
				hatAbgebrochen = true;
			}
		}
		if (istFertig == true) {
			JOptionPane.showMessageDialog(null, "Spiel gewonnen");
		}
		if (hatAbgebrochen == true) {
			JOptionPane.showMessageDialog(null, "Spiel abgebrochen");
		}
	}
}
