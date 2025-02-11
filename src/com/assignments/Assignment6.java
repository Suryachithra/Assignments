package com.assignments;

public class Assignment6 {

	public static void main(String[] args) {

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		// Check if the credit score is greater than 750
		if (creditScore > 750) {
			System.out.println("Loan is approved as you have enough credit score");
		}

		// Check if the credit score is between 650 and 750
		else if (creditScore >= 650 || creditScore <= 750) {

			/*
			 * Check if the income is greater than or equal to 50000 
			 * And whether the person
			 * is employed And the DTI ratio is less than 40%
			 */
			if (income >= 50000 && isEmployed == true && debtToIncomeRatio < 40) {
				System.out.println("Loan is approved for " + customerName);
			}

		} else {
			System.out.println("Loan is denied");
		}

	}

}
