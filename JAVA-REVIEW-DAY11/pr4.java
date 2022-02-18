package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ex {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt"))
		{
			int i;
			while((i=fis.read())!=-1) //글자를 불러오고 글자가 없을 시 -1을 반환해서 반복문 종료
			{
				System.out.println((char)i);// char형식으로 글자 불러옴 . 기본으로 불러오면 1바이트라서 아스키코드값이 출력이 됨.
			}
			System.out.println("end");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

