package Exercise;

import java.util.Arrays;

public class ArrayUebungen {

	public static void main(String[] args) {

		// Aufgabe 1
		int[] arr1 = new int[5];
		arr1[0] = 3;
		arr1[1] = 6;
		arr1[2] = 7;
		arr1[3] = 1;
		arr1[4] = 5;

		// Aufgabe 2
		System.out.println("Aufgabe 2: " + arr1[2] + " " + arr1[4]);

		// Aufgabe 3
		System.out.print("Aufgabe 3: ");
		System.out.print(arr1[3]);
		arr1[3] = 6;
		System.out.println(" " + arr1[3]);

		// Aufgabe 4
		System.out.println("Aufgabe 4: ");
		int[] arr2 = new int[] { 5, 7, 8, 2, 4 };
		int[] arr21 = { 5, 7, 8, 2, 4 };

		// Aufgabe 5
		System.out.print("Aufgabe 5: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// Aufgabe 6
		System.out.print("Aufgabe 6: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 0;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// Aufgabe 7
		System.out.print("Aufgabe 7: ");
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 17);
		for (int i : arr3) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Aufgabe 8
		System.out.print("Aufgabe 8: ");
		int[] arr4 = { 5, 7, 8, 2, 4 };
		Arrays.sort(arr4);
		for (int i : arr4) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Aufgabe 9
		System.out.print("Aufgabe 9: ");
		String[] arr5 = { "B", "V", "M", "A" };
		Arrays.sort(arr5);
		int index = Arrays.binarySearch(arr5, "M");
		if(index >= 0) {
			System.out.println("Element ist auf Stelle " + index + " gefunden.");
		}
		else System.out.println("Element nicht gefunden");
		

		// Aufgabe 10
		System.out.print("Aufgabe 10: ");
		String[] arr6 = { "B", "V", "M", "A" };
		//Arrays.sort(arr6);
		if (Arrays.equals(arr5, arr6) == true) {
			System.out.println("Ist gleich");
		} else {
			System.out.println(" Ist NICHT gleich");
		}

		// Aufgabe 11
		System.out.println("Aufgabe 11 ");
		System.out.print("a: ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.print("b: ");
		for (String i : arr5) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println("neue Aufgabe: ");
		double[] b = new double[] { 5.5, 5.6, 5.7, 5.8, 5.9 };

		System.out.print(b[0] + " " + b[1] + " " + b[2] + " " + b[3] + " " + b[4] + "\n");
		
		System.out.println();
		for (double i : b) {
			System.out.println(i + " -->");
		}
		System.out.println();
		int indexAt = Arrays.binarySearch(b, 5.7);
		System.out.println(indexAt);
		
		char[] a = {'a','b' ,'c'};
		char[] M = {'a','b' ,'c'};
		int newChar = Arrays.compare(a, M);
		System.out.println(newChar);
		
	}
}
