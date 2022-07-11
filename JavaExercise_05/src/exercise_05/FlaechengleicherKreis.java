package exercise_05;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {

	public static void main(String[] args) {
		Rechteck Reck = new Rechteck(Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Laenge des Rechtecks ein: " )),
				Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Breite des Rechtecks ein: " )));
		
		double flaecheKreis = Reck.getFlaeche();
		
		Kreis circle = new Kreis();
		circle.setRadiusByFlaeche(flaecheKreis);
	
		System.out.println("Rechtecklaenge: " + Reck.getLaenge());
		System.out.println("Rechteckbreite: " + Reck.getBreite()); 
		System.out.println("Rechteckflaeche: " + Reck.getFlaeche()); 
		System.out.println("Kreisradius: " + String.format("%2f", circle.getRadius()));
		System.out.println("Kreisflaeche: " + circle.getFlaeche());
		
		
	
	}

}
