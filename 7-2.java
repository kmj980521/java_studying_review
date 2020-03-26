package review5;
import java.util.ArrayList;
class Shelf{
	protected ArrayList<String> shelf;
	
	Shelf()
	{
		shelf=new ArrayList<String>(); //ArrayList선언.
	}
	public ArrayList<String> getShelf()
	{
		return shelf; //shelf는 ArrayList형식이니까 
	}
	public int getCount()
	{
		return shelf.size(); //ArrayList 의 size() 
	}
}
class BookShelf extends Shelf implements Queue // Shelf를 상속, Queue의 인터페이스 구현. 
{
	public void enQueue(String title)
	{
		shelf.add(title);
	}
	public String deQueue()
	{
		return shelf.remove(0); //맨 처음 요소를 배열에서 삭제하고 반환.
	}
	public int getSize()
	{
		return getCount();
	}
}
public class Main {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf(); //인터페이스형 BokkShelf 선언
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}

