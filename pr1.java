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

	}

}

