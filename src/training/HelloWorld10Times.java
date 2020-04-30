package training;

public class HelloWorld10Times {

	public static void main(String[] args) {
		// 4. Write a program in Java to print "Hello World" ten times using while
		//, for and do-while loop
		
		System.out.println("##########################");
		System.out.println("WHILE LOOP");
       	int i = 1;
		while(i <=10){
			System.out.println(i + " " + "Hello World!");
			i++;
		}
		
		System.out.println("##########################");
		System.out.println("FOR LOOP");
		//for loop
		for(int j = 1; j<=10; j++){
			System.out.println(j + " " + "Hello World!");
		}

		System.out.println("##########################");
		System.out.println("DO WHILE LOOP");
		
		int k = 1;
		do{
			System.out.println(k + " " + "Hello World!");
			k++;
		} while(k<=10);
	}

}
