package theorie.Other;

import javax.swing.JOptionPane;
 
class TaernerOperator {

	public static void main(String[] args) {
	
		// Tärner Operator
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Zahl zwischen 1 und 100 eingeden"));
		
		boolean result = i < 100 ? true : false;
		
		System.out.println(result == true ? "Eingabe kleiner als 100: " + i : "Eingabe größer als 100: " + i);
		
		int i1 = Integer.parseInt(JOptionPane.showInputDialog("Zahl zwischen 1 und 9 eingeben"));
		
		System.out.println(i1 < 10 ? ( i1 < 7 ? i1 + " kleiner 7" : i1 + " kleiner 10" ) : i1 + "nicht kleiner 10" );
		
	}

}
