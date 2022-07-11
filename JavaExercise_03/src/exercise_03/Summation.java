package exercise_03;
/* Programm Summation zur Veranschaulichung von
 *  Gültigkeitsbereichen
 */
public class Summation {
    public static void main(String[] args) {
	var n = 100;
	var summe = 0;
	var z = 0;
	while (z < n) {
	    var quadrat = z * z;
	    z++;
	    summe = summe + quadrat;
	}
	System.out.println(summe);
    }
}