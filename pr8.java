
package trycatchresources;



class PassWordException extends IllegalArgumentException
{
	public PassWordException(String message)
	{
		super(message);
	}
}
public class Except {
	private String password;
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) throws PassWordException
	{
		if(password == null){
			throw new PassWordException("비밀번호는 null 일 수 없습니다");
		}
		else if( password.length() < 5){
			throw new PassWordException("비밀번호는 5자 이상 입니다");
		}
		else if (password.matches("[a-zA-Z]+")){
			throw new PassWordException("비밀번호는 숫자를 포함해야 합니다.");
		}
		this.password=password;
	}
	public static void main(String[] args) {
		Except test = new Except();
		String password=null;
		try
		{
			test.setPassword(password);
			System.out.println("오류 없음 1");
		}catch(PassWordException e)
		{
			System.out.println(e.getMessage());
		}
		
		password= "abcd";
		try
		{
			test.setPassword(password);
			System.out.println("오류 없음2");
		}catch(PassWordException e)
		{
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		try
		{
			test.setPassword(password);
			System.out.println("오류 없음3");
		}catch(PassWordException e){
			System.out.println(e.getMessage());
		}
		
		password = "abcde1";
		try
		{
			test.setPassword(password);
			System.out.println("오류 없음4");
		}catch(PassWordException e){
			System.out.println(e.getMessage());
		}
		
	}

}

