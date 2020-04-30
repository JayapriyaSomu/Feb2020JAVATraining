//5. Write a Java program to remove the third element 
//from a array list. 

package ArrayListConcept;

import java.util.ArrayList;

public class ReturnElement {

	public static void main(String[] args) {
		
		ArrayList<Object> orderDetails = new ArrayList<Object>();
		
		orderDetails.add("iphone X");
		orderDetails.add(5);
		orderDetails.add("Gold");
		orderDetails.add("Red Phone Cover");
		
		System.out.println("BEFORE REMOVING ELEMENTS:");
		
		for(int i = 0; i < orderDetails.size();i++){
			System.out.println(orderDetails.get(i));
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		orderDetails.remove(3);
		
		System.out.println("AFTER REMOVING THIRD ELEMENT");
		for(int i = 0; i < orderDetails.size();i++){
			System.out.println(orderDetails.get(i));
		}


		
	}

}
