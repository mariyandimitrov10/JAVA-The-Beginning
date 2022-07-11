package exercise_03;
/* Kreisberechnung4JOptionPane: Der Radius für einen Kreis und die Einheit
 * werden über JOptionPane.showInputDialog eingegeben. Anschließend
 * werden der Umfang und der Flächeninhalt berechnet
 * ohne Console
 */

import javax.swing.JOptionPane;

public class Kreisberechnung4JOptionPane {
    public static void main(String[] args) {
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie den Kreisradius ein: ");
	var radius = Double.parseDouble(eingabe);
	eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
	var einheit = eingabe;
	var umfang = 2.0 * 3.1415926 * radius;
	var flaeche = 3.1415926 * radius * radius;
	JOptionPane.showMessageDialog(null, "Umfang: " + umfang + " " + einheit
		+ '\n' + " Fläche: " + flaeche + " " + einheit + '\u00b2');
    }
}