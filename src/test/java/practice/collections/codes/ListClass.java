package practice.collections.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ListClass {

	// What is the collection?
	// Ans:- The collection in java a framework that an architecture to store and 
	// manipulate the group of object 
	
	
	// Differences between Collection, Collections & Collectors 
	// Collection -> The Collection is an interface to store and manipulate the group of the object
	
	
	// Collections -> Collections is a utility class in java, Help with with collections we can 
	// reverse the string/number of value, find out max, min value as well as many more operations 
	
	
	// Collectors -> Collectors is final class that extend the object class,Help 
	// of collector we can remove the duplicate value & many more 
	
	// What is the List?
	 // List is an interface
	// List implements many class like (ArrayList, LinkedList, Vector & stack)
	
	// ArrayList advantage
       // ArrayList support dynamic arrays that can grow as needed
	   // ArrayList allows duplicate elements and null values as well
	   // ArrayList class maintain the insertion order 
	   // ArrayList is non-synchronized, That means it's faster 
	   // ArrayList flowing the index theory java 
	   // ArrayList when add the new values increases the size 50%
	   // ArrayList faster then vector 
	   // ArrayList slower then array
	
	
	
	
	
	
	// Generic style
	public static void main(String[] args) {

		// Old way
		// List list = new ArrayList();
		// list.add("ALam");
		// list.add(200.99);
		// list.add(300);
		// list.add(400);
		// list.add(500);
		// list.add(600);

		// New way

		// Array list is faster (non synchronized)
		// Compare to array-list array is faster
		// Array following the index
		// When array list add the new value is faster
		// when array list add the value memory size increase 50%
		// Array list allow the null value as much requirement
		List<Integer> lists = new ArrayList<>();
		lists.add(100);
		lists.add(200);
		lists.add(300);
		lists.add(300);
		lists.add(200);
		lists.add(100);
		lists.add(null);
		lists.add(null);
		lists.add(null);
		lists.add(null);

		// Array length is fixed, Array use the length for count the value
		// ArrayList is a dynamic, ArrayList use the size() for count the value
		for (int i = 0; i < lists.size(); i++) {
			// System.out.println(lists.get(i));
		}

		// 2nd way
		//List<Integer> num = Arrays.asList(100, 200, 300);

		ArrayList<String> name = new ArrayList<>();
		name.add("Rahaman");

		// Vector is synchronized
		// When vector add the value memory size increase 100%
		// vector can remove the value using remove method
		Vector<String> vactor = new Vector<>();
		vactor.add("Rahaman");
		vactor.add("Alam");
		vactor.add("Mohammed");
		vactor.add("Smart");
		vactor.add("Tech");
		vactor.add("Tech");
		vactor.add("Tech");
		vactor.add(null);
		vactor.add(null);
		vactor.add(null);
		vactor.add(null);
		vactor.add(null);

		vactor.remove(3);

		for (int i = 0; i < vactor.size(); i++) {
			System.out.println(vactor.get(i));
		}
		// LinkedList flowing linked theurey
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add(0, "Rahaman");
		linkList.add(1, "Alam");
		linkList.add(2, "Mohammed");
		linkList.add(3, "Smart");
		linkList.add(8, "Tech");
		linkList.add(3, "Tech");
		linkList.add(3, "Tech");
		linkList.add(4, null);
		linkList.add(4, null);
		linkList.add(4, null);
		// 1 -> 2 -> 3 -> 4 -> 5 ->

	}

	// How to find out duplicate from array ? NY square, N square NYS square
	// @Test
	public static void getDuplicateElement() {
		String[] value = { "Java", "Selenium", "Maven", "TestNG", "Cucumber", "Java" };
		Set<String> store = new HashSet<>();
		for (String duplicate : value) {
			if (store.add(duplicate) == false) {
				System.out.println("This is my duplicate value : " + duplicate);
			}
		}

	}

	// How to find out the max & minimum value
	//@Test
	public static void getMaxValue() {
		// 2nd way
		List<Integer> num = Arrays.asList(100, 200, 300, 500, 700, 800);
		int max = Collections.max(num);
		System.out.println("Maximum value : " + max);

		int min = Collections.min(num);
		System.out.println("Minimum value : " + min);
	}
   // @Test
	// How to remove duplicate values
	public static void removeDuplicate() {
		List<Integer> remove = Arrays.asList(100, 200, 200, 300, 500, 700, 800);
		List<Integer> duplicate = remove.stream().distinct().collect(Collectors.toList());
		System.out.println("Only unic values : " + duplicate);
		
	}
	
	// How to sort the data from elements 
    @Test
    public static void sortTheData() {
    	ArrayList <String> values = new ArrayList <String> ();
    	values.add("Rokeya");
    	values.add("Sazzad");
    	values.add("Asif");
    	values.add("Qasim");
    	values.add("Fahima");
    	
    	//  How to know there is data which one you needed?  	 	
    	if(values.contains("Sazzad")) {
    		System.out.println("Sazzad is present");
    	}
    	else {
    		System.out.println("Sazzad not present");
    	}
    	
    	
    	
    	Collections.sort(values);
	    //System.out.println("after  sort data");
    	
    	for(String data : values) {
    		System.out.println("after sort the data : "+ data);	
    	}
    }
    
    
}











