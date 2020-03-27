package review5;

public class Main {

	public static void main(String[] args) {
		String a1=new String("abc");
		String a2=new String("abc");
		
		String a3="abc";
		String a4="abc";
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		System.out.println(a3==a4);
		System.out.println(a3.equals(a4));
		
	}

}

