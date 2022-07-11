package exercise_03;
/* Zahlendreieck mit while-Schleife
 */
public class ZahlendreieckWhile {

    public static void main(String[] args) {
	var zahl = 0;
	var ausgabe = "";

	while (zahl < 10) {
	    ausgabe = ausgabe + zahl;
	    System.out.println(ausgabe);
	    zahl++;
	}
    }

}
