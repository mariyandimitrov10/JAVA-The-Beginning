package exercise_07;

import javax.swing.JOptionPane;

public class Vokalzaeler2 {

	public static void main(String[] args) {
		int aZahl = 0, eZahl = 0, iZahl = 0, oZahl = 0, uZahl = 0;
		
		String newString = JOptionPane.showInputDialog("Geben Sie einen Text ein: ");
		String newString2 = newString.toLowerCase();
		for (int i = 0; i < newString2.length(); i++) {
			switch (newString2.charAt(i)) {
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
		
		System.out.println("Deine Eingabe: " + newString2);
//		System.out.println("Die Eingabe erhählt: " 
//							+ newString2.replace(" ","").length() + " Buchstabe");
		
		System.out.println(aZahl + " mal a");
		System.out.println(eZahl + " mal e");
		System.out.println(iZahl + " mal i");
		System.out.println(oZahl + " mal o");
		System.out.println(uZahl + " mal u");
	}

}
