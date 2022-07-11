package Exercise;

public class ArrayRechnen {

	public static void main(String[] args) {
		int arrayEins[]= new int [5];
		arrayEins[0]=22;
		arrayEins[1]=2;
		arrayEins[2]=21;
		arrayEins[3]=18;
		arrayEins[4]=7;
		
		System.out.println("Aufgabe 1: Lassen Sie sich alle Werte des"
				+ " Arrays über die Konsole ausgeben.");
		System.out.print("Hier die gewünschte Werte ---> ");
		
		for( int i = 0; i < arrayEins.length; i++) { 
				System.out.print(arrayEins[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Aufgabe 2: Multiplizieren Sie das dritte "
					+ "Element mit dem zweiten Element des Arrays.");
		System.out.print("Hier Resultat der multiplizierte Elemente [3] und [2] ---> ");
		
		
		arrayEins[2] = arrayEins[2] * arrayEins[1];
			System.out.print(arrayEins[2]);
		
		System.out.println("\n");
		System.out.println("Aufgabe 3: Dividieren Sie das erste Element "
				+ "durch das vierte Element.");
		System.out.print("Hier Resultat der dividierte Elemente [0] und [3] ---> ");
		
		arrayEins[0] = arrayEins[0] / arrayEins[3];
		System.out.print(arrayEins[0]);
		
		System.out.println("\n");
		System.out.println("Aufgabe 4: Falls das fünfte Element ein Teiler des "
				+ "dritten Elementes ist,\r\n"
				+ "dann soll die Konsolenausgabe „5. Element ist Teiler vom 3. Element“ erscheinen.");
		System.out.print("Resultat:  ");
		if(arrayEins[2] % arrayEins[4] == 0) {
			System.out.println("5. Element ist Teiler vom 3. Element");
		} 
		else {
			System.out.print("5. Element ist NICHT Teiler vom 3. Element");
		}
		
		System.out.print("\n");
		System.out.println("Aufgabe 5: Geben Sie arrayEins[] noch einmal aus und prüfen Sie, ob sich die Werte aus Aufgabe 2 und 3\r\n"
				+ "entsprechend verändert haben.");
		System.out.print("Resultat:  ");
		
		for( int i = 0; i < arrayEins.length; i++) {
			System.out.print(arrayEins[i] + " ");
		}
		
	}

}
