package theorie._OOP._060_IS_A_BeziehungNew;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		System.out.println(p1);
		
		System.out.println();
		Pizza p2 = new Pizza(300, 400, "Spinat", 32);
		System.out.println(p2);

	}

}
