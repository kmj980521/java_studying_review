package innerclass;
class Outclass
{
	private int num=10;
	private static int sNum=20;
	
	static class Instatic{
		int inNum=100;
		static int sInNum=200;
		void inTest() {
			//num+=10; 외부 클래스의 인스턴스 변수는 사용할 수 없다.
			System.out.println("InStaticClass inNum = "+inNum+"(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 인스턴스 정적 변수 사용");
			System.out.println("Outclass num = "+sNum+"(외부 클래스의 인스턴스 정적 변수 사용");
		}
		static void sTest()
		{
			System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 인스턴스 정적 변수 사용");
			System.out.println("Outclass num = "+sNum+"(외부 클래스의 인스턴스 정적 변수 사용");
		}
	}
	
	}
public class InnerTest {

	public static void main(String[] args) {
		Outclass.Instatic sInClass = new Outclass.Instatic();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		sInClass.sTest();
		
	}

}

