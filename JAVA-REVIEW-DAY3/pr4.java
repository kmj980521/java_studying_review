package JAVA;
class subject{
	int score;
	String subjectname;
}
class student{
	private int studentID;
	String studentName;
	
	public int getID()
	{
		return studentID;
	}
	public void setID(int a)
	{
		studentID=a;
	}
	
}
public class LearnJava {
	
	public static void main(String[] args) {
		student a1=new student(); //디폴트 생성자 호출
		//a1.studentID=50; // studentID는 private라서 접근 불가! 데이터보호
		a1.setID(50); //단 public메소를 통해서 접근 가능
	}
}

