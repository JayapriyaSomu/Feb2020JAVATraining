/*1. Write a Java program to create a new array list, add some colors (string) 
and print out the collection*/

package ArrayListConcept;

import java.util.ArrayList;

public class AddColours {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Blue");
		colors.add("Rose");
		colors.add("Red");
		colors.add("Purple");
		colors.add("White");
		colors.add("Black");
		
		for(int i = 0; i < colors.size(); i++){
			System.out.println(colors.get(i));
		}
	}

}
