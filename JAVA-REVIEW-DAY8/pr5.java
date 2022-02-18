package LinkedList;
import java.util.ArrayList;

class Stack
{
	private ArrayList<String> myStack=new ArrayList<String>();
	
	public void push(String data)
	{
	myStack.add(data);
	}
	public String pop()
	{
		int len=myStack.size();
		if(myStack.size()==0)
		{
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return(myStack.remove(len-1));
	}
}
public class Main {
	
	public static void main(String[] args) {
		
		Stack mystack = new Stack();
		mystack.push("A");
		mystack.push("B");
		mystack.push("C");
		
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
	

	}

}

