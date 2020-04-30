package training;

public class LoopMulipleOf7 {

	public static void main(String[] args) {

		//5. Write a program in Java to print 1 to 10 using while 
		//loop but quit if multiple of 7 is encountered
		
		int i = 1;
		while(i<=10) {
			
			System.out.println(i);
			
			if(i % 7 == 0){
				System.out.println(i + " " + "is a multiple of 7.");
				break;
			}
			
			i++;
			
		}
		

	}

}
