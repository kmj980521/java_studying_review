package review5;
class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber,String bookTitle)
	{
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}//생성자
	public String toString() //toString()메소드 재정의 
	{
		return bookNumber+","+ bookTitle;
	}
	
}
public class Ob  {

	public static void main(String[] args) {
		Book book1 =new Book(200,"개미");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		
	}

}

