package JAVA;
class Student{
	private String name;
	private int money;
	
	Student(String name, int money)
	{
		this.name=name;
		this.money=money;
	}
	public void takebus(Bus bus)
	{
		bus.take(1000); //버스비 천원 삭감
		this.money-=1000;
	}
	public int taketrain(Train train)
	{
		if(this.money<2000)
		{
			System.out.println("돈이 부족합니다");
			return 0;
		}
		train.take(2000);
		this.money-=2000;
		return 1;
	}
	void showinfo()
	{
		System.out.println("학생의 이름은"+name+"이고, 남은 돈은 "+money+"원 입니다.");
	}
}
class Bus
{
	private String busname;
	public int count1=0;
	public int money1;
	Bus(String busname)
	{
		this.busname=busname;
	}
	public void take(int a) {
		count1++;
		money1+=a;
	}
	public void showinfo()
	{
		System.out.println(busname+"버스의 이용고객 수는 "+count1+"이고 총 수익은"+money1+"원 입니다.");
	}
}
class Train
{
	private String trainname;
	public int count2=0;
	public int money2;
	Train(String trainname)
	{
		this.trainname=trainname;
	}
	public void take(int a) {
		count2++;
		money2+=a;
	}
	public void showinfo()
	{
		System.out.println(trainname+"열차의 이용고객 수는 "+count2+"이고 총 수익은"+money2+"원 입니다.");
	}
}
public class LearnJava {
	
	public static void main(String[] args) {
		Student student1=new Student("제임스",10000);
		Student student2=new Student("존",12000);
		Bus bus1=new Bus("100");
		student1.takebus(bus1);
		student1.showinfo();
		bus1.showinfo();
		Train train1=new Train("분당선");
		student2.taketrain(train1);
		student2.showinfo();
		train1.showinfo();
	}
}

