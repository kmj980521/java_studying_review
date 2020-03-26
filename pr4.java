package A1;

public class Customer implements Buy,Sell{ //인터페이스 다중 선언 //인터페이스는 Buy형이자 Sell형
	@Override public void sell()
	{
		System.out.println("구매하기");
	}
	@Override public void buy()
	{
	System.out.println("판매하기");
	}
	public static void main(String[] args) {
		
		Customer customer =new Customer();
		
		Buy buyer= customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		if(seller instanceof Customer)//seller가 원래 Customer형인지
		{
			Customer customer2=(Customer)seller;
			customer2.buy();
			customer2.sell();
		}
	}

}

