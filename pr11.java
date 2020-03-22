package ex1.io;
import java.util.ArrayList;
class car{
	public static int num=1000;
	int carNum;
	String carName;
	ArrayList<option> optionlist;
	car(String name)
	{
		carName=name;
		carNum=num;
		num++;
		optionlist=new ArrayList<option>();
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	void showInfo()
	{
		System.out.println(carNum+"의 정보입니다. ");
		for(option i : optionlist)
		{
			System.out.println("이 차의 옵션은"+i.getOp()+"이며 효율은"+i.getValue()+"등급입니다.");
		}
	}
	public void setop(String op, int value)
	{
		option op1=new option();
		op1.setOp(op);
		op1.setValue(value);
		optionlist.add(op1);
	}
	
}
class option
{
	int count=0;
	String op;
	int value;//효율
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
public class LearnJava {
	public static void main(String[] args) {
		car car1=new car("소나타");
		car1.setop("최고급의자",3);
		car1.setop("무소음 자동차", 1);
		
		car1.showInfo();
	
	}
}

