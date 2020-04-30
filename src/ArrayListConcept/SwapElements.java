
//Write a Java program of swap two elements in an array list.

package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10000);
		number.add(200);
		number.add(500);
		number.add(1000);
		number.add(5000);
		System.out.println("Before Swap:" + number);
	
		Collections.swap(number, 1, 2);
		
		System.out.println("After Swap :" + number);

	}

}
