package Exercise;

import javax.swing.JOptionPane;

public class ArrayMinMax_Loesung {

	public static void main(String[] args) {
		//int[] zahlen = { 5, 2, 10, 9, 12, 3 };
		int max = 0;
		int min;
		String sZahlen = "";
		
		//Ermittlung der Anzahl der Array Elemente (Laenge des Arrays) (Bonus Aufgabe) 
		int anzahlElemente = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Anzahl der Elemente an: "));
		int [] zahlen = new int[anzahlElemente];
		
		// Ermittlung des Such-Arrays
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Geben Sie die " + (i + 1) + ". Zahl des Arrays an: "));
		}
		
		
		// Maximal Wert ermitteln
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] > max) {
				max = zahlen[i];
			}
		}
		min = max;

		// Minimal  Wert ermitteln
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] < min) {
				min = zahlen[i];
			}
		}
		
		// Ausgabestring für Array erzeugen
		for(int i : zahlen) {
			sZahlen += i + " ";
		}
		
		JOptionPane.showMessageDialog(null, "Der Such-Array beträgt: " + sZahlen
										+ "\n\nDer Max Wert beträgt: " + max
										+ "\nDer Min Wert beträgt: " + min);
	}

}
