package InheritaneConcept;

public class Stanford extends University {

	@Override
	public void regularClasses() {
		System.out.println("Stanford - regularClasses ");
	}

	@Override
	public void eveningClasses() {
		System.out.println("Stanford - eveningClasses");
	}
	
	
	public void specialSessions(){
		System.out.println("Stanford - --specialSessions");
	}
	
	public void PHDCourse(){
		System.out.println("Stanford - --PHDCourse");
	}
	
	public void DualDegreeCourse(){
		System.out.println("Stanford - --DualDegreeCourse");
	}

}
