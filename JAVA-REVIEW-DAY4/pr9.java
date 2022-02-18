package JAVA;

import java.util.ArrayList; //arraylist 클래스 사용하기 위함.
class Book{
	String bookname; //책이름
	String author;//저자
	Book(){} //디폴트 생성자
	Book(String bookname,String author)
	{
		this.bookname=bookname;
		this.author=author;
	}
	public String getbookname()
	{
		return bookname;
	}
	public String getauthor()
	{
		return author;
	}
	public void showinfo()
	{
		System.out.println("이 책의 이름은 "+bookname+"입니다");
		System.out.println("이 저자의 이름은"+author+"입니다");
	}
	public void setbookname(String bookname)
	{
		this.bookname=bookname;
	}
	public void setbookauthor(String author)
	{
		this.author=author;
	}
	
}
public class Example{
	public static void main(String[] args) { 
		ArrayList<Book> library=new ArrayList<Book>(); //ArrayList<자료형>선언
		library.add(new Book("태백산맥","조정래"));
		library.add(new Book("데미안","헤르만 헤세"));
		
		for(int i=0;i<library.size();i++)// library의 요소 수만큼 반복.
		{
			Book book=library.get(i); //i 인덱스의 배열을 복사
			book.showinfo();
		}
		System.out.println();
		
		System.out.println("향상된 for문 사용");
		for(Book lang:library)
		{
			lang.showinfo();
		}
	}
}
