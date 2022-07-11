package exercise_01;

/* Kreisberechnung4: Der Radius für einen Kreis und die Einheit
 * werden über ein Eingabefenster eingegeben. Anschließend
 * werden der Umfang und der Flächeninhalt berechnet.
 */

import javax.swing.*;

public class Kreisberechnung4 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        var radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
        var einheit = eingabe;
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.print("Umfang: ");
        System.out.print(umfang);
        System.out.println(" " + einheit);
        System.out.print("Fläche: ");
        System.out.print(flaeche);
        System.out.println(" " + einheit + '\u00b2');
    }
}