package theorie._OOP._080_Kapselung;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		System.out.println(p1);
		
		System.out.println();
		Pizza p2 = new Pizza(35);
		System.out.println(p2);
		
		System.out.println();
		Pizza p3 = new Pizza("Spinat");
		System.out.println(p3);
		
		System.out.println();
		Pizza p4 = new Pizza("Tonno", 30);
		System.out.println(p4);
		
		System.out.println();
		Pizza p5 = new Pizza();
		p5.setTyp("Quattro Formagi");
		p5.setDurchmesser(-40); //-40 liegt nicht in den Parametern > 10 und < 100, weshalb der Standard auf 35 gesetzt wird
		System.out.println(p5);
		
	}

}
