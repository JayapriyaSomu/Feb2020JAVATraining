// Write a Java program to print all the elements of a ArrayList 
//using the position of the elements

package ArrayListConcept;

import java.util.ArrayList;

public class PrintAllElements {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();

		number.add(10000);
		number.add(200);
		number.add(500);
		number.add(1000);
		number.add(5000);

		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}

	}

}
