package exercise_03;
import javax.swing.JOptionPane;

/* ggTEuklid mit while-Schleife
 * Das Programm berechnet den größten gemeinsamen Teiler nach
 * dem Algorithmus von Euklid.
 */

public class ggTEuklid {

    public static void main(String[] args) {

	var eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl für m ein: ");
	var m = Integer.parseInt(eingabe);
	System.out.println("m = " + m);
	eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl für n ein: ");
	var n = Integer.parseInt(eingabe);
	System.out.println("n = " + n);
	var r = m % n;

	while (r > 0) {
	    m = n;
	    n = r;
	    r = m % n;
	}
	System.out.println("ggT = " + n);
    }

}
