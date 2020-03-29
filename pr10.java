package stream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("John");
		sList.add("Park");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		
	}
}

