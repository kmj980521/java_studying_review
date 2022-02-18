package innerclass;

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("이름 : ");
		String name=scan.nextLine();
		System.out.println("직업 : ");
		String job=scan.nextLine();
		
		System.out.println("나이 : ");
		int age=scan.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(age);
	}
}

