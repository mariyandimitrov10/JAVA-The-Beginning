package theorie._OOP._061_HAS_A_BeziehungExistenziell;

public class Buch {
	private String titel;
	private Autor autor; //HAS-A-Beziehung, das Buch HAT EINEN Autor
	private double preis;
	
	Buch(String titel, Autor autor, double preis) {
		this.titel = titel;
		this.autor = autor;
		this.preis = preis;
	}
	
	public String toString() {
		return "Buch \n" 
			+ "Titel: " + titel + "\n"
			+ "Autor: "  + autor.getName() + "\n" 
			+ "Preis: " + preis;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	


	
	
}
