package JAVA;
import java.util.Scanner;
public class Learn {
	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		Scanner scan=new Scanner(System.in);
		String operator=scan.next();
		
		switch(operator)
		{
		case "+" : System.out.println(num1+num2); break;
		case "-" : System.out.println(num1-num2);break;
		case "*" : System.out.println(num1*num2);break;
		case "/" : System.out.println(num1/num2);break;
		}
	}
	
}

