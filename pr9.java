package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
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
	}

}

