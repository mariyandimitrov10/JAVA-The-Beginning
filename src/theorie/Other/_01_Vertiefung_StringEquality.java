package theorie.Other;

public class _01_Vertiefung_StringEquality {

	public static void main(String[] args) {
		//String Literale werden im String Pool / Stack gespeichert
		String s1 = "Hallo"; //JVM erzeugt String Literal "Hallo" im String Pool
		String s2 = "Hallo"; //JVM prüft String Pool und findet "Hallo" und lässt s2 auf Objekt s1 zeigen
		
		//"Normale String Erzeugung" wird im Heap gespeichert
		String s3 = new String("Hallo");//JVM ignoriert String-Pool und erzeugt Objekt auf dem Heap
		String s4 = new String("Hallo");//JVM ignoriert String-Pool und erzeugt Objekt auf dem Heap
		
		//Identitätsprüfung: Stringpool s1 ist GLEICH Stringpool s2 = WAHR
		if(s1 == s2) {
			System.out.println("s1 == s2: " + (s1 == s2));
		}
		
		//Identitäsprüfung: Heap s3 ist GLEICH Heap s4 = FALSCH
		if(!(s3 == s4)) {
			System.out.println("s3 == s4: " + (s3 == s4));
		}
		
		//Wertprüfung auf GLEICHHEIT
		if(s3.equals(s4)) {
			System.out.println("s3.equals(s4): " + (s3.equals(s4)));
		}

	}

}
