package Exercise;

import javax.swing.JOptionPane;

public class ArrayZweidimenzionalePersonen_2 {

	public static void main(String[] args) {
		String[] categories = {"Vorname", "Nachname", "Alter", "Familienstand", "Beruf"};
		final int AMOUNT_NULLS_NEEDED = categories.length;
		
		String[][] persons = {
				{"Hans", "Werner", "48", "ledig", "Handwerker"}, 
				{"Christian", "Herrero" , "30", "verheiratet", "Bankaufmann"},
				{null, null, null, null, null},	
				{"Elif", "Yamaz", "8", "ledig", "Schuelerin"},
				{null, null, null, null, null},				
				};
		
		//setze includeIndex (der index, wo das neue Datenelement gespeichert wird) auf -1, für "nicht gefunden"
		int includeIndex = -1;
		int amountNull = 0;
		
		//Schleife sucht null index solange includeIndex seinen Wert von -1 nicht verändert
		for(int i = 0; i < persons.length && includeIndex == -1; i++) {
			for(int j = 0; j < persons[i].length && includeIndex == -1; j++) {
				if(persons[i][j] == null) amountNull++;
				if(amountNull == AMOUNT_NULLS_NEEDED) {
					includeIndex = i;
				}
			} 
			amountNull = 0;
		}
		
		//Schreibe an Stelle includeIndex den neuen Datensatz
		String input = " ";
		if(includeIndex >= 0) {
			for(int j = 0; j < categories.length; j++) {
				//Erhalte neue Daten des Nutzers
				input = JOptionPane.showInputDialog(categories[j] + ":");
				//Pruefe ob Nutzer ein bestimmtes Datum (Singular von Daten) nicht eingeben will
				if(input.isEmpty()) {
					input = null;
				}
				persons[includeIndex][j] = input;
			}
		}
		
		String output = "";
		//Bastle Ausgabestring mit Kategorien als Ueberschrift
		for(int i = 0; i < categories.length; i++) {
			output += categories[i] + " ";
		} 
		output += "\n\n";
		
		//Bastle Ausgabestring der eigentlichen Daten
		for(int i = 0; i < persons.length; i++) {
			for(int j = 0; j < persons[i].length; j++) {
				output += persons[i][j] + " ";
			}
			output += "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
	} //End of main

}
