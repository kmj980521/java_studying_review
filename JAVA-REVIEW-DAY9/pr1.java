package innerclass;
class Outclass
{
	int num1=10;
	int num2=100;
	private inClass inclass;
	Outclass()
	{
		inclass=new inClass(); //클래스 내부 클래스 생성
	}
	class inClass
	{
		int num3=1000;
		//static int sInnum=200; //인스턴스 내부 클래스에 정적 변수 선언 불가능.
		void inTest()
		{
			System.out.println("Outclass num= "+num1+"(외부 클래스의 인스턴스 변수)");
			System.out.println("Inclass num= "+num3+"(내부 클래스의 인스턴스 변수");
		}
	}
	public void usingClass()
	{
		inclass.inTest();
	}
}
public class InnerTest {

	public static void main(String[] args) {
		Outclass a1 = new Outclass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		a1.usingClass();
	}

}

