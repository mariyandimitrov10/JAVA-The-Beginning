package theorie.Other;

public class BreakUndContinueLabeled {

	public static void main(String[] args) {
		Outer:
		/*
		 * Schleifen können mit Labels versehen, damit kann man dann mit break und
		 * continue ZU diesem Label springen Es wird also nicht die "innerste" Schleife
		 * mit break beendet oder mit continue fortgesetzt, sondern man kann eine weiter
		 * außen liegende Schleife direkt ansprechen bzw. break / continue verwenden
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("\nDer Wert von i ist: " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("Der Wert von j ist: " + j);
				if (i == 5)
					break Outer;
				if (j == 3)
					continue Outer;
			}
		}
		
		System.out.println();
		
		/*
		 * Nicht nur Schleifen können mit Labels versehen werden, es gibt auch
		 * Labeled-Blocks, diese können aber nur mit einem break gezielt beendet werden,
		 * continue funktioniert nur bei Schleifen (while, do-while, for)
		 */
		int a = 10;
		int b = 12;
		block1: {
			if (a > 10)
				break block1;
			if (b == 13)
				break block1;

			System.out.println(a + b);
		}
	}
}
