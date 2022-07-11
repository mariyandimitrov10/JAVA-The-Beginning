package exercise_05;

public class Kreis {
	
	double radius;
	
	Kreis(){
		 radius = 0;
	} 

	Kreis(double radius) {
        this.radius = radius;
    } 
	
	double getRadius() {
        return radius;
    }
	
	void setRadius(double radius) {
        this.radius = radius;
    }
	
	// Umfang ist ein virtuelles Attribut
	double getUmfang() {
		return 2 * Math.PI * radius;
	}
	
	double getFlaeche() {
		return Math.PI * radius * radius;
	}
	
	void setRadiusByUmfang(double u) {
		this.radius = u / (2 * Math.PI);
	}
	
	void setRadiusByFlaeche(double f) {
		this.radius = Math.sqrt(f / Math.PI); 
	}

}
