package interfaceConcept;

public class University {

	public static void main(String[] args) {
		
		College c1 = new College();
		c1.biology();
		c1.mathematics("commerce");
		c1.science("medical");
		c1.economics();
		
		System.out.println("***********************");
	//	Medical m = new Medical(); CANNOT CREATE OBJECT OF INTERACES
		
		//TOPCASTING
		Medical m = new College();
		m.biology();
		m.science("medical");
		m.mathematics("medical");
		
		System.out.println("***********************");
		
		NonMedical nm = new College();
		nm.science("nonmedical");
		nm.mathematics("nonmedical");
		System.out.println("***********************");
		
		Commerce c = new College();
		c.economics();
		c.mathematics("commerce");
		
		System.out.println("***********************");
//Accessing static method in interface using Classname.
		Commerce.tax();
		
		
		//DOWNCASTING - CANNOT CREATE OBJECT OF INTERFACES
		/*College col = new Commerce();*/
		
		
	}

}
