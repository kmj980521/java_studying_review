package chapter15;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
public class ex5 {

	public static void main(String[] args) {
		long millisecond=0;
		try(FileInputStream fis=new FileInputStream("ex.txt");FileOutputStream fos = new FileOutputStream("out1.txt"))
		{
			millisecond = System.currentTimeMillis();
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
			millisecond=System.currentTimeMillis()-millisecond;
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("파일을 복사하는데 "+millisecond+"millisecond 소요되었습니다.");
		millisecond=0;
		try(FileInputStream fis2=new FileInputStream("ex.txt");FileOutputStream fos2 = new FileOutputStream("out2.txt");BufferedInputStream qwe = new BufferedInputStream(fis2);
				BufferedOutputStream asd=new BufferedOutputStream(fos2)){
			millisecond=System.currentTimeMillis();
			int j;
			while((j=qwe.read())!=-1)
			{
				asd.write(j);
			}
			millisecond=System.currentTimeMillis()-millisecond;
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Buffered를 사용해 파일을 복사하는데 "+millisecond+"millisecond 소요되었습니다.");
	}

}

