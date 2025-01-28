package com.assignments;

public class Assignment2 {

	public static void main(String[] args) {

		// Multi-Dimensional Array Practice

		// 1D Array with semesters
		String[] semesters = { "Sem 1", "Sem 2", "Sem 3", "Sem 4", "Sem 5" };
 
		// 2D Array with Subjects and Marks
		/*
		 * String[][] subjectsAndMarks = { { "Subject 1", "Subject 2", "Subject 3",
		 * "Subject 4", "Subject 5", "Subject 6" }, { "Mark 1", "Mark 2", "Mark 3",
		 * "Mark 4", "Mark 5", "Mark 6" } };
		 */
		
		String[][]subjectsAndMarks = new String[2][6];
		

		// 3D Array with actual values for Subject Names and Marks
		String[][][] semesterResult = {
				{ 
				  {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing","Basic Electrical Eng."}, 
				  { "78", "85", "91", "74", "88", "79" }
				},
				
				{ 
				  {"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"},
				  {"82","77","93","69","84","90" } 
				},
				
				{ 
				  {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."},
				  {"88","81","76","92","85","78" } 
				},
				
				{ 
				  {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"},
				  {"91","73","89","80","76","87" } 
				 },
				
				{ 
				  {"Probability & Stats","Machine Learning", "Compiler Design", "Theory of Computation","Embedded Systems", "Computer Graphics"},
				  {"86","88","84","95","73","90" } 
			    }

		};
		
		//Print the name of Subject 4 in Sem 3
		String subject4 = semesterResult[2][0][3];
		System.out.println("Subject 4 in Semester 3 is: " + subject4);
		
		//Print the name of Subject 5 in Sem 3
		String subject5 = semesterResult[2][0][4];
		System.out.println("Subject 5 in semester 3 is: " + subject5);
		
		//Print the mark of Subject 3 in Sem 5
		String mark3 = semesterResult[4][1][2];
		System.out.println("Mark of subject 3 in semester 5 is: " + mark3);
		
		//Print the mark of Subject 6 in Sem 5
		String mark6 = semesterResult[4][1][5];
		System.out.println("Mark of subject 6 in semester 5 is: " + mark6);
		
	}

}
