package training;

public class GreatestOf4Nums {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = -3;
		int num3 = -1;
		int num4 = -4;

		if (num1>num2 && num1>num3 && num1>num4) {
			System.out.println("num1 is the greatest number :" + " " + num1);
		}
		else if(num2>num3 && num2>num4){
			System.out.println("num2 is the greatest number:" + " " + num2);
		}
		else if(num3>num4) {
			System.out.println("num3 is the greatest number:" + " " + num3);
		}
		else{
			System.out.println("num4 is the greatest number:" + " " + num4);
		}
	}
}
