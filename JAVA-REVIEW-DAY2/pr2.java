package JAVA;

public class Learn {
	public static void main(String[] args) {
		int Score=100;
		
		int Score2=Score++; //후위 연산자 , 100을 대입한 후에 Score +=1; 
		System.out.println(Score2);
		System.out.println(Score);
		
		int min=10;
		int min2=--min;
		System.out.println(min2);
	}
	
}

