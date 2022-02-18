package JAVA;
import java.util.Scanner;
public class Learn {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i%2!=0)// 짝수가 아니면
					continue;
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	
}

