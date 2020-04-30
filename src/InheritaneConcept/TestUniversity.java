package InheritaneConcept;

public class TestUniversity {

	public static void main(String[] args) {
		//-Create object of child classes and call overriden methods & methods specific to 
		//that child class.
		Stanford s1 = new Stanford();
		s1.regularClasses();
		s1.eveningClasses();
		s1.PHDCourse();
		s1.DualDegreeCourse();
		s1.specialSessions();
		
		MIT m1 = new MIT();
		m1.eveningClasses();
		m1.regularClasses();
		m1.DualDegreeCourse();
		
		NYU n1 = new NYU();
		n1.regularClasses();
		n1.eveningClasses();
		n1.specialSessions();
		
		//Try to create object of parent class and try to call overriden methods
		University u1 = new University();
		u1.regularClasses();
		u1.eveningClasses();
				
		//TOP CASTING - creating child class object but has parent class reference
		University u2 = new Stanford();
		u2.regularClasses();
		u2.eveningClasses();
		//Unable to call Stanford specific methods as it has parent class reference.REFERENCE CHECK.
		u2.classroom();//able to call parent class methods.
		u2.playGround();//parent class methods.
		
		//DOWN CASTING - CREATE PARENT CLASS OBJ AND CHILD CLASS REFERENCE
	/*	MIT m2 = (MIT) new University(); //CLASSCAST EXCEPTION ERROR DURING RUNTIME
		m2.eveningClasses();*/
		
		
		
	}

}
