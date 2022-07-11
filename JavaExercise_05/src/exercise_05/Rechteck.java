package exercise_05;


class Rechteck {
	
	double laenge;
	double breite;
	
	Rechteck(){
		laenge = 0;
		breite = 0;
	}
	
	Rechteck(double laenge, double breite){
		this.laenge = laenge;
		this.breite = breite;
	}
	
	void setLaenge(double l) {
		this.laenge = l;
	}
	
	void setBreite(double b) {
		this.breite = b;
	}
	
	void setSeiten(double l, double b) {
		this.laenge = l;
		this.breite = b;
	}
	
	double getLaenge() {
		return this.laenge;
	}
	
	double getBreite() {
		return this.breite;
	}
	
	double getLangeSeite() {
		if(laenge > breite) return laenge;
		else return breite;
	}
	
	double getKurzeSeite() {
		if(laenge > breite) return breite;
		else return laenge;
	}
	
	double Diagonale() {
		return Math.sqrt(this.laenge*this.laenge + this.breite*this.breite);
	}
	
	double getFlaeche() {
		return this.laenge*this.breite;
	}
	
	double getUmfang() {
		return 2*this.laenge + 2*this.breite;
	}
	
	void laengeAusgeben() {
		var laenge = 5.4;
		System.out.println("Laenge: " + laenge);
	}
	
	void laengeVergroessern(double l) {
		this.laenge += l;
	}
	
	void breiteVergoessern(double b) {
		this.breite += b;
	}
	
	void laengeVerkleinern(double l) {
		this.laenge -= l; 
	}
	
	void breiteVerkleinern(double b) {
		this.breite -= b;
	}
	
	
	
	
	
}
