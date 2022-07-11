package Exercise;

import javax.swing.JOptionPane;

public class RechteckRechnen {

	public static void main(String[] args) {

		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte Länge geben: "));
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte Breite geben: "));
		final String MASSEINHEIT = JOptionPane.showInputDialog("Bitte geben Sie die Masseinheit an: ");
		
		double flaeche = laenge * breite;
		double umfang = (2 * laenge + 2 * breite);
		
		
		JOptionPane.showMessageDialog(null, "Die eingegebene Laenge betraegt: " + laenge + MASSEINHEIT + "\n" 
											+ "Die eingegebene Breite betraegt: " + breite + MASSEINHEIT + "\n\n"
											+ "Der Umfang betraegt: " + umfang + MASSEINHEIT + "\n" 
											+ "Die Flaeche betraegt: " + breite + MASSEINHEIT);

	}

}
