package exercise_02;
public class Aufgabe5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int a = 3;
	int b = 5;
	int c = 6;
	double x = 1.5;
	double y = 2.3;
	int int_ergebnis;
	double double_ergebnis;
	
	boolean b_wert;
	b_wert = a ==c;
	System.out.println("a == b = " + (a == c));
	System.out.println(b_wert);
	System.out.println(!b_wert);
	b_wert = a == b && c > b;
	System.out.println("a == b && c > b = " + b_wert);
	b_wert = b < c & a++ == 4;
	System.out.println("b < c & a++ == 4 = " + b_wert);
	b_wert = b < c & ++a == 5;
	System.out.println("b < c & ++a == 5 = " + b_wert);
	a = 3;
	b_wert = b < c & ++a == 4;
	System.out.println("b < c & ++a == 4 = " + b_wert);
	a = 3;
	b_wert = a > b && c++ == 6;
	System.out.println("a > b && c++ == 6 = " + b_wert);
	System.out.println("c = " + c);
//	b_wert = !y > x;
//	System.out.println("!y > x = " + !y > x);
	b_wert = !(y > x);
	System.out.println("!(y > x) = " + !(y > x));
	b_wert = a > b & c++ == 6;
	System.out.println("a > b & c++ == 6 = " + b_wert);
	System.out.println("c = " + c);
	c = 6;
	b_wert = a < b || c++ == 6;
	System.out.println("a < b || c++ == 6 = " + b_wert);
	System.out.println("c = " + c);
	b_wert = a < b | c++ == 6;
	System.out.println("a < b | c++ == 6  = " + b_wert);
	System.out.println("c = " + c);
	c = 6;
//	b_wert = a > b | c++;
//	System.out.println("a > b | c++  = " + b_wert);

    }

}
