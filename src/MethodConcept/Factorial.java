package MethodConcept;
//9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also,
//1! = 1
//0! = 1
public class Factorial {

	public int computeFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int input = 11;
		Factorial obj = new Factorial();
		long result = obj.computeFactorial(input);
		System.out.println("The factorial of" + " " + input + "  is  :  " + result);

	}

}
