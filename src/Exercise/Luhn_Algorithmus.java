package Exercise;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class Luhn_Algorithmus {

	public static void main(String[] args) {

		String cardNumber = "2718281828458567";

		int[] cardIntArray = new int[cardNumber.length()];

		for (int i = 0; i < cardNumber.length(); i++) {
			char c = cardNumber.charAt(i);
			cardIntArray[i] = Integer.parseInt("" + c);
		}
		
		int summe = 0;
		for (int i = 0; i < cardIntArray.length; i++) {
			
			if (i % 2 == 0) {
				int num = cardIntArray[i] * 2; // Schritt 1
				if (num > 9) {
					num = num % 10 + num / 10;
					cardIntArray[i] = num;
					System.out.print(Arrays.toString(cardIntArray));
				}
				cardIntArray[i] = num;	
				summe += cardIntArray[i];
			}
			System.out.println(summe);
		}
		
	}
	
}
