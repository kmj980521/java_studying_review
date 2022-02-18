package JAVA;

import java.util.ArrayList; //arraylist 클래스 사용하기 위함.
class student{
	public static int num=1000; //id의 기본값
	String name;
	int studentNum;
	student(String name) //생성자
	{
		studentNum=num;
		num++;
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	int getNum()
	{
		return studentNum;
	}
	void showinfo()
	{
		System.out.println("이 학생의 ID는 "+studentNum+"이고 이름은"+name+"입니다" );
	}
	
}
public class Example{
	public static void main(String[] args) { 
		ArrayList<student> list1=new ArrayList<student>();
		list1.add(new student ("제임스"));
		list1.add(new student("존"));
		list1.add(new student("케인"));
		
		for(int i=0;i<list1.size();i++)
		{
			student a1=list1.get(i);
			a1.showinfo();
		}
		
		System.out.println("향상된 for 사용");
		for(student lang : list1)
		{
			lang.showinfo();
		}
	}
}
