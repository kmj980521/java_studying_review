package Ex;

import java.util.List;
import java.util.ArrayList;
import Ex.TravelCustomer;
public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		List<TravelCustomer> TList = new ArrayList<>();
		TList.add(customerLee);
		TList.add(customerKim);
		TList.add(customerHong);
		
		System.out.println("===고객 명단 출력===");
		TList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total=TList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용은"+total+"입니다");
		
		System.out.println("===20세 이상 고객 출력===");
		TList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}

