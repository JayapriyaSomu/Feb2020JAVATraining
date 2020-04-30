//	Write a Java program to trim the virtual capacity of an 
//array list the current list size.

package ArrayListConcept;

import java.util.ArrayList;

public class TrimVirtualCapacityConcept {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Blue");
		colors.add("Rose");
		colors.add("Red");
		colors.add("Purple");
		colors.add("White");
		colors.add("Black");

		System.out.println(colors.size());
		System.out.println(colors);

/*		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}*/

		colors.trimToSize();
		System.out.println(colors);

	}

}
