/*Question 1: Write a program to print the following pattern using for loop:

00 01 02 03 04 05 06 07 08 09 
10 11 12 13 14 15 16 17 18 19 
20 21 22 23 24 25 26 27 28 29 
30 31 32 33 34 35 36 37 38 39 */

package training;

public class PrintPattern {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			System.out.print(" " + "0" + i );
		}
		
		System.out.println("");
		for(int i = 10; i < 20; i++){			
			System.out.print(" " + i );
		}
		
		System.out.print("\n");
		for(int i = 20; i < 30; i++){
			System.out.print(" " + i);
		}
		
		System.out.println("");
		for(int i = 30; i < 40; i++){
			System.out.print(" " + i);
		}

		
		
	}

}
