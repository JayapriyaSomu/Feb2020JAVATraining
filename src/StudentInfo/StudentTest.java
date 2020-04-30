package StudentInfo;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stud = new Student();
		
		stud.setStdId(2039688);
		stud.setStdName("Jayapriya");
		stud.setStdRollNo(121);
		
		int studID = stud.getStdId();
		String studName = stud.getStdName();
		int studRollNum = stud.getStdRollNo();
		
		System.out.println("Student ID : " + studID);
		System.out.println("Student Name : " + studName);
		System.out.println("Student Roll Num : " + studRollNum);
		
		
		
	}

}
