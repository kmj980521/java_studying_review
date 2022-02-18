package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
public class ex3 {

	public static void main(String[] args) {
		try(FileOutputStream fis = new FileOutputStream("output.txt",true)) 
		{
			fis.write(65);
			fis.write(66);
			fis.write(67);
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
	}

}

