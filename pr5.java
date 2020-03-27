package review5;
class MyDate
{
	int day;
	int month;
	public int year;
	
	public MyDate(int day,int month,int year) //생성자
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override public boolean equals(Object obj)
	{
		if(obj instanceof MyDate)
		{
			MyDate a1=(MyDate)obj; //원래 MyDate형인지 확인 후 형변환
			if(this.day==a1.day&&this.month==a1.month&&this.year==a1.year)
			{
				return true;
			}
			else
				return false;
		}
		return false;
	}
}
public class Ob  {

	public static void main(String[] args) {
		MyDate date1=new MyDate(9,18,2004);
		MyDate date2=new MyDate(9,18,2004);
		System.out.println(date1.equals(date2));
		
	}

}

