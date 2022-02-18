
package Except;

public class Array {

	public static void main(String[] args) {
		int []arr=new int[5];
		try
		{
			for(int i=0; i<=5;i++)
			{
				arr[i]=i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("오류처리 되었습니다");
		}
		System.out.println("프로그램 종료");
	}

}

