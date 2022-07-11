package theorie._OOP._030_Methoden;

public class Pizza {
	String typ = "Quattro Formaggi";
	int durchmesser = 32; 
	
	void beschreibePizza() {
		System.out.print("Ich bin eine Pizza! Mein Typ ist: " 
				+ this.typ + ". Mein Durchmesser ist: " + this.durchmesser);
	}
	
	void setTyp(String typ) {
		this.typ = typ;
	}
	
	String getTyp() {
		return typ;
	}
}
