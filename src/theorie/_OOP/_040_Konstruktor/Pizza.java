package theorie._OOP._040_Konstruktor;

public class Pizza {
	String typ;
	int durchmesser;
	
	Pizza() {
//		this.typ = "Salami";
//		this.durchmesser = 30;
		this("Salami", 30);
		
	}
	
	Pizza(String typ) {
		this(typ, 30);
//		this.typ = typ;
//		this.durchmesser = 30;
	}
	
	Pizza(int durchmesser) {
		this("Salami", durchmesser);
//		this.durchmesser = durchmesser;
//		this.typ = "Salami";
	}
	
	Pizza(String typ, int durchmesser) {
		this.typ = typ;
		this.durchmesser = durchmesser;
	}
	
	void beschreibePizza() {
		System.out.println("Ich bin eine Pizza!");
		System.out.println(this.typ + ": " + this.durchmesser + "cm");
	}
}
