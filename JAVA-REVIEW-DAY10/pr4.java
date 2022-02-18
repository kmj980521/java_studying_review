package trycatchresources;
class AutoCloseObj implements AutoCloseable
{
	public void close() throws Exception
	{
		System.out.println("리소스가 close()되었습니다.");
	}
}
public class New {

	public static void main(String[] args) {
		try(AutoCloseObj obj=new AutoCloseObj())
		{
			
		}catch(Exception e)
		{
			System.out.println("예외 부분입니다.");
		}
			
	}

}

