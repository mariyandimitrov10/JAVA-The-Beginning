package Exercise;

import javax.swing.JOptionPane;

public class DurchschnittlicheNiederschlagsmenge {

	public static void main(String[] args) {

		final int ANZAHL_MONATE = 3;

		double april = Double.parseDouble(JOptionPane.showInputDialog
				("Bitte Niederschlagsmenge für April geben: "));
		double mai = Double.parseDouble(JOptionPane.showInputDialog
				("Bitte Niederschlagsmenge für Mai geben: "));
		double juni = Double.parseDouble(JOptionPane.showInputDialog
				("Bitte Niederschlagsmenge für Juni geben: "));

		//Einzelschritte
//		double a = Double.parseDouble(april);
//		double m = Double.parseDouble(mai);
//		double j = Double.parseDouble(juni);

		double result = (april + mai + juni) / ANZAHL_MONATE;

		JOptionPane.showMessageDialog(null, "Die Niederschlagsmenge für April ist: " + april + " l/qm" + "\n" 
									+ "Die Niederschlagsmenge für Mai ist: " + mai + " l/qm" + "\n"
									+ "Die Niederschlagsmenge für Juni ist: " + juni + " l/qm" + "\n\n"
									+ "Die durchschnittliche Niederschlagsmenge beträgt: " + result + " l/qm");
	}

}
