package innerclass;

public class InnerTest {

	public static void main(String[] args) {
		
		Mynumber max = (x , y)-> (x>=y) ? x : y;
		
		System.out.println(max.getMax(10, 20));
	}

}

