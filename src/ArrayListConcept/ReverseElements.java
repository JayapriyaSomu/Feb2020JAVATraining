/*7. Write a Java program to reverse elements in a array list*/

package ArrayListConcept;

import java.util.ArrayList;

public class ReverseElements {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		ArrayList<Integer> number1 = new ArrayList<Integer>();
		
//Adding elements to Arraylist number1
		number.add(10000);
		number.add(200);
		number.add(500);
		number.add(1000);
		number.add(5000);

		int n = number.size();
		System.out.println("Before Reversing: ");
		for (int i = 0; i < n; i++) {
			System.out.println(number.get(i));
		}
		
//Reversing the elements and adding it to another ArrayList		
		for (; n - 1 >= 0; n--) {
			number1.add(number.get(n - 1));
		}
		
//Printing the reversed elements in the second ArrayList
		System.out.println("After Reversing:");
		for(int k=0; k< number.size(); k++){
			System.out.println(number1.get(k));
		}
		
	}
}
