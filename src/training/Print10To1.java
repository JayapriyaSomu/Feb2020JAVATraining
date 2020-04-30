
package training;

public class Print10To1 {

	public static void main(String[] args) {
		
		//For loop 
		System.out.println("****************************");
		System.out.println("FOR LOOP");
		for( int i=10; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("****************************");
		System.out.println("WHILE LOOP");
		
		//While loop
		int j = 10;
		while(j >=1){
			System.out.println(j);
			j--;
		}
		
		System.out.println("****************************");
		System.out.println("DO WHILE LOOP");
		//DO - WHILE LOOP
		int k = 10;
		do{
			System.out.println(k);
			k--;
		}
		while (k >=1);
		
		
		
	}

}
