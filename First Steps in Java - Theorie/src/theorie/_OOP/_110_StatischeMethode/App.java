package theorie._OOP._110_StatischeMethode;

public class App {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		System.out.println("Summe der Addition: " + StatischeMethoden.addiere(x, y));
		
		int summe = StatischeMethoden.addiere(4, 4);
		System.out.println("Lokale Summe: " + summe);
		
		

	}

}
