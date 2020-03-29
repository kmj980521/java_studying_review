package Exercise;
import Exercise.Book;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(c->System.out.println(c));
		int total=bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
	}

}

