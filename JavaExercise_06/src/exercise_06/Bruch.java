package exercise_06;

public class Bruch {
	private int zaehler;
    private int nenner;

    Bruch() {
	zaehler = 0;
	nenner = 1;
    }

    Bruch(int x) {
	zaehler = x;
	nenner = 1;
    }

    Bruch(int x, int y) {
	zaehler = x;
	nenner = y;
    }

    void setZaehler(int z) {
	zaehler = z;
    }

    void setNenner(int n) {
	nenner = n;
    }

    int getZaehler() {
	return zaehler;
    }

    int getNenner() {
	return nenner;
    }

    String bruchToString() {
	return zaehler + "/" + nenner;
    }

    void ausgeben() // Kopf der Methode ausgeben
    {
	System.out.print(zaehler + "/" + nenner); // Rumpf der Methode ausgeben
    }

    void kuerzen() {
	int m, n, r; // lokale Variablen
	m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
	n = Math.abs(nenner); // speichert in n den Betrag von nenner
	r = m % n;
	while (r > 0) {
	    m = n;
	    n = r;
	    r = m % n;
	}
	zaehler /= n; // in n steht jetzt der ggT
	nenner /= n;
    }

    void gekuerztausgeben() {
	kuerzen();
	ausgeben();
    }

    public double dezimalwert() {
	return (double) this.zaehler / this.nenner;
    }

    public Bruch addiere(Bruch b) {
	int z = this.zaehler * b.nenner + b.zaehler * this.nenner;
	int n = this.nenner * b.nenner;
	return new Bruch(z, n);
    }

    public Bruch subtrahiere(Bruch b) {
    int z = this.zaehler * b.nenner - b.zaehler * this.nenner;
    int n = this.nenner * b.nenner;
    return new Bruch(z, n);
    }

    Bruch multipliziere(Bruch m) {
	var z = zaehler * m.zaehler;
	var n = nenner * m.nenner;
	var produkt = new Bruch(z, n);
	return produkt;
    }

    int signum() {
	if (this.dezimalwert() == 0.0) {
	    return 0;
	}
	if (this.dezimalwert() > 0.0) {
	    return 1;
	}
	return -1;
    }

    boolean equals(Bruch x) {
	var a = new Bruch(this.zaehler, this.nenner);
	var b = new Bruch(x.zaehler, x.nenner);
	a.kuerzen();
	b.kuerzen();
	if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
	    return true;
	} else {
	    return false;
	}
    }
}

