package MethodConcept;

/**
 * Define a method to find out if number is prime or not.
 * 
 * @author Jayapriya
 */
public class PrimeNumber {

	boolean isPrime;

	public boolean isPrimeNum(int num) {
		if (num <= 1) {
			return false;
		} 
		// Check from 2 to n-1
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int testnum = 3;
		PrimeNumber obj = new PrimeNumber();
		boolean result = obj.isPrimeNum(testnum);
		System.out.println(testnum + " is a prime number : " + result);

	}

}
