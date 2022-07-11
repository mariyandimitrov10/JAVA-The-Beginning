package theorie.Other;

public class _30_Arrays {
	
	public static void main(String[] args) {
		
		//Deklaration und Initialisierung des Arrays in zwei Zeilen
		int[] values1;
		values1 = new int[3]; 
		
		//Deklaration und Initialisierung des Arrays in einer Zeile + Wert für Element 1
		int[] values2 = new int[3];
		values2[0] = 2;
		
		//Weniger verbreitete Variante
		int values21[] = new int[3];
		
		//Array Literal - langen Schreibweise
		double[] values3 = new double[] {3.0, 2.1, 4.3};
		
		//Array Literal - kurze Schreibweise
		double[] values = {4.1, 5.0, 10.0};
		
		values1[0] = 5;
		values1[1] = 10;
		values1[2] = 3;
//		values1[3] = 11;											//Fehler, ArrayIndexOutOfBoundsException
		
		System.out.println("values1 an Stelle 2: " + values1[1]);
//		System.out.println("values1 an Stelle 4: " + values1[3]);	//Fehler, ArrayIndexOutOfBoundsException
		
		//Länge des Arrays ausgeben
		System.out.println("Laenge des values1 Arrays: " + values1.length);
		
		System.out.println();
		
		System.out.print("Ausgabe values1 mit standard for Schleife: ");
		for(int i = 0; i < values1.length; i++) {
			System.out.print(values1[i] + " ");
		}
		
		System.out.print("\nEnhanced for schleife (for-each): ");
		for(int i : values1) {
			System.out.print(i + " ");
		}
		
		//Multdimensionales Array
		int values6[][] = new int[3][4];
		
		System.out.println();
		
		for(int i = 0; i < values6.length; i++) {
			for(int j = 0; j < values6[i].length; j++) {
				values6[i][j] = j;
			}
		}
		
		for(int[] i : values6) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}	
}
