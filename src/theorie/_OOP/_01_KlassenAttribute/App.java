package theorie._OOP._01_KlassenAttribute;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		
		p1.typ = "Salami";
		p1.durchmesser = 30;
		
		System.out.println(p1.typ + ": " + p1.durchmesser + "cm");
		
		
		Pizza p2 = new Pizza();
		
		p2.typ = "Spinat";
		p2.durchmesser = 20;
		
		
		System.out.println(p2.typ + ": " + p2.durchmesser + "cm");
		
	}

}
