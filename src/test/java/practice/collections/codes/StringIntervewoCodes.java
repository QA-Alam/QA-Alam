package practice.collections.codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StringIntervewoCodes {

	//@Test
	public void countDuplicateString() {
		String str = "smarttechitsulition";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();

		for (char value : arr) {

			if (Character.isAlphabetic(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value) + 1);

				} else {
					charMap.put(value, 1);
				}
			}
		}

		System.out.println(charMap);
	}
	public static void main(String[] args) {
		 String aa = "smarttechitsulition";
	        String[] stringarray = aa.split("");

	    Map<String , Long> map =  Arrays.stream(stringarray)
	        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	        map.forEach( (k, v) -> System.out.println(k + " : "+ v)        );
	}
	
	//@Test
	public static void stringLenth() {
		String name = "alam"; // Initializing a String Object name
		int length = name.length(); // Calling the inbuilt length() method
		System.out.println("The length of the String \"" + name + "\" is: " + length);

		int index = name.indexOf('m');
		System.out.printf("'m' is at index %d\n", index);
	}

	/* function reverses the elements of the array */
	static void reverse(String myArray[]) {
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Reversed Array:" + Arrays.asList(myArray));
	}
    //@Test
	public static void reverseWords() {
		String[] myArray = { "one", "Two", "Three", "Four", "Five", "Six", "Seven" };
		System.out.println("Original Array:" + Arrays.asList(myArray));
		reverse(myArray);
		
		
	  
	    }
	
	

	//@Test
	public static void reverseNum() {
		int number = 987654, reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}
	
	
	
}
