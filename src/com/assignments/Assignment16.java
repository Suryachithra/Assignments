package com.assignments;

public class Assignment16 {

	public static void main(String[] args) {
		
		int rows = 5;
		
		//for loop to print the pattern
		for (int i = 1; i <= rows; i++) {

			// Loop to print the space
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// Loop to print the stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
