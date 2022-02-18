package chapter15;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class ex2 {

	public static void main(String[] args) {
		
		FileOutputStream a1;
		try {
			a1 = new FileOutputStream("ex1.txt",true);
			a1.write(65);//'A'
			a1.write(66);//'B'
			a1.write(67);//'C'
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try(FileWriter a2=new FileWriter("writer.txt",true)) {
			a2.write('A');
			char buf[]= {'b','c','d','e'};
			a2.write("안녕하세요");
			a2.write(buf);
			a2.write("65");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Writer출력이 완료되었습니다.");

		
	}

}

