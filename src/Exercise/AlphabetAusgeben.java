package Exercise;

import javax.swing.JOptionPane;

public class AlphabetAusgeben {

	public static void main(String[] args) {

		String alphabet = "";

		for (int i = 65; i <= 90; i++) {
			alphabet += (char) i + "\n";
		}
		JOptionPane.showMessageDialog(null, alphabet);
	}

}
