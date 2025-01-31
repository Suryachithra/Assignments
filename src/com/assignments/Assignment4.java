package com.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {

	public static void main(String[] args) {
		
		
		//Creating map and adding data of employee in row no: 1
		Map<String,String> map1 = new LinkedHashMap<String,String>();
		map1.put("Employee ID","E001");
		map1.put("Name","Alice Green");
		map1.put("Age","30");
		map1.put("Gender","Female");
		map1.put("Department","Engineering");
		map1.put("Position","Software Engineer");
		map1.put("Salary","75,000");
		map1.put("Email","alice@example.com");
		map1.put("Contact Number","9876543213");
		//System.out.println(map1);

		
		//Creating map and adding data of employee in row no: 2
		Map<String,String> map2 = new LinkedHashMap<String,String>();
		map2.put("Employee ID","E002");
		map2.put("Name","Bob Johnson");
		map2.put("Age","35");
		map2.put("Gender","Male");
		map2.put("Department","Marketing");
		map2.put("Position","Marketing manager");
		map2.put("Salary","85,000");
		map2.put("Email","bob@example.com");
		map2.put("Contact Number","9876543214");
		//System.out.println(map2);
		
		
		//Creating map and adding data of employee in row no: 3
		Map<String,String> map3 = new LinkedHashMap<String,String>();
		map3.put("Employee ID","E003");
		map3.put("Name","Carol White");
		map3.put("Age","28");
		map3.put("Gender","Female");
		map3.put("Department","Sales");
		map3.put("Position","Sales Executive");
		map3.put("Salary","65,000");
		map3.put("Email","carol@example.com");
		map3.put("Contact Number","9876543215");
		//System.out.println(map3);
		
		
		//Storing the data to a list, so that we can fetch the data using index and key value.
		List<Map<String,String>> employeeDetails = new ArrayList<Map<String,String>>();
		employeeDetails.add(map1);
		employeeDetails.add(map2);
		employeeDetails.add(map3);
		//System.out.println(employeeDetails);

		
		//Printing Email address of an employee
		System.out.println("Email: " + employeeDetails.get(1).get("Email"));

		
		
	}

}
