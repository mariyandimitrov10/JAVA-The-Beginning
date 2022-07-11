package exercise_03;
/* Guthabenentwicklung
 * Nach der Eingabe eines Startguthabens und
 * eines Zinssatzes wird die Wertentwicklung
 * für 10 Jahre.
 */

import javax.swing.JOptionPane;

public class Guthabenentwicklung {

    public static void main(String[] args) {

	var guthaben = Double.parseDouble(JOptionPane
		.showInputDialog("Geben Sie das Startguthaben ein: "));
	var zinssatz = Double.parseDouble(JOptionPane
		.showInputDialog("Geben Sie den Zinssatz ein: "));
	for (var i = 1; i <= 10; i++) {
	    guthaben = guthaben * (1 + zinssatz / 100);
	    System.out.println("Guthaben nach " + i + " Jahren: " + guthaben
		    + " Euro");
	}
    }

}
