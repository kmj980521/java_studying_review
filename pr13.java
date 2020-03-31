package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.InputStreamReader;
public class ex {
	public static void main(String[] args) {
		
		try(InputStreamReader isr=new InputStreamReader(new FileInputStream("input2.txt")))
		{
			int i;
			while((i=isr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("InputStreamReader완료");
	}
}

