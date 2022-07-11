package exercise_05;

import javax.swing.JOptionPane;

public class RechteckTest {

	public static void main(String[] args) {
		Rechteck Reck = new Rechteck(Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Laenge des Rechtecks ein: " )),
									Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Breite des Rechtecks ein: " )));
		
		
		System.out.println("Lange Seite: " + Reck.getLangeSeite());
		System.out.println("Kurze Seite: " + Reck.getKurzeSeite());
		System.out.println("Diagonale: " + Reck.Diagonale());
		System.out.println("Flaeche: " + Reck.getFlaeche());
		System.out.println("Umfang: " + Reck.getUmfang());
		
		System.out.println();
		System.out.println("---Aufgabe 3:");
		
		Reck.laengeAusgeben();
		
		System.out.println();
		System.out.println("---Aufgabe 4:");
		System.out.println("VERGROESSERN");
		Reck.laengeVergroessern(5.6);
		Reck.breiteVergoessern(4.6);
		
		System.out.println("Lange Seite: " + Reck.getLangeSeite());
		System.out.println("Kurze Seite: " + Reck.getKurzeSeite());
		System.out.println("Diagonale: " + Reck.Diagonale());
		System.out.println("Flaeche: " + Reck.getFlaeche());
		System.out.println("Umfang: " + Reck.getUmfang());
		
		System.out.println();
		System.out.println("VERKLEINERN");
		Reck.laengeVerkleinern(4.2);
		Reck.breiteVerkleinern(3.5);
		
		System.out.println("Lange Seite: " + Reck.getLangeSeite());
		System.out.println("Kurze Seite: " + Reck.getKurzeSeite());
		System.out.println("Diagonale: " + Reck.Diagonale());
		System.out.println("Flaeche: " + Reck.getFlaeche());
		System.out.println("Umfang: " + Reck.getUmfang());
		
		
	}

}
