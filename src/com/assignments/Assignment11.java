package com.assignments;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power (2.000,-3));

	}
	
	public static double power(double x, int n) {
		
		double result = 1;
		//handling exponent = 0 case ( result will always be 1)
		if (n == 0) {
			return 1;

		}
		//handling negative exponent 
		if (n < 0) {
			x = 1 / x;  // converting the base to its reciprocal
			n = -n;		// converting exponent to positive 
		}

		for (int i = 0; i < n; i++) {
			result = result * x; // multiply result by base for n times

		}
		return result; 

	}

}
