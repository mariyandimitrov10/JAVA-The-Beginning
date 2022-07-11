package theorie._OOP._062_HAS_A_BeziehungNichtExistenziell;

public class App {

	public static void main(String[] args) {
		Tomate t1 = new Tomate("Tomate","rot-orange");
		Pizza p1 = new Pizza("Pizza-Tonno", 32, t1);
		
		System.out.println(p1);
	}
}
