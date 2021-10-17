package practice.collections.codes;

import java.util.Arrays;

public class ArraysClass {


	       
	  public static void main(String[] args) {
			//String name = "Sazzad";
			//String names = "Alam";
			//String name1 = "Alam";
			//String name12 = "Alam";
		  
		  // How to declare single dimensional array 
		  // Array length is fixed
		  // Array is faster 
			String a[]= new String[1000];
			a[0] = "Alam";
			a[1] = "sazzad";
			a[2] = "Mir";
			a[3] = "Asif";
			a[4] = "Rehan";
			a[5] = "Rehan";
			for (int i =0; i<a.length; i++) {	
				System.out.println(a[i]);
			}
			
			System.out.println(a[1]);
			
			
/*			// This is the old way (single dimensional)
			int num[]= new int[5];
			num[0] = 100;
			num[1] = 200;
			num[2] = 300;
			num[3] = 400;
			num[4] = 500;
			
			//System.out.println(Arrays.asList(num));
			
			// This is the new way (single dimensional)
			int []numbers = {100, 200, 300, 400, 500};
			                  
			                   
			 // How to declare multidimensional array 		
			String[][] arr = {{"Sazzad", "Alam", "Mir","Asif", "Rehan"},
			                  {"smart", "tech", "fahima","rokeya", "sarmin"},
			                  {"Oni", "Ani", "Hassan","Rahaman", "All students"}} ;  
*/
}
}