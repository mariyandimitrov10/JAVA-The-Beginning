package theorie._OOP._110_StatischeMethode;

public class StatischeMethoden {
	private static int summe = 0;
	
	public static int addiere(int x, int y) {
		summe = x + y;
		return summe;
	}
	
	public static void gibAus() {
		System.out.println("Summe: " + summe);
	}
	
	public int getSumme() {
		return summe;
	}
}
