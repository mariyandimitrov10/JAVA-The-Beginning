package exercise_04;
/* Programm zur Berechnung der Mehrwertsteuer
 */

import javax.swing.JOptionPane;

public class Mehrwertsteuer {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int mwstsatz = 19;
	
	double betrag = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Rechnungsbetrag in € ein: "));
	System.out.println("Betrag: " + betrag);
	System.out.println("Schritt 1: " + mwstsatz/100 );
	System.out.println("Schritt 2: " + (mwstsatz/100*betrag));
	double mwst = mwstsatz / 100 * betrag;
	System.out.println("Mehrwertsteuer: " + mwst + " €");
    }

}
