package training;

public class ArrayConcept {

	public static void main(String[] args) {

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 22;
		i[2] = 56;
		i[3] = 100;
		//i[4] = 500;
		
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}
		
		String str[] = new String[3];
		
		str[0] = "Jaya";
		str[1] = "Priya";
		str[2] = "Raj";
		
		System.out.println("Length:" + str.length);
		for(int n=0; n <= str.length-1; n++){
			System.out.println(str[n]);
		}

	}

}
