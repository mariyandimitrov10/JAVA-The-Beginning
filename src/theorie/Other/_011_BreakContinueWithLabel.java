package theorie.Other;

public class _011_BreakContinueWithLabel {

	public static void main(String[] args) {
		/*Breaks und Continue mit Labels*/
		
		ErsteSchleife: 
		//Schleifen können mit Labels versehen werden, damit kann man dann mit break und continue ZU diesem Label "springen"
		//Es wird also nicht die "innerste" Schleife mit break beendet oder mit continue eher fortgeführt, sondern man kann 
		//eine weiter außen liegende Schleife ansprechen.
		for (int i = 0; i < 10; i++) {
			System.out.println("\nWert von i: " + i);			
			for(int j = 0; j < 6; j++) {
				System.out.println("Wert von j: " + j);
				if(i == 5) break ErsteSchleife;
				if(j == 3) continue ErsteSchleife;
			}
		}
		
		
		//Nicht nur Schleifen können mit Labels versehen werden: es gibt auch Labeled-Blocks, 
		//diese können aber nur mit break gezielt beendet werden, continue funktionier nur bei while, do-while und for
		int a = 10;
		int b = 12;

		block1: {
		    if (a < 0) {
		    	break block1;
		    }
		    if (b < 0) {
		    	break block1;
		    }
		    System.out.println( a + b );
		}	
	}
}

