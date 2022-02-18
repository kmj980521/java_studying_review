package review;

public interface Interface {
	public void getnextcall();
	public void sendcall();
	
	static int total(int[]arr)
	{//정적 메소드 구현
		int total=0;
		
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		return total;
	}
}

