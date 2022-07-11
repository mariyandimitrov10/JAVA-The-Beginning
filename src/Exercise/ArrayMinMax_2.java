package Exercise;

import javax.swing.JOptionPane;

public class ArrayMinMax_2 {

	public static void main(String[] args) {
		//int[] zahlen = { 5, 2, 10, 9, 12, 3 };
		int max = 0;
		int min = 0;

		int anzahlElemente = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Anzahl der Elemente an: "));
		int[] zahlen = new int[anzahlElemente];
		

		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Geben Sie die " + (i + 1) + ". Zahl des Arrays an: "));
		}

		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] > max) {
				max = zahlen[i];
			}
		}

		min = max;

		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] < min) {
				min = zahlen[i];
			}
		}

		String s = "";

		for (int i : zahlen) {
			s += i + " ";
		}

		JOptionPane.showMessageDialog(null, "Der Such - Array betraegt: " + s + "\n\n Der Max-Wert betraegt: " + max
				+ "\n Der Min-Wert betraegt: " + min);

	}

}
