package com.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		
		Map<String, String> aliceDetails = new LinkedHashMap <String,String>();
		aliceDetails.put("Name", "Alice Johnson");
		aliceDetails.put("Base Salary", "75000");
		aliceDetails.put("Experience (Years)", "5");
		aliceDetails.put("Year-End Rating(out of 5)", "4.2");
		
		Map<String, String> bobDetails = new LinkedHashMap <String,String>();
		bobDetails.put("Name", "Bob Smith");
		bobDetails.put("Base Salary", "68000");
		bobDetails.put("Experience (Years)", "3");
		bobDetails.put("Year-End Rating(out of 5)", "3.8");
		
		Map<String, String> carolDetails = new LinkedHashMap <String,String>();
		carolDetails.put("Name", "Carol Davis");
		carolDetails.put("Base Salary", "82000");
		carolDetails.put("Experience (Years)", "7");
		carolDetails.put("Year-End Rating(out of 5)", "4.5");
		
		Map<String, String> davidDetails = new LinkedHashMap <String,String>();
		davidDetails.put("Name", "David Brown");
		davidDetails.put("Base Salary", "90000");
		davidDetails.put("Experience (Years)", "10");
		davidDetails.put("Year-End Rating(out of 5)", "2");
		
		Map<String, String> evaDetails = new LinkedHashMap <String,String>();
		evaDetails.put("Name", "Eva Green");
		evaDetails.put("Base Salary", "60000");
		evaDetails.put("Experience (Years)", "2");
		evaDetails.put("Year-End Rating(out of 5)", "3.5");
		
		
		  List<Map<String, String>> employeeDetails = new ArrayList<Map<String, String>>(); 
		  employeeDetails.add(aliceDetails);
		  employeeDetails.add(bobDetails);
		  employeeDetails.add(carolDetails); 
		  employeeDetails.add(davidDetails);
		  employeeDetails.add(evaDetails);
		  
		  System.out.println(employeeDetails.get(0).get("Name"));
		  System.out.println(employeeDetails.size());
		 
		
		System.out.println(aliceDetails.get("Base Salary"));
		
		String[] rating = {aliceDetails.get("Year-End Rating(out of 5)"),bobDetails.get("Year-End Rating(out of 5)"),carolDetails.get("Year-End Rating(out of 5)"),davidDetails.get("Year-End Rating(out of 5)"),evaDetails.get("Year-End Rating(out of 5)")};
		
		
		 
		
	}

}
