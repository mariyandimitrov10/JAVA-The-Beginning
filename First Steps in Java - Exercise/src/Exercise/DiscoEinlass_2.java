package Exercise;

import javax.swing.JOptionPane;

public class DiscoEinlass_2 {

	public static void main(String[] args) {
		String istAltGenug = JOptionPane.showInputDialog("Bist du 18 oder älter?").toLowerCase();

		if (istAltGenug.equals("ja")) {
			String istVIP = JOptionPane.showInputDialog("Bist du ein VIP?").toLowerCase();
			String istFrau = JOptionPane.showInputDialog("Bist du eine Frau?").toLowerCase();

			if (istVIP.equals("ja") && istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null,
						"Herzlich Willkommen in unserer Disco - viel Spass in der VIP Lounge! "
								+ "Heute ist Ladies - Night. Du bekommst 15% Rabatt auf Getraenke!");
			} else if (istVIP.equals("ja")) {
				JOptionPane.showMessageDialog(null,
						"Herzlich Willkommen in unserer Disco - Viel Spass in der VIP - Lounge!");
			} else if (istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unserer Disco - Viel Spass! "
						+ "Heute ist Ladies Night. Du bekommst 15% Rabatt auf alle Getraenke!");
			} else
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unserer Disco! Viel Spass :)");
		} else
			JOptionPane.showMessageDialog(null, "Ei gude. Du kommst hier nicht rein!");

	}

}
