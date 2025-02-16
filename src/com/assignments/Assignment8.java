package com.assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {

		String[] employeeName = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };

		Double[] aliceDetails = { 75000.00, 5.0, 4.2 };
		Double[] bobDetails = { 68000.00, 3.0, 3.8 };
		Double[] carolDetails = { 82000.00, 7.0, 4.5 };
		Double[] davidDetails = { 90000.00, 10.0, 2.0 };
		Double[] evaDetails = { 60000.00, 2.0, 3.5 };

		Map<String, Double[]> employeeDetails = new LinkedHashMap<String, Double[]>();
		employeeDetails.put(employeeName[0], aliceDetails);
		employeeDetails.put(employeeName[1], bobDetails);
		employeeDetails.put(employeeName[2], carolDetails);
		employeeDetails.put(employeeName[3], davidDetails);
		employeeDetails.put(employeeName[4], evaDetails);

		// Map to store hike percentage for each employee
		Map<String, Double> hikePercentageAndNamemap = new HashMap<>();

		// Calculate hike for each employee
		for (int i = 0; i < employeeName.length; i++) {

			String employee = employeeName[i];

			Double[] employeeData = employeeDetails.get(employee);

			double baseSalary = employeeData[0];
			double experience = employeeData[1];
			double rating = employeeData[2];

			double variablePayPercent;
			double bonus;
			double reward = 0;

			if (rating >= 4) {
				variablePayPercent = 15;
				bonus = 1500;
			} else if (rating >= 3) {
				variablePayPercent = 10;
				bonus = 1200;
			} else {
				variablePayPercent = 3;
				bonus = 300;
			}

			if (experience >= 5) {
				reward = 5000;
			}

			// Calculating hike percentage
			double hike = (baseSalary * variablePayPercent/100) + bonus + reward;
			double hikePercentage = (hike / baseSalary)*100;

			// Storing name of each employee with their hike percentage
			hikePercentageAndNamemap.put(employee, hikePercentage);
		}
		
		// Printing Employee name and Hike percentage
		System.out.println("Hike percentage of each employee");
		System.out.println(hikePercentageAndNamemap);

	}
}
