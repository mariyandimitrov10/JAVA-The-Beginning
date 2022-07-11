package Exercise;

import javax.swing.JOptionPane;
import util.*;

public class Zahlenraten_2 {

	public static void main(String[] args) {
		int versuche = 0;
		String ratezahl = "";
		int zahl = 0; // ungewandelte Ratezahl

		boolean istFertig = false;
		boolean hatAbgebrochen = false;

		final int MIN_RATEWERT = 1;
		final int MAX_RATEWERT = 30;

		final int ANZAHL_TIPP = 3;
		final int ANZAHL_ABBRUCHFRAGE = 5;
		final int ANZAHL_ABBRUCH = 7;

		final int GEWINN_MODULO = 5;

		JOptionPane.showMessageDialog(null, "Herzlich Willkommen zum Zahlenraten - Spiel. Viel Glück beim Raten!");

		do {
			if (versuche > 0) {
				JOptionPane.showMessageDialog(null,
						"Ihre Zahl liegt nicht in den Gewinnparametern. Versuchen Sie es erneut.");
			}
			ratezahl = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein");
			if (ratezahl.isBlank() || !Helper.isNumeric(ratezahl)) {
				System.out.println("Nutzer hat keine Ratezahl eingegeben");
			} else {
				zahl = Integer.parseInt(ratezahl);
				versuche++;

				// Spieler hat gewonnen
				if (zahl >= MIN_RATEWERT && zahl <= MAX_RATEWERT && zahl % GEWINN_MODULO == 0) {
					istFertig = true;
				}

				else {
					switch (versuche) {
					case ANZAHL_TIPP:
						JOptionPane.showMessageDialog(null, "Kleier Tipp: Die Zahl muss zwischen 1 und 30 liegen");
						break;
					case ANZAHL_ABBRUCHFRAGE:
						String abfrage = JOptionPane.showInputDialog("Moechtn Sie weiterspielen? (ja) (nein)");
						if (abfrage.toLowerCase().equals("nein"))
							hatAbgebrochen = true;
						break;
					case ANZAHL_ABBRUCH:
						JOptionPane.showMessageDialog(null, "Das wird beendet um Ihre Gesundheit nicht zu gefaehrden.");
						break;
					}
				}
			}
		} while (istFertig == false && hatAbgebrochen == false);

		if (istFertig == true) {
			JOptionPane.showMessageDialog(null, "Erfolgreich geraten! Bis zum naechsten mal.");
		} else
			JOptionPane.showMessageDialog(null, "Tschö bis zum nächsten mal.");

	}

}
