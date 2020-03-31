package innerclass;

import java.io.IOException;

public class ex {
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 누르고 엔터를 누르세요");
		int i;
		try
		{
			i=System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

