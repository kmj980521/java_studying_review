package chapter15;

import java.io.IOException;
import java.io.FileInputStream;
public class ex2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) 
		{
			byte[] bs=new byte[10];
			int i;
			while((i=fis.read(bs))!=-1)
			{
				for(byte b : bs)
				{
					System.out.print((char)b);
				}
				System.out.println(": "+i+"바이트 읽음");
			}
			
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("end");
	}

}

