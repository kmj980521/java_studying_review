package trycatchresources;
class IDFormatException extends Exception
{
	public IDFormatException(String message)
	{
		super(message);
	}
}

public class Except {
	private String userID;
	public String getUserID()
	{
		return userID;
	}
	public void setID(String userID) throws IDFormatException
	{
		if(userID==null)
		{
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length()<8||userID.length()>20)
		{
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.userID=userID;
	}//생성자
	public static void main(String[] args) {
		Except test=new Except();
		String userID=null;
		try
		{
			test.setID(userID);
		}catch(IDFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		userID="1234567";
		try
		{
			test.setID(userID);
		}catch(IDFormatException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

