package exercise_06;

public class Konto {
    private String kontonummer;
    private double kontostand;

    Konto(String kontonr, double ks) {
	this.kontonummer = kontonr;
	this.kontostand = ks;
    }

    public String getKontonummer() {
	return kontonummer;
    }

    public double getKontostand() {
	return kontostand;
    }

    public void einzahlen(double betrag) {
	this.kontostand += betrag;
    }

    public void auszahlen(double betrag) {
	this.kontostand -= betrag;
    }
}