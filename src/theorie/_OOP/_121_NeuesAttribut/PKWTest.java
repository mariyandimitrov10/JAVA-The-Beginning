package theorie._OOP._121_NeuesAttribut;

public class PKWTest {

	public static void main(String[] args) {
		PKW pkw1 = new PKW();
		System.out.println(pkw1);
		
		PKW pkw2 = new PKW("BMW");
		System.out.println(pkw2);
		
		PKW pkw3 = new PKW("Mercedes", "schwarz");
		System.out.println(pkw3);
		
		PKW pkw4 = new PKW("Audi", "gruen", 200);
		System.out.println(pkw4);
		
		Fahrzeug f1 = new Fahrzeug();
		System.out.println(f1);
	
	}

}
