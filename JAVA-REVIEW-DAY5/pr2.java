ipackage review5;
abstract class car
{
	public abstract void drive();
	public abstract void stop(); //가상 메소드
	
	public void turnon()
	{
		System.out.println("자동차 시동을 켭니다.");
	}
	public void turnoff()
	{
		System.out.println("자동차 시동을 끕니다.");
	}
	final void run() //템플릿 메서드 , 일종의 시나리오를 작성함. 하위클래스에서 변경 x
	{
		turnon();
		drive();
		stop();
		turnoff();
	}
}
class aicar extends car
{
	public void drive() {
		System.out.println("AI자동차가 직접 운전합니다.");
	}
	public void stop()
	{
		System.out.println("AI자동차가 스스로 멈춥니다.");
	}
}
class normalcar extends car
{
	public void drive()
	{
		System.out.println("사용자가 직접 운전합니다.");
		
	}
	public void stop()
	{
		System.out.println("사용자가 브레이크를 밟아 멈춥니다.");
	}
}
public class Abstrac {

	public static void main(String[] args) {
		car mycar = new aicar();
		car yourcar = new normalcar();
		mycar.run();
		yourcar.run();
	}

}

