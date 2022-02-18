package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ex {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt"))
		{
			int i;
			while((i=fis.read())!=-1) //글자를 불러오고 글자가 없을 시 -1을 반환해서 반복문 종료
			{
				System.out.print((char)i);// char형식으로 글자 불러옴 . 기본으로 불러오면 1바이트라서 아스키코드값이 출력이 됨.
			}
			System.out.println("FileInputStream사용완료");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try(FileReader fes = new FileReader("input2.txt"))
		{
			int i;
			while((i=fes.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println("FileReader사용완료");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

