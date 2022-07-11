package theorie._OOP._050_Overloading;

public class Person {
	String nachname;
	String vorname;
	
	public void setName() {
		nachname = "Muster";
		vorname = "Hans";
	}
	
	public void setName(String vorname) {
		nachname = "Muster";
		this.vorname = vorname;
	}
	
	public void setName(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	@Override
	public String toString() {
		return "Vorname: " + vorname + "; Nachname: " + nachname;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName();
		
		System.out.println(p1.toString());
		
		Person p2 = new Person();
		p2.setName("Heinrich");

		System.out.println(p2);
		
		Person p3 = new Person();
		p3.setName("Maria", "Winkel");
		
		System.out.println(p3);
	}

}
