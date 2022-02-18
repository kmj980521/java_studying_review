package JAVA;
class customer{
	protected String name;
	protected String vipvalue;//vip등급
	protected int id;//고유 아이디
	double bonusvalue; //보너스 비율
	int bonus; //보너스
	customer()
	{
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
	vipcustomer()
	{
		vipvalue="DIAMOND";
		bonusvalue=0.2;
		double sale=5.0;
		bonus=10000;
	}
	int buy (int price)
	{
		bonus+=price*bonusvalue; // 보너스 적립
		price=price-(int)(price*sale);
		return price;
	}
	int getagent() {
		return agent;
	}
	void setagent(int a) {
		agent=a;
	}
	public void showinfo() {
		System.out.println(name+"고객님은"+vipvalue+"등급이시며 아이디는"+id+"입니다. 현재 보유하고 계신 보너스는"+bonus+"점입니다."+"고객님의 담당 상담원의 번호는"+agent+"입니다.");
	}
}
public class SSS {
		
	public static void main(String[] args) {
		
			customer a1=new customer();
			a1.setName("지나가는 일반인");
			a1.setID(1002);
			vipcustomer a2=new vipcustomer();
			a2.setID(5005);
			a2.setName("돈 많은 부자");
			a2.setagent(1001);
			a1.buy(4500);
			a2.buy(4500);
			
			a1.showinfo();
			a2.showinfo();
			
		}
		
	}

