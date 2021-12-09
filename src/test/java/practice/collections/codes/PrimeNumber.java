package practice.collections.codes;

import org.testng.annotations.Test;

public class PrimeNumber {

	@Test
	public static void findprimeNum() {
		int num = 13;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println(" Not prime number ::" + num);
				break;
			} else {
				System.out.println("This is a prime number ::" + num);
				break;
			}
		}
	}
	
}
	
