package exercise_03;
import javax.swing.JOptionPane;

/* Programm WasSollDas
 * Sie sollten mit unterschiedlichen ganzen Zahlen testen,
 * wozu der Algorithmus dient. Geben Sie z.B. f�r m den Wert 12
 * und f�r n den Wert 81 ein.
 */

public class WasSollDas {

    public static void main(String[] args) {

	var eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl f�r m ein: ");
	var m = Integer.parseInt(eingabe);
	eingabe = JOptionPane
		.showInputDialog("Geben Sie eine ganze Zahl f�r n ein: ");
	var n = Integer.parseInt(eingabe);

	while (m != n) {
	    if (m > n) {
		m = m - n;
	    } else {
		n = n - m;
	    }
	}
	System.out.println("m = " + m);
    }

}