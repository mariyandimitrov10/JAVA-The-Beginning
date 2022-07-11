package theorie._OOP._062_HAS_A_BeziehungNichtExistenziell;

public class Pizza {
	private String typ;
	private int durchmesser;
	private Tomate tomate; //nicht existenzielle Beziehung, da Tomate wie auch Pizza ohne den anderen "leben" koennen
	
	
	Pizza(String typ, int durchmesser, Tomate tomate) {
		this.typ = typ;
		this.durchmesser = durchmesser;
		this.tomate = tomate;
	}
	
	@Override
	public String toString() {
		return "Pizza; Typ: " + typ + ", Durchmesser: " + durchmesser + "cm" + "\n"
				+ tomate.toString();
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getDurchmesser() {
		return durchmesser;
	}

	public void setDurchmesser(int durchmesser) {
		this.durchmesser = durchmesser;
	}
	
	public Tomate getTomate() {
		return tomate;
	}

	public void setTomate(Tomate tomate) {
		this.tomate = tomate;
	}
}
