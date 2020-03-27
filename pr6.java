package review5;

public class Main2 {

	public static void main(String[] args) { 
		
		String str1=new String ("abc");
		String str2=new String ("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer a1=new Integer(100);
		Integer a2=new Integer(100);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}

