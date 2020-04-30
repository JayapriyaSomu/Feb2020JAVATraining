package MethodConcept;

public class MultiplyTwoNums {
	
/**This method multiplies two numbers.
 * @param num1
 * @param num2
 * @return 
 */
	
	public int multiply(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}
	
	
	public static void main(String[] args) {
		
		MultiplyTwoNums prod = new MultiplyTwoNums();
		int value = prod.multiply(500,500);
		System.out.println("Product of two numbers : " + value);
	
	}

}
