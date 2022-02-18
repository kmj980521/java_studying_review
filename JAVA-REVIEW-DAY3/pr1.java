ipackage JAVA;

public class LearnJava {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void setStudent(int a, String b,int c,String d)
	{
		studentID=a;
		studentName=b;
		grade=c;
		address=d;
	}
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		LearnJava first_student = new LearnJava();
		first_student.setStudent(101,"자바", 100 , "수원");
		System.out.println(first_student.getStudentName());
	}
}

