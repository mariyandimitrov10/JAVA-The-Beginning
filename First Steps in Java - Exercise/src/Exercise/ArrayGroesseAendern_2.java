package Exercise;

import javax.swing.JOptionPane;

public class ArrayGroesseAendern_2 {

	public static void main(String[] args) {
		
		String[] arr = {"Hans", "Christian", "Lisa"};
		String outputStr = "New Array: ";
		final int USR_AMOUNT = Integer.parseInt(JOptionPane.showInputDialog
				("Please enter the amount by which the array should be increased: "));
		
		String[] tmpArr = new String[arr.length + USR_AMOUNT];
		
		// Schreiben der alten Elemente in tmpArr
		for(int i = 0; i < arr.length; i++) {
			tmpArr[i] = arr[i];
		}
		
		// Altes Array zeigt auf neues Array
		arr = tmpArr;
		
		// Bau des Ausgabestrings
		for( int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) outputStr += arr[i]; 
			else outputStr += arr[i] + ", ";
		}	
		
		JOptionPane.showMessageDialog(null, outputStr);
	}
}
