package demo;

import java.util.HashMap;

public class FirstNonRepeatedChar {
	 public static void main(String[] args) {
	        String[] inputArray = {"array", "apple", "rat"};
	        
	        for (String str : inputArray) {
	            System.out.println(getFirstNonRepeatedChar(str));
	        }
	    }

	    public static char getFirstNonRepeatedChar(String str) {
	        // Create a HashMap to store character frequency
	        HashMap<Character, Integer> charCountMap = new HashMap<>();
	        
	        // Count each character's frequency
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Find the first non-repeated character
	        for (char c : str.toCharArray()) {
	            if (charCountMap.get(c) == 1) {
	                return c;  // Return the first non-repeated character
	            }
	        }
	        
	        return '\0';  // Return null character if no unique character is found
	    }
	}


