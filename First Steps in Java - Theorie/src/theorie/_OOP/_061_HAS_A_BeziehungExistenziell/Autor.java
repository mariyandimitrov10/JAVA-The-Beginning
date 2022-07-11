package theorie._OOP._061_HAS_A_BeziehungExistenziell;

public class Autor {
	
	
	private String name;
	private int alter;
	private Geschlecht geschlecht;
	
	Autor(String name, int alter, Geschlecht geschlecht) {
		this.name = name;
		this.alter = alter;
		this.geschlecht = geschlecht;
	}
	
	@Override
	public String toString() {
		return "Autorname: " + name + "\n"
			+  "Alter: " + alter + "\n"
			+  "Geschlecht: " + geschlecht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	
	
}
