package theorie._OOP._130_Abstract;

public class PKW extends Fahrzeug {
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
	public void bewege() {
		System.out.println("PKW bewegt sich.");
	}
	
	@Override
	public void bremse() {
		System.out.println("PKW bremst.");
	}
}
