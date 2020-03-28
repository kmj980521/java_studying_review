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
	public void insertMember(member a1,int index)// 특정 위치에 회원 추가하기
	{
		ArrayList<member> temp = new ArrayList<member>();
		
		for(int i=index;i<arrayList.size();)
		{
			member ex = arrayList.get(i); //뽑아오고 , 
			temp.add(ex); //temp 배열에 넣고
			arrayList.remove(i); // 그 배열에서 삭제하고, 
	
		}
		arrayList.add(a1); //a1 멤버를 넣어주고, 
		for(int i=0;i<temp.size();i++)
		{
			member ex2=temp.get(i); //빼놨던 배열에서 하나씩 가져와서
			arrayList.add(ex2); //값을 넣어준다
		}
	}
}
public class Example {
	public static void main(String[] args) {
		memberArrayList a = new memberArrayList();
		member lee = new member(1001,"이지원");
		member son = new member(1002,"손민국");
		member park = new member(1003,"박민준");
		member hong = new member(1004,"홍길동");
		member kang=new member(1005,"강식당");
		
		a.addMember(lee);
		a.addMember(son);
		a.addMember(park);
		a.addMember(hong);
		
		a.showAllMember();
		
	
		
		a.insertMember(kang, 2);
		a.showAllMember();
		
	}
}

