package theorie._OOP._061_HAS_A_BeziehungExistenziell;

public class Buchhandlung {
	
	public static void main(String[] args) {
		Autor meinAutor = new Autor("Luise France", 38, Geschlecht.WEIBLICH);
		System.out.println(meinAutor);
		
		System.out.println();
		Buch meinBuch = new Buch("Gefangen auf der Zugspitze", meinAutor, 33.50);
		System.out.println(meinBuch);
	}

}
