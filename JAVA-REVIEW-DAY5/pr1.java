package review5;
abstract class computer
{
	abstract void print();
	abstract void typing();//추상 클래스의 추상 메소드
	public void turnon()
	{
		System.out.println("전원을 켭니다");
	}
	public void turnoff()
	{
		System.out.println("전원을 끕니다");
	}
}

class desktop extends computer{
	void print()
	{
		System.out.println("데스크톱으로 작업을 시작합니다.");
	}
	void typing()
	{
		System.out.println("데스크톱으로 타이핑을 시작합니다");
	}
}

abstract class notebook extends computer{ // 추상메소드 print()를 상속받았기때문에 추상클래스가 되어야함
	public void typing()
	{
		System.out.println("노트북으로 타이핑을 시작합니다");
	}
	
}
class mynotebook extends notebook
{
	public void print()
	{
		System.out.println("내 노트북으로 작업을 시작합니다");
	}
}
public class Abstrac {

	public static void main(String[] args) {
		
			//computer a1=new computer(); //추상클래스를 인스턴스로 생성할 수 없음.
			computer a2=new desktop();
			a2.print();
			a2.typing();
			//computer a3=new notebook();//추상클래스를 인스턴스로 생성할 수 없음.
			computer a4=new mynotebook(); 
			a4.typing();
			a4.print();
	}

}

