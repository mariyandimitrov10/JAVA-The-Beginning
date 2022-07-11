package exercise_03;
/* Zahlendreieck mit do-Schleife
 */

public class ZahlendreieckDo {

    public static void main(String[] args) {
	var zahl = 0;
	var ausgabe = "";

	do {
	    ausgabe = ausgabe + zahl;
	    System.out.println(ausgabe);
	    zahl++;
	} while (zahl < 10);
    }

}
