package JAVA;
import java.util.ArrayList;
abstract class car
{
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnoff();
	public final void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
}
class sonata extends car{
	public void start()
	{
		System.out.println("소나타 시동을 켭니다.");
	}
	public void drive()
	{
		System.out.println("소나타 달립니다.");
	}
	public void stop()
	{
		System.out.println("소나타를 정지합니다.");
	}
	public void turnoff()
	{
		System.out.println("소나타 시동을 끕니다.");
	}
}
class avante extends car{
	public void start()
	{
		System.out.println("아반테 시동을 켭니다.");
	}
	public void drive()
	{
		System.out.println("아반테 달립니다.");
	}
	public void stop()
	{
		System.out.println("아반테를 정지합니다.");
	}
	public void turnoff()
	{
		System.out.println("아반테 시동을 끕니다.");
	}
}
class grandeur extends car
{
	public void start()
	{
		System.out.println("그렌져 시동을 켭니다.");
	}
	public void drive()
	{
		System.out.println("그렌져 달립니다.");
	}
	public void stop()
	{
		System.out.println("그렌져 정지합니다.");
	}
	public void turnoff()
	{
		System.out.println("그렌져 시동을 끕니다.");
	}
}
class genesis extends car
{
	public void start()
	{
		System.out.println("제네시스 시동을 켭니다.");
	}
	public void drive()
	{
		System.out.println("제네시스 달립니다.");
	}
	public void stop()
	{
		System.out.println("제네시스  정지합니다.");
	}
	public void turnoff()
	{
		System.out.println("제네시스 시동을 끕니다.");
	}
}
public class Instancof {

	public static void main(String[] args) { 
		ArrayList<car> list=new ArrayList<car>();
		list.add(new sonata());
		list.add(new avante());
		list.add(new grandeur());
		list.add(new genesis());
		
		for(car i : list)
			i.run();
	}
	
}

