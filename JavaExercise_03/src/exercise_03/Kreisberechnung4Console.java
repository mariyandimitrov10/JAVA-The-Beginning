package exercise_03;
/* Kreisberechnung4Console: Der Radius f�r einen Kreis und die Einheit
 * werden �ber die Tastatur eingegeben. Anschlie�end
 * werden der Umfang und der Fl�cheninhalt berechnet
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kreisberechnung4Console {
    public static void main(String[] args) throws IOException {
	var eingabepuffer = new BufferedReader(
		new InputStreamReader(System.in));
	System.out.print("Geben Sie den Kreisradius ein: ");
	var eingabe = eingabepuffer.readLine();
	var radius = Double.parseDouble(eingabe);
	System.out.print("Geben Sie die Einheit ein: ");
	eingabe = eingabepuffer.readLine();
	var einheit = eingabe;
	var umfang = 2.0 * 3.1415926 * radius;
	var flaeche = 3.1415926 * radius * radius;
	System.out.print("Umfang: ");
	System.out.print(umfang);
	System.out.println(" " + einheit);
	System.out.print("Fl�che: ");
	System.out.print(flaeche);
	System.out.println(" " + einheit + '\u00b2');
    }
}