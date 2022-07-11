package theorie.Other;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class WhileSchleifeTest {

	public static void main(String[] args) {

		// While Schleife
		boolean isTrue = true;
		int j = 0;
		while (isTrue) {
			if (j++ == 5)
				isTrue = false;

			System.out.println("In der Schleife; Wert von: " + j + "; Wert von isTrue: " + isTrue);
		}
		System.out.println("Außerhald der Schleife; Wert von j " + j);
		
		
		// DO-WHILE Schleife
		String eingabe = "";
		do {
			eingabe = JOptionPane.showInputDialog("Möchten Sie die Schleife verlassen? Antworten Sie mit ja oder nein");
		} while ( eingabe.toLowerCase().equals("nein" ));
		

	}

}
