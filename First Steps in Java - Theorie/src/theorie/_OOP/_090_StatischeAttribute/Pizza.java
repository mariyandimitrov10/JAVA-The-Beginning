package theorie._OOP._090_StatischeAttribute;

public class Pizza {
	private String typ;
	private int durchmesser;
	
	//protected = sichtbar in der eigenen Klasse, im Package und für erbende Subklassen, auch in anderen Packages
	protected static int counter = 0;
	
	
	Pizza() {
		this.typ = "Salami";
		this.durchmesser = 32;
		System.out.println("Pizza gebacken. (No-Arg Konstruktor) (Objekt vom Typ Pizza erstellt.)");
		
		Pizza.counter++;
	}
	
	Pizza(String typ) {
		this.typ = typ;
		this.durchmesser = 32;
		System.out.println("Pizza gebacken. (Pizza(String typ) Konstruktor) (Objekt vom Typ Pizza erstellt.)");
		
		Pizza.counter++;
	}
	
	Pizza(int durchmesser) {
		this.durchmesser = durchmesser;
		this.typ = "Salami";
		System.out.println("Pizza gebacken. (Pizza(int durchmesser) Konstruktor) (Objekt vom Typ Pizza erstellt.)");
		
		Pizza.counter++;
	}
	
	Pizza(String typ, int durchmesser) {
		this.typ = typ;
		this.durchmesser = durchmesser;
		System.out.println("Pizza gebacken. (Pizza(String typ, int durchmesser) Konstruktor) (Objekt vom Typ Pizza erstellt.)");
		
		Pizza.counter++;
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
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Pizza.counter = counter;
	}
	
	public String toString() {
		return "Pizza; Typ: " + typ + ", Durchmesser: " + durchmesser;
	}	
	
	
	
}
