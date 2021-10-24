package practice.collections.codes;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
    // How you find out even number & odd number
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) { // Remainder or mod
						
				System.out.println("Even number::" + i);
			} else {
				System.out.println("Odd number::" + i);

			}

		}

	}

}
