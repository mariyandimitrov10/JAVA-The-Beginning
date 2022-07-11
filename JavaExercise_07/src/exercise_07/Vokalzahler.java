package exercise_07;

import javax.swing.JOptionPane;

public class Vokalzahler {
	public static void main(String[] ergs) {
		int aZahl = 0, eZahl = 0, iZahl = 0, oZahl = 0, uZahl = 0;
		String newString = JOptionPane.showInputDialog("Geben Sie einen Text ein: ");
		
		for (int i = 0; i < newString.length(); i++) {
			switch (newString.charAt(i)) {
			case 'a':
				aZahl++;
				break;
			case 'e':
				eZahl++;
				break;
			case 'i':
				iZahl++;
				break;
			case 'o':
				oZahl++;
				break;
			case 'u':
				uZahl++;
				break;
			}
		}
		System.out.println("Deine Eingabe: " + newString);
		System.out.println(aZahl + " mal a");
		System.out.println(eZahl + " mal e");
		System.out.println(iZahl + " mal i");
		System.out.println(oZahl + " mal o");
		System.out.println(uZahl + " mal u");
	}

}
