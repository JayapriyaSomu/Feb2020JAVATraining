/*\\2. Write a Java program to insert an 
element into the array list at the first and last positions.*/

package ArrayListConcept;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(90);
		numbers.add(230);
		numbers.add(450);
		numbers.add(590);
		numbers.add(2000);

		System.out.println("BEFORE INSERTING ELEMENTS");
		System.out.println("-------------------------");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Inserting elements in the first and last position
		
		int length = numbers.size();
		numbers.add(0, 1000);
		numbers.add(length + 1, 5000);

		System.out.println("AFTER INSERTING ELEMENTS");
		System.out.println("-------------------------");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

	}

}
