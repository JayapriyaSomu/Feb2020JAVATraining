//Write a Java program to extract a portion of a array list.

package ArrayListConcept;

import java.util.ArrayList;

public class ExtractAPart {

	public static void main(String[] args) {
		
		ArrayList<Object> order = new ArrayList<Object>();
		
		order.add("Priya");
		order.add("MariettaAtlanta");
		order.add("Selenium");
		order.add(2039688);
		
		System.out.println(order.size());
		
		System.out.println("Original ArrayList: " + order);
		
		ArrayList<Object> orderPart = new ArrayList<Object>(order.subList(0,2));
		System.out.println("Extracted Arraylist:" + orderPart);
		
		
		

	}

}
