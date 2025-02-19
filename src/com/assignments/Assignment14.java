package com.assignments;

public class Assignment14 {

	public static void main(String[] args) {

		// Count the total number of words in the sentence.
		String sentence = "Java programming is fun and challenging";
		String[] words = sentence.split(" ");
		int wordCount = words.length;
		System.out.println("Total number of words in the given sentence is " + wordCount);
		
		//Convert the first character of each word to uppercase and print original sentence
		for(int i =0; i<words.length; i++) {
			char firstLetter = words[i].charAt(0);
			String letter = String.valueOf(firstLetter);
			System.out.println(letter.toUpperCase());
			
			
		}

		// Print the sentence words in reverse order.
		for (int i = sentence.length() - 1; i >= 0; i--) {
			System.out.print(sentence.charAt(i));
		}
		
		

	}

}
