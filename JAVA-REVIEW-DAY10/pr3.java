package Except;

public class Example {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		try
		{
			for(int i=0;i<=5;i++)
			{
				arr[i]=i;
				System.out.println(i);
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("오류를 찾았습니다");
			return;
		}
		finally 
		{
			System.out.println("여기도 실행됩니다.");
		}
	}

}

