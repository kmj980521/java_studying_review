package LinkedList;
import java.util.ArrayList;

class Queue
{
	private ArrayList<String> myQueue=new ArrayList<String>();
	
	public void enQueue(String data)
	{
		myQueue.add(data);
	}
	public String deQueue()
	{
		int len=myQueue.size();
		if(myQueue.size()==0)
		{
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return(myQueue.remove(0));
	}
}
public class Main {
	
	public static void main(String[] args) {
		
		Queue myQueue = new Queue();
		myQueue.enQueue("A");
		myQueue.enQueue("B");
		myQueue.enQueue("C");
		
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());

	}

}

