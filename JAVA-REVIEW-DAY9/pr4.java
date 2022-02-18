package innerclass;
class StringConCatImpl implements Mynumber{
	public void makeString(String s1,String s2)
	{
		System.out.println(s1+","+s2);
	}
}
public class InnerTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConCatImpl concat1=new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		Mynumber a1 = (s,y)->System.out.println(s+","+y);
		a1.makeString(s1, s2);
		

	}

}

