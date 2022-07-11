package exercise_07;

import javax.swing.JOptionPane;

public class Stringrueckwaerts {

	public static void main(String[] args) {
		String myString = JOptionPane.showInputDialog(" Bitte ein Text schreiben: ");
		
		for(int i = myString.length() - 1; i >= 0; i--) {
			System.out.print(myString.charAt(i));
		}
		
	}

}
