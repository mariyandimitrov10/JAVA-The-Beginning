package exercise_05;

import javax.swing.JOptionPane;


public class Kreistabelle {

	public static void main(String[] args) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Bitte Radius geben: "));
		
		Kreis kreis = new Kreis();
		
		if( radius ==  5) {
		} else JOptionPane.showMessageDialog(null, "Die Kreistabelle soll mit Wert 5.0 beginnen !!!");
		
		System.out.println("Radius \t\tUmfang \t\t\tFlaeche");
		for( double i = 5; i < 151; i += 5) {
			radius = i;
			kreis.setRadius(i);
			System.out.println( radius + "\t\t" + String.format("%2f", kreis.getUmfang()) 
							+ "\t\t" + String.format("%2f", kreis.getFlaeche()));
		}
		

	} 

}
