
/*Question 2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console*/

package training;

public class StaticArrayProgram {

	public static void main(String[] args) {

		// STRING ARRAY
		String player2[] = new String[6];
		player2[0] = "M S Dhoni  ";
		player2[1] = "38";
		player2[2] = "Indian Team    ";
		player2[3] = "01/01/1982";
		player2[4] = "M";
		player2[5] = "87.56";

		for (int i = 0; i < player2.length; i++) {
			System.out.print(" " + player2[i]);
		}
		
		// static Object Array
		Object player1[] = new Object[6];
		player1[0] = "Virat Kohli";
		player1[1] = 31;
		player1[2] = "Indian Team    ";
		player1[3] = "01/01/1989";
		player1[4] = "M";
		player1[5] = 136.12;

		System.out.println("");
		for (int i = 0; i < player1.length; i++) {
			System.out.print(" " + player1[i]);
		}



		// static Object Array
		Object player3[] = new Object[6];
		player3[0] = "Aaron Finch";
		player3[1] = 33;
		player3[2] = "Australian Team";
		player3[3] = "01/01/1988";
		player3[4] = "M";
		player3[5] = 88.16;

		System.out.println("");
		for (int i = 0; i < player3.length; i++) {
			System.out.print(" " + player3[i]);
		}

		// static Object Array
		Object player4[] = new Object[6];
		player4[0] = "Imam-ul-Haq";
		player4[1] = 24;
		player4[2] = "Pakistan Team  ";
		player4[3] = "01/01/1997";
		player4[4] = "M";
		player4[5] = 53.84;

		System.out.println("");
		for (int i = 0; i < player4.length; i++) {
			System.out.print(" " + player4[i]);
		}

	}

}
