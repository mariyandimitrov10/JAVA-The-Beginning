package theorie._OOP._060_IS_A_BeziehungNew;

public class Pizza extends Mahlzeit {
	private String typ;
	private int durchmesser;
	
	Pizza() {
		super(266, 100);

		typ = "Salami";
		durchmesser = 32;
	}
	
	Pizza(int kcal, int menge) {
		super(kcal, menge);
		
		typ = "Salami";
		durchmesser = 32;
	}

	
	Pizza(int kcal, int menge, String typ, int durchmesser) {
		super(kcal, menge);
		
		this.typ = typ;
		this.durchmesser = durchmesser;
	}
	
	@Override
	public String toString() {
		return "Ich bin eine Pizza. \nKcal: " + this.getKcal() + "\nMenge: " + this.getMenge()
		+ "\nTyp: " + typ 
		+ "\nDurchmesser: " + durchmesser;
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
	
		
}
