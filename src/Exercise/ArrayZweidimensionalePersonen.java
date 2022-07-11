package Exercise;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayZweidimensionalePersonen {

	public static void main(String[] args) {
		
		
		String[][] persons = {
				{"Hans", "Werner", "48", "ledig", "Handwerker"},
				{"Christian", "Herrero", "30", "verheiratet", "Bankkaufmann"},
				{"Elif", "Yamaz", "8", "ledig", "Schülerin"},
				{null, null, null, null, null}
		};
		
		String[] categories = {
				"Vorname", "Nachname", "Alter", "Familienstand", "Beruf"
		};
		
		for(int i = 0; i <= persons.length; i++) {
			persons[3][i] = JOptionPane.showInputDialog(categories[i] + ":");
		}
		
		String outputMsg = "";
		
		for (int i = 0; i < persons.length; i++) {
			for(int j = 0; j < persons[i].length; j++) {
				outputMsg += persons[i][j] + " ";
			}
			outputMsg += "\n";
		}
		JOptionPane.showMessageDialog(null, outputMsg);
	
	}	
}
