package review5;
class player{
	private playerlevel level; // 고유의 레벨
	public player()
	{
		level=new beginner(); //처음엔 초보자
		level.showlevel();
	}
	public playerlevel getLevel()
	{
		return level;
	}
	public void upgrade(playerlevel level)
	{
		this.level=level; //입력받은 레벨로 업그레이드.
		level.showlevel();
	}
	public void play(int count)
	{
		level.doing(count);
	}
}
abstract class playerlevel
{
	abstract void jump();
	abstract void turn();
	abstract void run(); // 추상메소드
	abstract void showlevel();
	final public void doing(int count) //템플릿 메소드
	{
		run();
		for(int i=0;i<count;i++)
		{
		jump();
		}
		turn();
	}
}
class beginner extends playerlevel{
	void jump() {
		System.out.println("낮게 점프합니다.");
	}
	void run()
	{
		System.out.println("천천히 달립니다.");
	}
	void turn() {
		System.out.println("턴을 하지 못합니다.");
	}
	@Override public void showlevel() {
		System.out.println("초보자입니다");
	}
}
class advanced extends playerlevel{
	public void showlevel()
	{
		System.out.println("중급자입니다.");
	}
	void jump() {
		System.out.println("조금 높게 뜁니다");
	}
	void run() {
		System.out.println("빨리 달립니다.");
	}
	@Override void turn() {
		System.out.println("아직도 턴을 하지 못합니다.");
	}
}
class superlevel extends playerlevel{
	public void showlevel()
	{
		System.out.println("상급자입니다.");
	}
	void jump() {
		System.out.println("엄청 높게 뜁니다");
	}
	void run() {
		System.out.println("엄청 빨리 달립니다.");
	}
	@Override void turn() {
		System.out.println("턴을합니다..");
	}
}
public class Abstrac {

	public static void main(String[] args) {
		player a1 = new player(); //beginner로 생성
		a1.play(1);
		advanced a2= new advanced();
		a1.upgrade(a2);
		a1.play(2);
		superlevel a3=new superlevel();
		a1.upgrade(a3); //a3 매개변수로 보내주는데 함수에서는 제일 상위클래스로 받음->모든 레벨로 변환이 가능하기 때문에.
		a1.play(3);
	}

}

