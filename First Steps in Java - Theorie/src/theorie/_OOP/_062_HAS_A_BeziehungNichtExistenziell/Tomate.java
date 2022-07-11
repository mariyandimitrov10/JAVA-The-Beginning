package theorie._OOP._062_HAS_A_BeziehungNichtExistenziell;

public class Tomate extends Gemuese {
	private String farbe;
	
	Tomate(String name ,String farbe) {
		super(name);
		this.farbe = farbe;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "; Farbe: " + this.farbe;
	}
}
