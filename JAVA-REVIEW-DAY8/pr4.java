package LinkedList;
import java.util.LinkedList;
public class Main {
	
	public static void main(String[] args) {
	LinkedList<String> myList = new LinkedList<String>(); //링크드 리스트 선언
	myList.add("a");
	myList.add("b");
	myList.add("c");
	
	System.out.println(myList);
	
	myList.add(1,"d"); //링크드 리스트의 첫 번째 위치에 d추가  인덱스가 1인 위치.
	System.out.println(myList);
	
	myList.addFirst("0");
	
	System.out.println(myList);
	
	System.out.println(myList.removeFirst());
	System.out.println(myList);

	}

}

