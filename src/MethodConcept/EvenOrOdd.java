package MethodConcept;

/**
 * Define a program to find out whether a given number is even or odd.
 * @author Rajkumar
 */
public class EvenOrOdd {
	
	String output;

	public String evenOddcalc(int num) {
		if (num % 2 == 0) {
			output = num + " is an even number";			
		} else {
			output = num + " is an odd number.";
		}
		return output;
	}

	public static void main(String[] args) {

		EvenOrOdd result = new EvenOrOdd();
		String out = result.evenOddcalc(11);
		System.out.println(out);

	}

}
