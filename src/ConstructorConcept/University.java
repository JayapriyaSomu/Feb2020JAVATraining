package ConstructorConcept;
import java.util.ArrayList;
public class University {
	String name;
	String country;
	int establishedDate;
	ArrayList<String> listOfCourses;

	public University(String name, String country, int establishedDate, ArrayList<String> listOfCourses) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.listOfCourses = listOfCourses;
	}

	public University(String name, String country, int establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}

		public University(String name, String country) {
		this.name = name;
		this.country = country;
	}

		public University(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ArrayList<String> listOfCourses =  new ArrayList<String>();
		listOfCourses.add("C");
		listOfCourses.add("E");
		University univ1 = new University("Georgia Univ", "USA", 1990 ,listOfCourses);
		University univ2 = new University("Anna Univ", "India", 1980);
		University univ3 = new University("NY Univ", "USA");
		University univ4 = new University("Georgia Tech");
		System.out.println(univ1.name + " " + univ1.country + " " + univ1.establishedDate + " " +
							univ1.listOfCourses);
		System.out.println(univ2.name + " " + univ2.country + " " + univ2.establishedDate);
		System.out.println(univ3.name + " " + univ3.country);
		System.out.println(univ4.name);
		
		
		
	}

}
