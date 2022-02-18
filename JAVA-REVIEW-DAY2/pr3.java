package JAVA;

public class Learn {
	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		boolean value =((num1=num1+10)<10)&&((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //첫 항이 거짓이므로 뒤의 항은 실행되지않음. 고로 i의 값 변경 x
		
		value=((num1=num1+10)>10)||((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);//첫 항이 참이므로 뒤의 항은 실행되지않음. 고로 i의 값 변경 x
	}
	
}

