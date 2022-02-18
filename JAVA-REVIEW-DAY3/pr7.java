package JAVA;
class car
{
	static int num=10001;
	public int carNum;
	car()
	{
		carNum=num;
		num++;
	}
	public int getcarNum()
	{
		return carNum; 
	}
}
class carFactory{
	private static carFactory instance=new carFactory(); //유일하게 생성한 인스턴스
	private carFactory() {} // 생성자
	
	public static carFactory getInstance() {
		if(instance==null)
		{
			instance =new carFactory();
		}
		return instance;
	}
	public car createcar()
	{	
		car car1=new car();
		return car1;
	}
}
public class Example {

	public static void main(String[] args) {
		carFactory factory=carFactory.getInstance();
		car mySonata=factory.createcar();
		car yourSonata=factory.createcar();
		System.out.println(mySonata.getcarNum());
		System.out.println(yourSonata.getcarNum());
	}

}

