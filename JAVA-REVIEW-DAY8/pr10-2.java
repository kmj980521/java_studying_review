package Q5;
import java.util.HashSet;
public class Studenttest {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		Student a1=new Student("100","홍길동");
		Student a2=new Student("200","가나다");
		Student a3=new Student("300","ABC");
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
		
		set.add(new Student("300","123"));
		
		System.out.println(set);
	}

}

