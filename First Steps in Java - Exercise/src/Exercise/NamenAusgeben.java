package Exercise;

import javax.swing.JOptionPane;

public class NamenAusgeben {

	public static void main(String[] args) {
		String name = "";
		int n = 1;
		while (n <= 5) {
			for (int i = 1; i <= 5; i++) {
				name += Integer.toString(n) + ":" + " Mariyan" + "\n";
				n++;
			}
			JOptionPane.showMessageDialog(null, name);

		}
	}
}