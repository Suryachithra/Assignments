package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment7 {

	public static void main(String[] args) {

		// Storing all the transactions in ArrayList
		List<Double> transactionDetails = new ArrayList<Double>();
		transactionDetails.add(50000.00);
		transactionDetails.add(-2000.00);
		transactionDetails.add(3000.00);
		transactionDetails.add(15000.00);
		transactionDetails.add(-200.00);
		transactionDetails.add(-300.00);
		transactionDetails.add(4000.00);
		transactionDetails.add(-3000.00);

		// Printing ArrayList
		System.out.println(transactionDetails);

		int count = 0;
		int debitCount = 0;
		int creditCount = 0;
		double credit = 0;
		double debit = 0;
		double bankBalance = 0;

		for (int i = 0; i < transactionDetails.size(); i++) {

			if (transactionDetails.get(i) < 0) {
				debit = debit + transactionDetails.get(i);
				debitCount++;
			}

			else {
				credit = credit + transactionDetails.get(i);
				creditCount++;
			}

			if (transactionDetails.get(i) > 10000 && transactionDetails.get(i) > -10000) {
				count++;
			}

			bankBalance = bankBalance + transactionDetails.get(i);
		}

		// Printing total number of debit transactions completed
		System.out.println("Total number of debit is " + debitCount);

		// Printing total number of credit transactions completed
		System.out.println("Total number of credit is " + creditCount);

		// Printing the total amount debited in account
		System.out.println("Total amount debited in account is " + debit);

		// Printing the total amount credited in account
		System.out.println("Total amount credited in account is " + credit);

		/*
		 * Printing the message “Suspicious credit/ debit Transaction with Amount” if
		 * any transaction limit exceeds +/- 10000
		 */
		System.out.println("Suspicious credit/ debit Transaction with Amount.");

		// Printing total number of suspicious transactions
		System.out.println("Total number of suspicious transactions is " + count);

		// Printing total amount remaining at the end in Bank Account
		System.out.println("Bank balance is " + bankBalance);

	}
}
