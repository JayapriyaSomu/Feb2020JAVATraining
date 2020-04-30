package MethodConcept;

import java.util.Scanner;

public class MarksAndGrades {

	String output;
	public String displayGrades(int marks) {
		if ((marks >= 91) && (marks <= 100)) {
			output = "Your grade is AA";
			System.out.println(output);
		} else if ((marks >= 81) && (marks <= 90)) {
			output = "Your grade is AB ";
			System.out.println(output);
		} else if ((marks >= 71) && (marks <= 80)) {
			output = "Your grade is BB ";
			System.out.println(output);
		} else if ((marks >= 61) && (marks <= 70)) {
			output = "Your grade is BC";
			System.out.println(output);
		} else if ((marks >= 51) && (marks <= 60)) {
			output = "Your grade is CD ";
			System.out.println(output);
		} else if ((marks >= 41) && (marks <= 50)) {
			output = "Your grade is DD ";
			System.out.println(output);
		} else if (marks <= 40) {
			output = "Sorry! You have failed the test :( ";
			System.out.println(output);
		} else{
			System.out.println("Wrong input..please check");
		}
		return output;
	}

	public static void main(String[] args) {

		System.out.println("Enter your marks to know your grade(out of 100) :");
		Scanner in = new Scanner(System.in);
		int marks = in.nextInt();

		MarksAndGrades obj = new MarksAndGrades();
		obj.displayGrades(marks);

	}

}
