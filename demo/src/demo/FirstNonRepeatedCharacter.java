package demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList("array", "apple", "rat");
        
        inputStrings.forEach(str -> {
            Optional<Character> firstNonRepeatedChar = str.chars() // Get stream of chars
                .mapToObj(c -> (char) c) // Convert int stream to character stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Count frequency
                .entrySet().stream()
                .filter(e -> e.getValue() == 1) // Filter characters appearing only once
                .map(Map.Entry::getKey) // Get the character
                .findFirst(); // Get first occurrence

            System.out.println(firstNonRepeatedChar.orElse(null)); // Print the first non-repeated character or null
        });
    }
}
