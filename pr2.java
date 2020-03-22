package JAVA;



class student{
	public int studentID;
	private String name;
	public static int num=1000;
	
	student(String name)
	{
		
		this.name=name;
		studentID=num;
		num++;
	}
	
	public void showStudnetInfo()
	{
		System.out.println("학생의 ID는 "+studentID+"이고 이름은 "+name+"입니다.");
	}
}
public class SSS {

	public static void main(String[] args) {
		student[] arr1=new student[3];
		arr1[0]=new student("제임스");
		arr1[1]=new student("존");
		arr1[2]=new student("케인");
		arr1[0].showStudnetInfo();
		arr1[1].showStudnetInfo();
		arr1[2].showStudnetInfo();
	}

}

