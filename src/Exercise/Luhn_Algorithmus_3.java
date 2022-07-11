package Exercise;

import java.util.Arrays;

public class Luhn_Algorithmus_3 {
	public static void main(String[] args) {
		String kknrString = "2718281828458567";
		int[] loesung = new int[8];
		int sumOfQuersumme = 0;
		int sumOfGeradeStellen = 0;
		
		//Schritt 0
		System.out.println("Schritt 0: ");
		int[] kknr = new int[kknrString.length()];
		for(int i = 0; i < kknr.length; i++) {
			kknr[i] = Integer.parseInt(String.valueOf(kknrString.charAt(i)));
		}
		
		System.out.println(Arrays.toString(kknr));
		
		System.out.println("\nSchritt 1: ");
		//Schritt 1
		for(int i = 0, j = 0; i < kknr.length; i++) {
			if(i % 2 == 0) {
				loesung[j++] = kknr[i] * 2;
			}
		}
		System.out.println(Arrays.toString(loesung));
		
		
		System.out.println("\nSchritt 2");
		//Schritt 2 Part 2
		for(int i = 0; i < loesung.length; i++) {
			loesung[i] = quersumme(loesung[i]);
			sumOfQuersumme += loesung[i];
		}
		System.out.println(Arrays.toString(loesung));
		System.out.println("Addition aller Quersummen: " + sumOfQuersumme);
		
		
		
		System.out.println("\nSchritt 3");
		//Schritt 3
		for(int i = 0; i < kknr.length - 1; i++) {
			if(i % 2 != 0) {
				sumOfGeradeStellen += kknr[i];
			}
		}
		System.out.println("Addition aller geraden Stellen: " + sumOfGeradeStellen);
		
		
		//Schritt 4
		int sum = sumOfQuersumme + sumOfGeradeStellen;
		System.out.println("Schritt 4: \nSumme aller Quersummen und aller geraden Stellen: " + sum);
		
		
		//Schritt 5
		int sum2 = (((sum -1 ) / 10) +1 ) * 10;
		System.out.println("Schritt 5: \nNaechstgroessere durch 10 teilbare Zahl: " + sum2);
		
		
		//Schritt 6
		System.out.println("Schritt 6: \nDie Pruefziffer betraegt: " + (sum2 - sum));
		
	}
	
	
	
	//Schritt 2 Part 1
	private static int quersumme(int zahl) {
		int summe = 0;
		int zahlLaenge = String.valueOf(zahl).length();
		
		if(zahlLaenge > 1) {
			for(int i = 0; i < zahlLaenge; i++) {
				summe += zahl % 10;
				zahl /= 10;
			}
		return summe;	
		} else {
			return zahl;
		}
	}
}
