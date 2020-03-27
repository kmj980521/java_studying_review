package review5;

public class Main {

	public static void main(String[] args) {
		String a1=new String("java");
		String a2=new String("Script");
		System.out.println(a1);
		System.out.println("처음 문자열 주소의 값 : "+System.identityHashCode(a1));
		
		a1=a1.concat(a2);
		System.out.println(a1);
		System.out.println("연결된 문자열 주소 값 : "+System.identityHashCode(a1));
		
	}

}

