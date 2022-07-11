package theorie._OOP._030_Methoden;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		
		p1.beschreibePizza();
		
		Pizza p2 = new Pizza();
		System.out.println();
		p2.typ = "Salami";
		p2.beschreibePizza();
	}

}
