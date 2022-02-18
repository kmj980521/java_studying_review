package review5;
abstract class a1 implements Calc{ //인터페이스를 완성하거나 하위 클래스에서 구현하려면 abstract선언
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int minus(int num1,int num2)
	{
		return num1-num2;
	}
	
	// div와 mul은 추상클래스로 a1도 추상클래스가 되어야함 
}
class a2 extends a1{
	public int div(int num1,int num2)
	{
		if(num2==0)
			return Calc.error;
		return num1/num2;
	}
	public int mul(int num1,int num2)
	{
		return num1*num2;
	}
	public void showinfo()
	{
		System.out.println("Calc 인터페이스를 구현했습니다");
	}
}
public class Interface {

	public static void main(String[] args) {
		int nu1=10;
		int nu2=50;
		
		a2 calc = new a2();
		
		Calc next = new a2(); //상위 클래스의 형변환. 
		System.out.println(calc.add(nu1, nu2));
		System.out.println(calc.div(nu1, nu2));
		System.out.println(calc.mul(nu1, nu2));
		System.out.println(calc.minus(nu1, nu2));
		System.out.println("Calc 형식의 변수 선언 ");
		System.out.println(next.add(nu1, nu2));
		System.out.println(next.div(nu1, nu2));
		System.out.println(next.mul(nu1, nu2));
		System.out.println(next.minus(nu1, nu2));
	}

}

