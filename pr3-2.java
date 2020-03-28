package example;

import java.util.ArrayList;
import Member.member;
class memberArrayList
{
	private ArrayList<member> arrayList;
	public memberArrayList(){
		arrayList=new ArrayList<member>();
	}
	public void addMember(member mem)
	{
		arrayList.add(mem);
	}
	public boolean removeMember(int memberId)
	{
		for(int i=0;i<arrayList.size();i++)
		{

		
			if((arrayList.get(i)).getMemberId()==memberId)
			{
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다");
		return false;
	}
	public void showAllMember()
	{
		for(member a : arrayList)
		{
			System.out.println(a);
		}
		System.out.println();
	}
}
public class Example {
	public static void main(String[] args) {
		memberArrayList a = new memberArrayList();
		member lee = new member(1001,"이지원");
		member son = new member(1002,"손민국");
		member park = new member(1003,"박민준");
		member hong = new member(1004,"홍길동");
		
		a.addMember(lee);
		a.addMember(son);
		a.addMember(park);
		a.addMember(hong);
		
		a.showAllMember();
		
		a.removeMember(lee.getMemberId());
		a.showAllMember();
		
	}
}

