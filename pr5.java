package JAVA;
class mydate{
	mydate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public boolean isValid()
	{
		if(month==2)
		{
			if(day<1||day>28)
			{
				System.out.println("유효하지않는 날짜입니다.");
				return false;
			}
		}
		if(day<1||day>31)
		{
			System.out.println("유효하지않는 날짜입니다.");
			return false;
		}
		System.out.println("유효합니다.");
		return true;
	}
	
}

public class LearnJava {
	
	public static void main(String[] args) {
		mydate day1=new mydate(29,2,2018);
		day1.isValid();
	}
}

