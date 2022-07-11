package theorie._OOP._040_Konstruktor;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.beschreibePizza();
		
		System.out.println();
		Pizza p2 = new Pizza("Spinat");
		p2.beschreibePizza();
		
		System.out.println();
		Pizza p3 = new Pizza(50);
		p3.beschreibePizza();
		
		System.out.println();
		Pizza p4 = new Pizza("Quattro Formaggi", 32);
		p4.beschreibePizza();
	}

}
