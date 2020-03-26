package review5;
import java.io.IOException;

class Quicksort implements Sort
{
	public void ascedning(int a[])
	{
		System.out.println("QuickSort ascending");
	}
	public void descending(int a[])
	{
		System.out.println("QuickSort descending");
	}
	public void description()
	{
		System.out.println("QuickSort입니다.");
	}
}
class Heapsort implements Sort
{
	public void ascedning(int a[])
	{
		System.out.println("HeapSort ascending");
	}
	public void descending(int a[])
	{
		System.out.println("HeapSort descending");
	}
	public void description()
	{
		System.out.println("HeapSort입니다.");
	}
}
class Bubblesort implements Sort
{
	public void ascedning(int a[])
	{
		System.out.println("BubbleSort ascending");
	}
	public void descending(int a[])
	{
		System.out.println("BubbleSort descending");
	}
	public void description()
	{
		System.out.println("BubbleSort입니다.");
	}
}
public class Main2 {

	public static void main(String[] args) throws IOException { 
		System.out.println("정렬 방식을 선택하세요 : ");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");
		
		int ch=System.in.read();
		Sort sort=null;
		
		if(ch=='B'||ch=='b')
		{
			sort=new Bubblesort();
		}
		else if(ch=='h'||ch=='H')
		{
			sort=new Heapsort();
		}
		else if(ch=='Q'||ch=='q')
		{
			sort=new Quicksort();
		}
		else
		{
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		int[]arr=new int[10];
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();

	}

}

