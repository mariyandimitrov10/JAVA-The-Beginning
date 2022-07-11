package theorie._OOP._060_IS_A_BeziehungNew;

public class Mahlzeit {
	private int kcal;
	private int menge;
	
	Mahlzeit() {
		super();
	}
	
	Mahlzeit(int kcal, int menge) {
		this.kcal = kcal;
		this.menge = menge;
	}
	
	
	@Override
	public String toString() {
		return "Ich bin eine Mahlzeit. \nKcal: " + kcal + "\nMenge: " + menge;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public int getMenge() {
		return menge;
	}
	
	public void setMenge(int menge) {
		this.menge = menge;
	}
}
