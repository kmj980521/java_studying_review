package JAVA;
import java.util.Scanner;
public class Learn {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("몇층을 출력할까요? : "); int a=scan.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=0;j<=a-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

