//3. Write a Java program to retrieve an element (at a specified index) from a given array list.

package ArrayListConcept;

import java.util.ArrayList;

public class RetrieveElement {

	public static void main(String[] args) {
		
		ArrayList<String> order = new ArrayList<String>();
		
		order.add("Pens");
		order.add("Lunch Box");
		order.add("Photo frame");
		order.add("Headphones");
		order.add("iphone");
		
		//To retrieve element from index 3
		System.out.println(order.get(3));

		
		
	}

}
