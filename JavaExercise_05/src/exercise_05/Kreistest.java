package exercise_05;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Bitte Radius geben: "));
		 
		Kreis kreis = new Kreis(radius);
		
		double rad = kreis.getRadius();
		double umf = kreis.getUmfang();
		
		System.out.println("Radius: " + kreis.getRadius());
		System.out.println("Umfang: " + kreis.getUmfang());
		System.out.println("Flaeche: " + kreis.getFlaeche());
		
		System.out.println();
		kreis.setRadius(8);
		System.out.println("Radius: " + kreis.getRadius());
		System.out.println("Umfang: " + kreis.getUmfang());
		System.out.println("Flaeche: " + kreis.getFlaeche());
		
		System.out.println();
		System.out.println("---Aufgabe 5 ");
		
		kreis.setRadiusByUmfang(30);
		System.out.println("Radius aus Umfang berechnen: " + kreis.getRadius());
		
		kreis.setRadiusByFlaeche(300);
		System.out.println("Radius aus Flaeche berechnen: " + kreis.getRadius());
		
		
	}
}
