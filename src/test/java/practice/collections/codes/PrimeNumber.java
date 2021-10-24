package practice.collections.codes;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 39;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println(" Not prime number::" + num);
				System.out.println("--------------");
				break;
			} else {
				System.out.println("--------------");
				System.out.println("prime number ::" + num);
			}
		}

	}
}