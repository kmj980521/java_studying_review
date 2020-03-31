package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class ex3 {

	public static void main(String[] args) {
		try(FileOutputStream fis = new FileOutputStream("output2.txt",true)) 
		{
			byte[] bs = new byte[26];
			byte data=65;//'A'의 아스키 값
			for(int i=0; i<bs.length;i++)
			{
				bs[i]=data;
				data++;
			}
			fis.write(bs,2,15);// bs배열의 인덱스가 2인 위치부터 15개를 출력해라
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
		
		FileInputStream fis2=null;
		try
		{
			byte[]bs2=new byte[10];
			int i;
			fis2 = new FileInputStream("input.txt");
			while((i=fis2.read(bs2))!=-1)
			{
			
				for(int k=0;k<i;k++)
				{
					System.out.print((char)bs2[k]);
				}
				System.out.println(" :"+i+"바이트 읽음");
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally 
		{
			try
			{
				fis2.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("입력이 완료되었습니다.");
	}

}

