package theorie._OOP._120_ExtendsSuper;

public class PKW extends Fahrzeug {
	PKW() {
		super();
	}
	
	PKW(String hersteller) {
		super(hersteller);
	}
	
	PKW(String hersteller, String farbe) {
		super(hersteller, farbe);
	}
	
	@Override
	public String toString() {
		return "PKW - " + super.toString();
	}
}
