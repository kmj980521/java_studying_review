package chapter15;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
public class ex4 {

	public static void main(String[] args) {
		try(OutputStreamWriter s1 = new OutputStreamWriter(new FileOutputStream("out.txt",true)))
		{
			s1.write("안녕하세요");
			s1.write("a");
			s1.write("OutputStreamWriter사용해보기");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("OutputStreamWriter 출력 완료");

	}

}

