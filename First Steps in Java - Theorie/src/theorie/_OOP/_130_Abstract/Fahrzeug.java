package theorie._OOP._130_Abstract;

public abstract class Fahrzeug {
	protected String hersteller;
	private String farbe;
	
	public Fahrzeug() {
		this("Volvo", "silber");
	}
	
	public Fahrzeug(String herst) {
		this(herst, "silber");
	}
	
	public Fahrzeug(String herst, String far) {
		this.hersteller = herst;
		this.farbe = far;
	}
	
	//Abstrakte Methoden muessen von Subklassen implementiert werden! 
	public abstract void bewege(); 
	
	public abstract void bremse();
	
	@Override
	public String toString() {
		return "Fahrzeug [Hersteller= " + this.getHersteller() + ", Farbe= " + this.getFarbe() + "]";
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	
}
