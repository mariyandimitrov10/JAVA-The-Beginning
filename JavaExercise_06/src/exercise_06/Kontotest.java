package exercise_06;

public class Kontotest {
    public static void main(String[] args) {
	Konto myKonto = new Konto("0000000001", 1000);
	System.out.println("Kontonummer: " + myKonto.getKontonummer());
	System.out.println("Kontostand: " + myKonto.getKontostand());
	
	myKonto.einzahlen(500);
	System.out.println("500,00 € eingezahlt!");
	System.out.println("Kontostand nach Einzahlen: " + myKonto.getKontostand());
	
	myKonto.auszahlen(750.50);
	System.out.println("750,50 € ausgezahlt!");
	System.out.println("Kontostand nach Auszahlen: " + myKonto.getKontostand());
	
	System.out.println("Kontonummer: " + myKonto.getKontonummer());
	System.out.println("Kontostand: " + myKonto.getKontostand());
    }

}
