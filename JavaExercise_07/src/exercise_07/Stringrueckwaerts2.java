package exercise_07;

import javax.swing.JOptionPane;

public class Stringrueckwaerts2 {

	public static void main(String[] args) {
		String myString = JOptionPane.showInputDialog(" Bitte ein Text schreiben: ");
		String ruckwaert = "";
		
		for(int i = myString.length() - 1; i >= 0; i--) {
			ruckwaert = ruckwaert + myString.charAt(i);
		}
		JOptionPane.showMessageDialog(null, "Dein String rückwärts: " + ruckwaert);

	}

}
