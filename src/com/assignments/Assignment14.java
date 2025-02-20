package com.assignments;

public class Assignment14 {

	public static void main(String[] args) {

		// Count the total number of words in the sentence.
		String sentence = "Java programming is fun and challenging";
		String[] words = sentence.split(" ");
		int wordCount = words.length;
		System.out.println("Total number of words in the given sentence is " + wordCount);

		// Print the sentence words in reverse order.
		for (int i = wordCount - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
		

		/*
		 * Convert the first character of each word to uppercase and print original
		 * sentence
		 */
		StringBuilder result = new StringBuilder();
		//For loop to convert first character of each word to uppercase.
        for (String word : words) {
            if (word.length() > 0) {
                result.append(word.substring(0, 1).toUpperCase());
                result.append(word.substring(1));  
                result.append(" ");  
            }
        }
        //Print the modified sentence
        System.out.println(result);
	}

}
