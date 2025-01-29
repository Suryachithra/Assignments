package com.assignments;

public class EmpGroups {

	public static void main(String[] args) {
		
		// Creating arrays for Employees name and IDs
		String[] empNameArray = new String[3];
		int[] empIdArray = new int[3];
		
		// Creating object to access the values of the Employees class
		Employees obj = new Employees();
		
		// Adding the employee names to array
		empNameArray[0] = obj.empName1;
		empNameArray[1] = obj.empName2;
		empNameArray[2] = obj.empName3;
		
		// Adding the employee IDs to array
		empIdArray[0] = obj.empId1;
		empIdArray[1] = obj.empId2;
		empIdArray[2] = obj.empId3;
		
		// Printing each employee's name along with their corresponding employee ID.
		System.out.println("Employee Name: "+ empNameArray[0] + ","+ " Employee ID: " +empIdArray[0]);
		System.out.println("Employee Name: "+ empNameArray[1] + ","+ " Employee ID: " +empIdArray[1]);
		System.out.println("Employee Name: "+ empNameArray[2] + ","+ " Employee ID: " +empIdArray[2]);
	}

}
