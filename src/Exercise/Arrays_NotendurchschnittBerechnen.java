package Exercise;

import javax.swing.JOptionPane;

public class Arrays_NotendurchschnittBerechnen {

	public static void main(String[] args) {

		String sNotenString = "";
		String notendurchschnitt;
		double summe = 0;

		int anzahlNoten = Integer.parseInt(JOptionPane.showInputDialog(
				"Mit diesem Tool berechnen Sie Ihren Notendurchschnitt.\n\nBitte geben Sie die exakte Anzahl"
						+ "von Noten an, deren Notendurchschnitt Sie berechnen wollen."));
		int[] zahlen = new int[anzahlNoten];

		double[] noten = new double[anzahlNoten];
		for (int i = 0; i < zahlen.length; i++) {
			noten[i] = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die " + (i + 1) + ". Note an: "));
			summe += noten[i];
		}

		for (int i = 0; i < noten.length; i++) {
			if (i == anzahlNoten - 1)
				sNotenString += noten[i];
			else
				sNotenString += noten[i] + ", ";
		}

		JOptionPane.showMessageDialog(null, "Ihre eingegebenen Noten betraegen: " + sNotenString 
											+ "\nIhr Notendurchschnitt betraegt: " + 
											String.format("%.2f", summe / anzahlNoten ));

	}

}
