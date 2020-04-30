//4. Write a Java program to update specific array element 
//by given element.
package ArrayListConcept;

import java.util.ArrayList;

public class UpdateElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(500);
		numbers.add(400);
		numbers.add(350);
		numbers.add(600);
		
		int givenElement = 9000;
		
		System.out.println("Before update:" + numbers.get(2));
		
		numbers.add(2, givenElement);
		
		System.out.println("After update:" + numbers.get(2));
		
		
	}

}
