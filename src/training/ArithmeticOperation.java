package training;

public class ArithmeticOperation {

	public static void main(String[] args) {
	/*	a. -5 + 8 * 6
		b. (55+9) % 9 
		c. 20 + -3*5 / 8 
		d. 5 + 15 / 3 * 2 - 8 % 3 
		Expected Output :
		43 
		1 
		19 
		13*/
		
		System.out.println("The result of -5 + 8 * 6 is : " + (-5 + 8 * 6));
		System.out.println("Result of (55 + 9) % 9 is : " + ((55 + 9) % 9));
		System.out.println("Result of 20 + -3*5 / 8 is : " + (20 + -3*5 / 8));
		System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3 is " + (5 + 15 / 3 * 2 - 8 % 3));
		System.out.println("******************************************************************");
		
		System.out.println("Different Test Data : ");
		int x = -4 + 10 *20;
		System.out.println(x);
		
		int y = (200+9) %3;
		System.out.println(y);
		
		int n = 100 + -5*7 / 10;
		System.out.println(n);
		
		int m = 50 + 25 / 13 * 20 - 80 % 3;
		System.out.println(m);
	}
}
