package exercise_07;

import javax.swing.JOptionPane;

public class Zahlensysteme {

	public static void main(String[] args) {
		int ganzeZahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte ganze Zahl eingeben: "));
		
		JOptionPane.showMessageDialog(null, "Als Dezimalzahl: " + ganzeZahl + "\n"
					+ "Als Dualzahl: " + Integer.toBinaryString(ganzeZahl) + "\n"
					+ "Als Hexadezimalzahl: " + Integer.toHexString(ganzeZahl).toUpperCase());
	}

}
