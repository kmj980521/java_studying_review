package innerclass;

import java.io.IOException;

public class ex {
	public static void main(String[] args) {
		System.out.println("알파벳 여러를 누르고 엔터를 누르세요");
		int i;
		try
		{
			while((i=System.in.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

