package innerclass;

public class InnerTest {

	public static void main(String[] args) {
		
		Mynumber a1 = (x, y) ->  (x+y);
		System.out.println(a1.add(100, 200));
		addNum(a1);
		Mynumber a2 = returning();
		System.out.println(a2.add(200, 400));
	}
	public static void addNum(Mynumber a1)
	{
		System.out.println("매개변수로 전달하는 람다식");
		a1.add(100, 400);
	}
	public static Mynumber returning()
	{
		System.out.println("변수 명으로 전달하는 람다식");
		return (x, y) -> (x+y);
	}
	
}

