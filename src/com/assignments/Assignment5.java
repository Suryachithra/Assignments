package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {

       // Creating list of the top 5 most populated countries in the world.
		List<String> populatedCountries = new LinkedList<String>();
		populatedCountries.add("China");
		populatedCountries.add("India");
		populatedCountries.add("United States");
		populatedCountries.add("Indonesia");
		populatedCountries.add("Pakistan");
		
		//Storing the value of second country in a variable.
		String secondPosition = populatedCountries.get(1);
		
		//Printing the value of second country.
		System.out.println("Country Name: " +secondPosition);
		
		
		
       // Creating the set of the top 10 most visited tourist attractions in the world.
		Set<String> touristSpots = new HashSet<String>();
		touristSpots.add("The Great Wall of China");
		touristSpots.add("The Louvre Museum");
		touristSpots.add("The Vatican Museums ");
		touristSpots.add("Eiffel Tower");
		touristSpots.add("Statue of Liberty");
		touristSpots.add("The Colosseum");
		touristSpots.add("Taj Mahal");
		touristSpots.add("Disney World");
		touristSpots.add("The Pyramids of Giza");
		touristSpots.add("Sydney Opera House");
		
		//Printing the size of the set created.
		System.out.println("Size of the set is: " +touristSpots.size());
		
		
		
		//Creating a map of the 5 largest cities in the United States and their populations.
		Map<String, String> largestCitiesInUS = new HashMap<String,String>();
		largestCitiesInUS.put("New York City, New York", "8.5 million");
		largestCitiesInUS.put("Los Angeles, California", "3.9 million");
		largestCitiesInUS.put("Chicago, Illinois", "2.7 million");
		largestCitiesInUS.put("Houston, Texas", "2.3 million");
		largestCitiesInUS.put("Phoenix, Arizona", "1.7 million");
		
		//Printing the cities and their population
		System.out.println(largestCitiesInUS);
		
		
		
		//Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		int[] integers = {17,498,290908,876,-892,367,37,776,-866,-228};
		
		//Storing sum of 3rd and 5th value in a variable.
		int sumOfTwointegers = integers[2]+integers[4];
		
		//Printing the sum of 3rd and 5th value.
		System.out.println("Sum of 3rd and 5th value is: " +sumOfTwointegers);
		
		
		
		//Create a list of the top 5 highest-grossing movies of all time.
		List<String> moviesOfAllTime = new ArrayList<String>();
		moviesOfAllTime.add("Avatar");
		moviesOfAllTime.add("Avengers: Endgame");
		moviesOfAllTime.add("Titanic");
		moviesOfAllTime.add("Star Wars: The Force Awakens");
		moviesOfAllTime.add("Avengers: Infinity War");
		
		//Storing 3rd movie in the list to a variable.
		String movie = moviesOfAllTime.get(2);
		
		//Printing the third movie on the list.
		System.out.println("Movie Name: " +movie);
		
	}

}
