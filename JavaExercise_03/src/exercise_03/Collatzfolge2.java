package exercise_03;
/* Collatzfolge2
 * Nach der Eingabe einer Startzahl (ganze Zahl)
 * wird die zugehörige Collatzfolge bis zur
 * ersten 1 ausgegeben.
 */

import javax.swing.JOptionPane;

public class Collatzfolge2 {
    public static void main(String[] args) {

	// Eingabedialog anzeigen
	var eingabe = JOptionPane
		.showInputDialog("Geben Sie die Startzahl für die Collatzfolge ein: ");
	var n = Integer.parseInt(eingabe);
	var anzahl = 1;
	var maximum = n;
	System.out.println(n);
	do {
	    if (n % 2 == 0)
		n /= 2;
	    else
		n = 3 * n + 1;
	    System.out.println(n);
	    anzahl++;
	    if (n > maximum) {
		maximum = n;
	    }
	} while (n != 1);
	anzahl--;
	System.out.println("Länge der Collatzfolge: " + anzahl);
	System.out.println("Maximum der Collatzfolge: " + maximum);
    }
}