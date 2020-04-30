package ArrayListConcept;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Jaya");
		name.add("Raj");
		name.add("Karthik");
		name.add("Chandru");
		
		System.out.println("Before emptying the list");
		for(int i=0; i < name.size();i++){
			System.out.println(name.get(i));
		}
		
		name.clear();
		
		System.out.println("After emptying the list");
		
		for(int i=0; i < name.size();i++){
			System.out.println(name.get(i));
		}
		
	}

}
