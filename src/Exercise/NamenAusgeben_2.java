package Exercise;

import javax.swing.JOptionPane;

public class NamenAusgeben_2 {

	public static void main(String[] args) {
		String userName = JOptionPane.showInputDialog("Bitte geben Sie Ihren Namen ein");
		int amount = Integer.parseInt(
				JOptionPane.showInputDialog("Bitte geben Sie die Anzahl ein wie oft Ihr Name ausgegeben werden soll"));

		final int MENGE_OBERE_GRENZE = 30;
		final int MENGE_UNTERE_GRENZE = 0;

		int zaehler = 1;

		String ausgabe = "";

		if (amount > MENGE_UNTERE_GRENZE && amount <= MENGE_OBERE_GRENZE) {

			while (zaehler <= amount) {
				ausgabe += zaehler + ": " + userName + "\n";
				zaehler++;
			}
			JOptionPane.showMessageDialog(null, ausgabe);

		} else
			JOptionPane.showMessageDialog(null, "Leide haben Sie eine zu große oder niedrige Anzahl gewählt. "
					+ "Bitte max. 30 oder minimal 1 eingeben");

	}

}
