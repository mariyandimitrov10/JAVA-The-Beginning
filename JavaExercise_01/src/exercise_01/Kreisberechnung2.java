package exercise_01;

/* Kreisberechnung2: Für einen Kreis werden der Umfang
 * und der Flächeninhalt berechnet.
 * Der Radius des Kreises wird dem Programm als Parameter
 * übergeben.
 */


public class Kreisberechnung2 {
  public static void main(String[] args) {
    var radius = Double.parseDouble(args[0]);
    var umfang = 2.0 * 3.1415926 * radius;
    var flaeche = 3.1415926 * radius * radius;
    System.out.print("Umfang: ");
    System.out.println(umfang);
    System.out.print("Fläche: ");
    System.out.println(flaeche);
  }
}