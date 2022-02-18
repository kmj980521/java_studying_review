package JAVA;
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
		Book[]array1=new Book[3]; //요소가 3개임. 인덱스가 0~3 총4개가 아님.
		Book[]array2=new Book[3];
		array1[0]=new Book("열혈 자료구조","윤성우");
		array1[1]=new Book("자바만들기","이클립스");
		array1[2]=new Book("Do it!","이지스퍼블리싱");
		array2[0]=new Book();
		array2[1]=new Book();
		array2[2]=new Book();
	
		for(int i=0;i<array2.length;i++)
		{
			array2[i].setbookname(array1[i].getbookname());
			array2[i].setbookauthor(array1[i].getauthor());
		}
		array1[0].bookname="플러터배우기";
		array1[0].author="오준석"; 
		for(int i=0;i<array2.length;i++)
		{
			array2[i].showinfo();
		}  //array1의 값을 바꿔도 array2의 값은 바뀌지않음. 인스턴스를 따로 생성한 깊은 복사
	}
}
