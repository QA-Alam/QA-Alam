package practice.collections.codes;

import java.io.File;
import java.io.FileReader;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void ArithmeticException() {
		int a = 0, b = 10;
		int c = 0;
		try {
			c = b / a;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("We are just printing the stack trace.\n"
					+ "ArithmeticException is handled. But take care of the variable \"c\"");
		}
		System.out.println("Value of c :" + c);
	}

	public static void NullPointerException() {
		try {
			String a = null; // null value
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}
	}

	public static void FileNotFoundException() {
		try {
			// Following file does not exist
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
	}

	public static void NumberFormatException() {
		try {
			// "akki" is not a number
			int num = Integer.parseInt("akki");

			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}

	public static void ArrayIndexOutOfBoundsException() {
		try {
			int a[] = new int[5];
			a[6] = 9; // accessing 7th element in an array of
						// size 5
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}
	}

	@Test
	public static void tryCatch() {
		// Main try block
		try {
			// try block1
			try {
				System.out.println("Try Block1");
				int num = 15 / 0;
				System.out.println(num);
			} catch (ArithmeticException e1) {
				System.out.println(e1.getMessage());
			}
			// try block2
			try {
				System.out.println("Try Block2");
				int num = 100 / 0;
				System.out.println(num);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
			}
			System.out.println("General statement after Block1 and Block2");
		} catch (ArithmeticException e3) {
			System.out.println("Main Block Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("Main Block ArrayIndexOutOfBoundsException");
		} catch (Exception e5) {
			System.out.println("Main Block General Exception");
		}
		System.out.println("Code after Nested Try Block");
	}

	// @Test
	public static void tryCatchFinaly() {
		int a[] = new int[2];
		try {
			System.out.println("Access element three :" + a[3]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception thrown :" + e);

		} finally {
			a[0] = 6;
			System.out.println("First element value: " + a[0]);
			System.out.println("The finally statement is executed");
		}
	}
	static void validate_Age(int age){  
	     //if specified age is < 18, throw ArithmeticException
	     if(age < 18)  {    	 
	      throw new ArithmeticException("Not eligible to vote and drive!!");
	     } else   //print the message
	      System.out.println("Eligible to vote and drive!!");  
	   }  
	
	   public static void main(String args[]){  
	      //call validate_Age method
	      validate_Age(10);  
	     
	  }  
	}  
