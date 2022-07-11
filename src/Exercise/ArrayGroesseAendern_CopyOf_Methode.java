package Exercise;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayGroesseAendern_CopyOf_Methode {

	public static void main(String[] args) {
		String[] arr = {"Hans", "Christian", "Lisa"};
		String outputStr = "New Array: ";
		final int NEW_LENGTH = Integer.parseInt(JOptionPane.showInputDialog
				("Please enter the amount by which the array should be increased: "));
		
		// CopyOf-Methode
		arr = Arrays.copyOf(arr, NEW_LENGTH);
		
		// Bau des Ausgabestrings
		for( int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) outputStr += arr[i]; 
			else outputStr += arr[i] + ", ";
		}	
		
		JOptionPane.showMessageDialog(null, outputStr);
	}

}
