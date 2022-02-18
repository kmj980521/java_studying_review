package JAVA;
import java.util.Scanner;
public class Learn {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요(해당 숫자*2-1만큼의 높이인 마름모가 출력됩니다) : ");int a=scan.nextInt();
		
		for(int i=1;i<a;i++) //위 피라미드 출력
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
		for(int i=1;i<2*a;i++) //가운데 줄 출력
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=a;i>1;i--)
		{
			for(int j=0;j<a-i+1 ;j++)
			{
				System.out.print(" ");
			}
			for(int k=2*i-3;k>0 ;k-- )
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
}

