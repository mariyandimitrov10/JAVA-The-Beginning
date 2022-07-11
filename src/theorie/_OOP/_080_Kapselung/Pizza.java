package theorie._OOP._080_Kapselung;

public class Pizza {
	private String typ;
	private int durchmesser;
	
	
	Pizza() {
		this.typ = "Salami";
		this.durchmesser = 32;
		System.out.println("Pizza gebacken. (No-Arg Konstruktor) (Objekt vom Typ Pizza erstellt.)");
	}
	
	Pizza(String typ) {
		this.typ = typ;
		this.durchmesser = 32;
		System.out.println("Pizza gebacken. (Pizza(String typ) Konstruktor) (Objekt vom Typ Pizza erstellt.)");
	}
	
	Pizza(int durchmesser) {
		this.durchmesser = durchmesser;
		this.typ = "Salami";
		System.out.println("Pizza gebacken. (Pizza(int durchmesser) Konstruktor) (Objekt vom Typ Pizza erstellt.)");
	}
	
	Pizza(String typ, int durchmesser) {
		this.typ = typ;
		this.durchmesser = durchmesser;
		System.out.println("Pizza gebacken. (Pizza(String typ, int durchmesser) Konstruktor) (Objekt vom Typ Pizza erstellt.)");
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getDurchmesser() {
		return this.durchmesser;
	}

	public void setDurchmesser(int durchmesser) {
		if(durchmesser > 10 && durchmesser < 100) {
			this.durchmesser = durchmesser;
		} else {
			this.durchmesser = 35;
			System.out.println("Uebergebene Wert wurde auf Standard(35) gesetzt, da nicht in den Paramatern. (10cm bis 100cm)");
		}
		
	}
	
	public String toString() {
		return "Pizza; Typ: " + typ + ", Durchmesser: " + durchmesser;
	}
	
	
	
	
}
