package practice.collections.codes;

import org.testng.annotations.Test;

public class NumberSwappingprogram {

	//@Test
	public void SwapWithThardVariable() {
		int temp;
		int x = 100;
		int y = 200;

		// Swapping in steps
		temp = x;
		x = y;
		y = temp;

		// Verify swapped values
		System.out.println("x = " + x + " and y = " + y);
	}
	
	
	@Test
	public void SwapWithOutThardVariable() {
		
		   int x = 100;
	        int y = 200;
	 
	        //Swapping in steps
	        x = x + y;      //x = 100 + 200 = 300
	        y = x - y;      //y = 300 - 200 = 100
	        x = x - y;      //x = 300 - 100 = 200
	         
	        //Verify swapped values
	        System.out.println("x = " + x + " and y = " + y);
	}
}
