
public class StringManipulations {

	public static void main(String[] args) {
		
		String s = "I am learning Java";
	
		//First occurrence of 'a'
		System.out.println("First occurrence of a is : " + s.indexOf('a'));

		//2nd occurrence of 'a'
		
		int secondOccur = s.indexOf('a', s.indexOf('a')+1);
		System.out.println("Second occurrence of a is : " + secondOccur);
		
		//3rd occurrence of 'a'
		
		int thirdOccur = s.indexOf('a', secondOccur+1);
		System.out.println("Third occurrence of a is :  " + thirdOccur);
		
		//4th occurrence of 'a'
		
		System.out.println("Fourth occurrence of a is : " + (s.indexOf('a', thirdOccur + 1)));
		
	}

}
