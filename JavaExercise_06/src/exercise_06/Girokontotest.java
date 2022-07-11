package exercise_06;

public class Girokontotest {
    public static void main(String args[]) {
	Girokonto gk = new Girokonto("0000000001", 10000, 1000);
	gk.auszahlen(11000);
	System.out.println("Kontostand: " + gk.getKontostand() + " €");
	gk.einzahlen(11000);
	gk.auszahlen(11001);
	System.out.println("Kontostand: " + gk.getKontostand() + " €");
    }
}

