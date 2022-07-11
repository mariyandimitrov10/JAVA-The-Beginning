package theorie._OOP._120_ExtendsSuper;

public class PKWTest {

	public static void main(String[] args) {
		PKW pkw1 = new PKW();
		System.out.println(pkw1);
		
		PKW pkw2 = new PKW("BMW");
		System.out.println(pkw2);
		
		PKW pkw3 = new PKW("Mercedes", "schwarz");
		System.out.println(pkw3);
		
		Fahrzeug f1 = new Fahrzeug();
		System.out.println(f1);
		
		PKW pkw4 = new PKW();
		System.out.println(pkw4);
		
		PKW pkw5 = pkw4;
		System.out.println(pkw5);
		
		System.out.println("pkw4 == pkw5: " + (pkw4 == pkw5));
		
		System.out.println("pkw4 == f1: " + (pkw4 == f1));

	}

}
