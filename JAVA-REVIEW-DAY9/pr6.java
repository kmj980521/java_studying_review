package innerclass;

public class InnerTest {

	public static void main(String[] args) {
		
		Mynumber a1 = s -> System.out.println(s);
		
		a1.showString("Hello Lamda_1");
		
		showMyString(a1);
		
		Mynumber a2 = returnString();
		a2.showString("Hello");

	}
	public static void showMyString(Mynumber a)
	{
		a.showString("Hello Lamda_2");
	}
	public static Mynumber returnString()
	{
		return s-> System.out.println(s+" World");
	}

}

