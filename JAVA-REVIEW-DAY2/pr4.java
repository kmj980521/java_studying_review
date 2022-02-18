package JAVA;

public class Learn {
	public static void main(String[] args) {
		int num = 0B00000101; // 5를 8비트 2진수로 나타냄 
		
		System.out.println(num<<2);; //왼쪽으로 2비트 이동 00010100 (20)
		System.out.println(num>>2);//오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num>>>2); // 오른쪽으로 2비트 이동,부호비트와 상관없이 0 , 00000001(1)
		
		System.out.println(num); // num의 값은 변경이 없으므로 그대로 값 출력
		
		num=num<<2; //왼쪽으로 2비트 이동
		System.out.println(num);
	}
	
}

