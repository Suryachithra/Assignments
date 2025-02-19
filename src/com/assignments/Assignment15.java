package com.assignments;

public class Assignment15 {

	public static void main(String[] args) {

		//String to store the given paragraph
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		//Splitting the given paragraph into multiple words
		String[] words = paragraph.split(" ");
		
		int count = 0;
		// for loop to print count and Indexes of the word
		for (int i = 0; i< words.length; i++) {
			if (words[i].equalsIgnoreCase("Java")) {
			count ++;	
			System.out.println("The word Java occurs in index no: "+i);
		}
		
		}
		System.out.println("Total count of the word Java in the given paragraph is: "+ count);
		
	}
}

