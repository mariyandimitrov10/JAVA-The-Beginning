package exercise_04;
/* Programm zur Zeichensatzausgabe
 */

public class Zeichensatz {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	byte zahl = 30;
	String zeichensatz = "";
	
	while (zahl < 128) {
	    zeichensatz = zeichensatz + (char) zahl;
	    zahl++;
	}
	System.out.println(zeichensatz);
    }

}
