package theorie._OOP._150_Polymorphie_und_Interfaces;

public class Vogel implements VogelGesang {

	@Override
	public String melodieSingen() {
		return "Es ertoenen schoene Vogel-Gesangs-Melodien";
	}
	
	public void kannFliegen() {
		System.out.println("Der Vogel fliegt in die Luefte");
	}

}
