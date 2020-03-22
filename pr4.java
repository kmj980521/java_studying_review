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
	public void showinfo()
	{
		System.out.println("이 책의 이름은 "+bookname+"입니다");
		System.out.println("이 저자의 이름은"+author+"입니다");
	}
	
}
public class Example{
	public static void main(String[] args) { 
		Book[]array1=new Book[3]; //요소가 3개임. 인덱스가 0~3 총4개가 아님.
		Book[]array2=new Book[3];
		array1[0]=new Book("열혈 자료구조","윤성우");
		array1[1]=new Book("자바만들기","이클립스");
		array1[2]=new Book("Do it!","이지스퍼블리싱");
		
		System.arraycopy(array1,0,array2,0,3);
		for(int i=0;i<array2.length;i++)
		{
			array2[i].showinfo();
		} // array1의 객체 배열이 array2로 복사가 됨.
System.out.println("==========================================================");
		array1[0].bookname="플러터배우기";
		array1[0].author="오준석"; 
		for(int i=0;i<array2.length;i++)
		{
			array2[i].showinfo();
		} //array1을 바꿨는데 array2의 값도 변함. 객체 배열의 요소에 저장된 값은 인스턴스가 아니라, 인스턴스의 주소 값만 복사함. 따라서 서로 가리키는 곳이 같아서 두 배열모두 영향을 받음.
		System.out.println("얕은 복사 예시");
	}
}
