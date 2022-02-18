package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
public class ex3 {

	public static void main(String[] args) {
		try(FileOutputStream fis = new FileOutputStream("output.txt",true)) 
		{
			byte[] bs = new byte[26];
			byte data=65;//'A'의 아스키 값
			for(int i=0; i<bs.length;i++)
			{
				bs[i]=data;
				data++;
			}
			fis.write(bs);// 배열을 한꺼번에 출력
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
	}

}

