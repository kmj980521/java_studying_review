package JAVA;

import java.util.ArrayList;
class customer{
	protected String name;
	protected String vipvalue;//vip등급
	protected int id;//고유 아이디
	double bonusvalue; //보너스 비율
	int bonus; //보너스
	customer(String name,int id)
	{
		this.name=name;
		this.id=id;
		vipvalue="SILVER";
		bonusvalue=0.01;
		bonus=0;
	}
	
	int buy (int price)
	{
		bonus+=(int)(price*bonusvalue); // 보너스 적립
		return price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public void showinfo()
	{
	System.out.println(name+"고객님은"+vipvalue+"등급이시며 아이디는"+id+"입니다. 현재 보유하고 계신 보너스는"+bonus+"점입니다.");
	}
}

class vipcustomer extends customer{
	double sale;//할인율
	private int agent;//담당 상담원 번호 
	vipcustomer(String name,int id,int agent)
	{
		super(name,id); //상위 클래스 생성자 호출 
		vipvalue="DIAMOND";
		bonusvalue=0.2;
		sale=0.2;
		bonus=10000;
		this.agent=agent;
	}
	@Override int buy (int price)
	{
		bonus+=price*bonusvalue; // 보너스 적립
		return price-(int)(price*sale);
	}
	int getagent() {
		return agent;
	}
	public void showinfo() {
		System.out.println(name+"고객님은"+vipvalue+"등급이시며 아이디는"+id+"입니다. 현재 보유하고 계신 보너스는"+bonus+"점입니다."+"고객님의 담당 상담원의 번호는"+agent+"입니다.");
	}
}
class middlecustomer extends customer
{
	double sale;
	middlecustomer(String name,int id)
	{
		super(name,id); //상위 클래스 생성자 호출
		vipvalue="GOLD";
		bonusvalue=0.1; // 0.1프로 적립
		sale=0.1; //10프로 할인
		bonus=5000;
	}
	@Override public int buy (int price)
	{
		bonus+=price*bonusvalue; // 보너스 적립
		return price-(int)(price*sale);
	}
	public void showinfo() {
		System.out.println(name+"고객님은"+vipvalue+"등급이시며 아이디는"+id+"입니다. 현재 보유하고 계신 보너스는"+bonus+"점입니다. middle 호출");
	}
}
public class SSS {
		
	public static void main(String[] args) {
		
		ArrayList<customer> list =new ArrayList<customer>();
		customer b1=new customer("이순신",1010);
		customer b2=new customer("장보고",1020);
		customer b3=new middlecustomer("자바",1030);
		customer b4=new middlecustomer("플러터",1040);
		customer b5=new vipcustomer("컴퓨터",1050,112);
		customer b6=new vipcustomer("노트북", 1060,119);

		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		System.out.println("고객 정보 출력==============");
		for(customer custom : list)
		{
			custom.showinfo();
		}
		for(customer custom : list)
		{
			int cost=custom.buy(50000); //5만원짜리 물건 구매
			System.out.println(custom.getName()+"님은 등급별 혜택에 따라 "+ cost+"원으로 물건을 구매하셨습니다.");
			System.out.println(custom.getName()+"님의 총 적립 보너스 점수는"+ custom.bonus+"점 입니다");
		}
		}
		
	}

