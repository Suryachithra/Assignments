package com.assignments;

public class Assignment12 {

	public static void main(String[] args) {

		/*
		 * Calling the method and printing "true" for prime number and "false" for
		 * non prime number;
		 */		
		System.out.println(primeNumber(9));
	}

	//Method to find whether a number is prime or not
	public static boolean primeNumber(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false; // n is divisible by i, so it's not prime
			}
		}
		return true;

	}
}
