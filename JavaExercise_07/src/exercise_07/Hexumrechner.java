package exercise_07;

import javax.swing.JOptionPane;

public class Hexumrechner {

	public static void main(String[] args) {
		String input = JOptionPane
				.showInputDialog("Geben Sie eine Hexadezimalzahl ein: ");
		
		JOptionPane.showMessageDialog(null, "Hexadezimalzahl: " + input + "\n"
				+ "Dezimalzahl: " + Long.valueOf(input, 16) + "\n" + "Dualzahl: "
				+ Long.toBinaryString(Long.valueOf(input, 16)));
	}

}
