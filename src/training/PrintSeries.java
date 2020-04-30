//6. WAP to print this series on the console using 
//for, while and do-while loops : 
//6 12 18 24 30 36 42 48 54 60

package training;

public class PrintSeries {
	public static void main(String[] args) {

		System.out.println("WHILE LOOP::");
		int i = 5;
		while (i <= 60) {
			if (i % 6 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println("\n#############################");
		System.out.println("DO WHILE LOOP");
		int j=5;
		do{
			if (j % 6 == 0) {
				System.out.print(j + " ");
			}
			j++;
		}while(j<=60);
		
		System.out.println("\n#############################");
		System.out.println("FOR LOOP");
		
		for(int k=5; k <=60; k++){
			if(k%6 == 0) {
				System.out.print(k + " ");
			}
		}
		
		

	}

}
