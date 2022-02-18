package hashSet;
import Member.member;
import java.util.HashSet;
import java.util.Iterator; //순사척인 접근.

class myHash{
	private HashSet<member> hashSet;
	
	public myHash()
	{
		hashSet=new HashSet<member>();
	}
	public void addMember(member a1)
	{
		hashSet.add(a1);
	}
	public boolean removeMember(int memberID)
	{
		Iterator<member> ir=hashSet.iterator(); //hashSet을 순차적으로 탐색.
		
		while(ir.hasNext())//다음 데이터가 있을 경우 반복
		{
			member a2=ir.next(); //다음 데이터 참조
			int tempId=a2.getMemberId();
			if(tempId==memberID)
			{
				hashSet.remove(a2); // a2의 memberID를 받고, 같은 아이디인 경우 삭제
				return true;
			}
		}
		System.out.println(memberID+"가 존재하지않습니다.");
		return false;
	}
	public void showAllMember()
	{
		for(member a : hashSet) {
			System.out.println(a);
		}
		System.out.println();
	}
}
public class HashSetTest {

	public static void main(String[] args) {
			myHash memberHash = new myHash();
			member memberLee = new member(1001,"이지원");
			member memberSon = new member(1002,"손흥민");
			member memberPark= new member(1003,"박지성");
			
			memberHash.addMember(memberLee);
			memberHash.addMember(memberSon);
			memberHash.addMember(memberPark);
			
			memberHash.showAllMember();
			
			member newmember = new member(1003,"홍길동");
			memberHash.addMember(newmember);
			
			memberHash.showAllMember();

	}

}

