package Exercise;

import javax.swing.JOptionPane;

public class DurchschnittlicheNiederschlagsmenge {

	public static void main(String[] args) {

		final int ANZAHL_MONATE = 3;

		double april = Double.parseDouble(JOptionPane.showInputDialog
				("Bitte Niederschlagsmenge f�r April geben: "));
		double mai = Double.parseDouble(JOptionPane.showInputDialog
				("Bitte Niederschlagsmenge f�r Mai geben: "));
		double juni = Double.parseDouble(JOptionPane.showInputDialog
				("Bitte Niederschlagsmenge f�r Juni geben: "));

		//Einzelschritte
//		double a = Double.parseDouble(april);
//		double m = Double.parseDouble(mai);
//		double j = Double.parseDouble(juni);

		double result = (april + mai + juni) / ANZAHL_MONATE;

		JOptionPane.showMessageDialog(null, "Die Niederschlagsmenge f�r April ist: " + april + " l/qm" + "\n" 
									+ "Die Niederschlagsmenge f�r Mai ist: " + mai + " l/qm" + "\n"
									+ "Die Niederschlagsmenge f�r Juni ist: " + juni + " l/qm" + "\n\n"
									+ "Die durchschnittliche Niederschlagsmenge betr�gt: " + result + " l/qm");
	}

}
