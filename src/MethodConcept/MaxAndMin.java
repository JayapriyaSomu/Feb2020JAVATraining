package MethodConcept;

public class MaxAndMin {

	public int maxNum(int num1, int num2, int num3) {
		if ((num1 == num2) && (num1 == num3)) {
			System.out.println("All the numbers are equal");
			return 0;
		} else if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is the greatest number :" + " " + num1);
			return num1;
		} else if (num2 > num3) {
			System.out.println("num2 is the greatest number:" + " " + num2);
			return num2;
		} else {
			System.out.println("num3 is the greatest number:" + " " + num3);
			return num3;
		}
	}

	public int minNum(int num1, int num2, int num3) {
		if ((num1 == num2) && (num1 == num3)) {
			System.out.println("All the numbers are equal");
			return 0;
		} else if (num1 < num2 && num1 < num3) {
			System.out.println("num1 is the lowest number :" + " " + num1);
			return num1;
		} else if (num2 < num3) {
			System.out.println("num2 is the lowest number:" + " " + num2);
			return num2;
		} else {
			System.out.println("num3 is the lowest number:" + " " + num3);
			return num3;
		}
	}

	public static void main(String[] args) {
		MaxAndMin obj = new MaxAndMin();
		int max = obj.maxNum(500, 50098, 500678);
		System.out.println("Maximum of 500, 50098, 500678 is :" + max);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		int min = obj.minNum(500, 50098, 500678);
		System.out.println("Minimum of 500, 50098, 500678 is :" + min);

	}

}
