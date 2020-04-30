//6. Write a Java program to search an element in a array list.

package ArrayListConcept;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {

		ArrayList<String> flights = new ArrayList<String>();
		flights.add("Air India");
		flights.add("Emirates");
		flights.add("Air France");
		flights.add("KLM");
		flights.add("Qatar");
		
		boolean result = flights.contains("KLM");
		System.out.println("Element found:" + result);
		
		boolean result1 = flights.contains("Delta Airlines");
		System.out.println("Element found:" + result1);
		
	}

}
