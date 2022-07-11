package exercise_03;
/* Vokaltest mit switch - case
 * Nach der Eingabe eines Zeichens wird geprüft,
 * ob es sich um einen Vokal handelt.
 * Das Ergebnis wird in einem MessageDialog ausgegeben.
 */

import javax.swing.JOptionPane;

public class VokaltestSwitchCase {
    public static void main(String[] args) {
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie einen Buchstaben ein: ");
	var c = eingabe.charAt(0);
	switch (c) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	    JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");
	    break;
	default:
	    JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
	}
    }
}