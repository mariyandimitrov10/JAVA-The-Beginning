package theorie._OOP._140_Interface;

public class PKW extends Fahrzeug implements Lenkbar {
	private int kofferraumVolumen; //in Litern
	
	PKW() {
		this("Volvo", "silber", 300); //weitere Möglichkeit des Konstruktor - Chaining, hier wird der spezialisierteste Konstruktor aufgerufen
	}
	
	PKW(String hersteller) {
		super(hersteller);
		setKofferraumVolumen(300);
	}
	
	PKW(String hersteller, String farbe) {
		super(hersteller, farbe);
		setKofferraumVolumen(300);
	}
	
	PKW(String hersteller, String farbe, int kofferraumVolumen) {
		super(hersteller, farbe);
		setKofferraumVolumen(kofferraumVolumen);
	}
	
	@Override
	public String toString() {
		return "PKW - " + "Kofferraumvolumen: " + this.getKofferraumVolumen() + "- " + super.toString();
	}
	
	public int getKofferraumVolumen() {
		return kofferraumVolumen;
	}

	public void setKofferraumVolumen(int kofferraumVolumen) {
		this.kofferraumVolumen = kofferraumVolumen;
	}

	@Override
	public void kannLenken() {
		System.out.println("PKW lenkt.");	
	}
}
