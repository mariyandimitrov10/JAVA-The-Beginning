package exercise_07;

import javax.swing.JOptionPane;

public class Stringrueckwaerts3 {
	public static void main(String args[]) {
		var eingabe = JOptionPane
			.showInputDialog("Geben Sie einen Text ein: ");
		var eingabe2 = new StringBuffer("");
		long zstVorher;
		long zstNachher;

		zstVorher = System.currentTimeMillis();

		for (int i = eingabe.length() - 1; i >= 0; i--) {
		    eingabe2.append(eingabe.charAt(i));
		}

		zstNachher = System.currentTimeMillis();
		JOptionPane.showMessageDialog(null, eingabe2);
		System.out.println("Benötigte Zeit mit StringBuffer: "
			+ ((zstNachher - zstVorher)) + " Millisekunden");
		String eingabe3 = "";
		zstVorher = System.currentTimeMillis();
		for (int i = eingabe.length() - 1; i >= 0; i--) {
		    eingabe3 = eingabe3 + eingabe.charAt(i);
		}
		zstNachher = System.currentTimeMillis();
		System.out.println("Benötigte Zeit mit String: "
			+ ((zstNachher - zstVorher)) + " Millisekunden");
	    }
}
