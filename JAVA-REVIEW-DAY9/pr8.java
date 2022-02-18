package innerclass;

public class InnerTest {

	public static void main(String[] args) {
		
		Mynumber a1 = s-> System.out.println(s);
		a1.showString("Hello World 1");
		showWorld(a1);
		Mynumber a2 = returning();
		a2.showString("Hello");
	}
	public static void showWorld(Mynumber a1)
	{
		a1.showString("Hello World 2");
	}
	public static Mynumber returning()
	{
		return s->System.out.println(s+" World 3");
	}
	
}

