package exercise_07;

import javax.swing.JOptionPane;

public class Stringsort {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Bitte Text 1 geben: ");
		String input2 = JOptionPane.showInputDialog("Bitte Text 2 geben: ");
		String input3 = JOptionPane.showInputDialog("Bitte Text 3 geben: ");

		if ((input1.compareTo(input2) <= 0) && (input2.compareTo(input3) <= 0)) {
			System.out.println(input1);
			System.out.println(input2);
			System.out.println(input3);
		} else {
			if ((input1.compareTo(input3) <= 0) && (input3.compareTo(input2) <= 0)) {
				System.out.println(input1);
				System.out.println(input3);
				System.out.println(input2);
			} else {
				if ((input2.compareTo(input1) <= 0) && (input1.compareTo(input3) <= 0)) {
					System.out.println(input2);
					System.out.println(input1);
					System.out.println(input3);
				} else {
					if ((input2.compareTo(input3) <= 0) && (input3.compareTo(input1) <= 0)) {
						System.out.println(input2);
						System.out.println(input3);
						System.out.println(input1);
					} else {
						if ((input3.compareTo(input2) <= 0) && (input2.compareTo(input1) <= 0)) {
							System.out.println(input3);
							System.out.println(input2);
							System.out.println(input1);
						} else {
							System.out.println(input3);
							System.out.println(input1);
							System.out.println(input2);
						}

					}
				}
			}
		}
	}
}
