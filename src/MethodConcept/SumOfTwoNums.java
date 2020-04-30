
package MethodConcept;

public class SumOfTwoNums {

	/**
	 * This method is called to add two numbers.
	 * @param num1 
	 * @param num2
	 * @return
	 */
	public int addNum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	
	public static void main(String[] args) {
		
		SumOfTwoNums add = new SumOfTwoNums();
		int total = add.addNum(500, 5005);
		System.out.println(total);
	
	}

}
