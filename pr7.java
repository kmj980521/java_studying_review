package hashSet;
import Member.member;
import java.util.HashSet;
import java.util.Iterator; //순사척인 접근.
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> ex1 = new HashSet<String>();
		ex1.add(new String("가나다"));
		ex1.add(new String("나다가"));
		ex1.add(new String("다나가"));
		ex1.add(new String("가나다"));
		System.out.println(ex1);

	}

}

