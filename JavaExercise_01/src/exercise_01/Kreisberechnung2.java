package exercise_01;

/* Kreisberechnung2: F�r einen Kreis werden der Umfang
 * und der Fl�cheninhalt berechnet.
 * Der Radius des Kreises wird dem Programm als Parameter
 * �bergeben.
 */


public class Kreisberechnung2 {
  public static void main(String[] args) {
    var radius = Double.parseDouble(args[0]);
    var umfang = 2.0 * 3.1415926 * radius;
    var flaeche = 3.1415926 * radius * radius;
    System.out.print("Umfang: ");
    System.out.println(umfang);
    System.out.print("Fl�che: ");
    System.out.println(flaeche);
  }
}