package JAVA;

public class LearnJava {
	int age;
	String name;
	boolean isMarried;
	int child;
	public void set(int a,String b,int c,int d)
	{
		age=a;
		name=b;
		if(c==1)
			isMarried=true;
		else
			isMarried=false;
		child=d;
	}
	public int showage()
	{
		return age;
	}
	public String showname()
	{
		return name;
	}
	public boolean showMarried()
	{
		return isMarried;
	}
	public int showchild()
	{
		return child;
	}
	public static void main(String[] args) {
		LearnJava man=new LearnJava();
		man.set(40, "홍길동", 1, 4); // 세 번째 매개변수가 1이면 결혼을 한 상태.
		System.out.println(man.showage());
		System.out.println(man.showname());
		System.out.println(man.showMarried());
		System.out.println(man.showchild());
		
	}
}

