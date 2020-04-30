package MethodConcept;

public class CircleAreaCirum {
	
	/**
	 * This method calculates Area of circle.
	 * @param radius
	 * @return Area of circle
	 */
	public double calcArea(int radius) {	
		double squareRadius = Math.pow(radius,2);
		double area = 3.14 * squareRadius;
		return area;
	}
	
	/**
	 * This method calculates Circumference of circle
	 * @param radius
	 * @return circumference
	 */
	public double calcCircumference(int radius) {	
		double circum = 2 * 3.14 * radius;
		return circum;
	}
	
	public static void main(String[] args) {
		
		int r = 10;
		
		CircleAreaCirum Area = new CircleAreaCirum();
	
		double AreaOfCircle = Area.calcArea(r);
		System.out.println("Area of Circle : " + AreaOfCircle);
		
		double CircumOfCircle = Area.calcCircumference(r);
		System.out.println("Cirucumference of Circle: " + CircumOfCircle);
		
	}

}
