package exercise_06;

public class Girokonto extends Konto {
    double limit;

    Girokonto(String kontonr, double ks, double limit) {
	super(kontonr, ks);
	this.limit = limit;
    }

    double getLimit() {
	return limit;
    }

    void setLimit(double l) {
	limit = l;
    }

    public void auszahlen(double betrag) {
	if ((this.getKontostand() - betrag) >= limit * (-1)) {
	    super.auszahlen(betrag);
	} else {
	    System.out.println("Fehler - Kreditlimit überschritten!");
	}
    }
}
