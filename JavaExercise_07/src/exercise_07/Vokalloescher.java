package exercise_07;

import javax.swing.JOptionPane;

public class Vokalloescher {

	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog("Bitte Text eingeben: ");
		
		StringBuilder ohneVokale = new StringBuilder("");
		
		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) != 'a') && (input.charAt(i) != 'o')
					&& (input.charAt(i) != 'u') && (input.charAt(i) != 'e')
					&& (input.charAt(i) != 'i') && (input.charAt(i) != 'A') 
					&& (input.charAt(i) != 'O') && (input.charAt(i) != 'U')
					&& (input.charAt(i) != 'E') && (input.charAt(i) != 'I')) {
				ohneVokale.append(input.charAt(i));
			}
		}
		JOptionPane.showMessageDialog(null, ohneVokale);
	}
}
