package com.assignments;

public class Assignment13 {

	public static void main(String[] args) {

		// storing values in an array
		int[] num = { 1, 2, 3, 4, 5 };

		// First half of the diamond pattern
		for (int i = 1; i <= num.length; i++) {

			// Loop to print the space
			for (int j = 1; j <= num.length - i; j++) {
				System.out.print(" ");
			}
			// Loop to print the numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// Second half of the diamond pattern
		for (int i = num.length - 1; i >= 1; i--) {

			// Loop to print the space
			for (int j = 1; j <= num.length - i; j++) {
				System.out.print(" ");
			}
			// Loop to print the numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
