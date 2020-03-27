package review5;
class Book{
	int bookNumber;
	String bootTitle;
	
	Book(int bookNumber,String bookTitle)
	{
		this.bookNumber=bookNumber;
		this.bootTitle=bookTitle;
	}//생성자
	
}
public class Ob  {

	public static void main(String[] args) {
		Book book1 =new Book(200,"개미");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		String str = new String ("test");
		System.out.println(str);
		Integer i1=new Integer(100);
		System.out.println(i1);
	}

}

