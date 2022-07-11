package theorie._OOP._062_HAS_A_BeziehungNichtExistenziell;

public class Gemuese {
	private String name;
	
	Gemuese() {
		super(); //passiert implizit, muesste nicht geschrieben werden
	}
	
	Gemuese(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
