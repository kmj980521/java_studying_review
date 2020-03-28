package TreeSetTest;
import java.util.TreeSet;
import java.util.Iterator;
import Member.member;
class MemberTreeSet
{
	private TreeSet<member> treeSet;
	public MemberTreeSet()
	{
		treeSet=new TreeSet<member>();
	}
	public void addMember(member mem)
	{
		treeSet.add(mem);
	}
	public boolean removeMember(int memberId)
	{
		Iterator<member> ir=treeSet.iterator();
		
		while(ir.hasNext())
		{
			member a1=ir.next();
			int tempId=a1.getMemberId();
			if(tempId==memberId)
			{
				treeSet.remove(a1);
				return true;
			}
		}
		System.out.println(memberId +"가 존재하지 않습니다");
		return false;
	}
	public void showAllMember()
	{
		for(member a : treeSet)
		{
			System.out.println(a);
		}
		System.out.println();
	}
	
}
public class TreeSettest {

	public static void main(String[] args) {
			MemberTreeSet test = new MemberTreeSet();
			
			member park = new member(1003,"박지성");
			member son = new member(1002,"손흥민");
			member gi = new member(1001,"기성용");
			
			test.addMember(park);
			test.addMember(son);
			test.addMember(gi);
			test.showAllMember();
			
		

	}

}

