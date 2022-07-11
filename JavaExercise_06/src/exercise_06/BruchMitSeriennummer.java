package exercise_06;

public class BruchMitSeriennummer extends Bruch {
    static int anzahlBrueche = 0;
    private final int seriennummer;

    BruchMitSeriennummer(int x, int y) {
	super(x, y);
	anzahlBrueche++;
	seriennummer = anzahlBrueche;
    }

    BruchMitSeriennummer() {
	this(0, 1);
    }

    BruchMitSeriennummer(int x) {
	this(x, 1);
    }

    public int getSeriennummer() {
	return this.seriennummer;
    }
}

