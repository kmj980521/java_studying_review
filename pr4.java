ipackage review5;
public class Ob  {

	public static void main(String[] args) {
		String str1=new String ("abc");
		String str2=new String("abc");
		
		Integer a1=new Integer (100);
		Integer a2=new Integer (100);
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(a1==a2);
		System.out.println(a2.equals(a2));
		
	}

}

