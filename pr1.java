package review;

import java.io.IOException;



class round implements Interface
{
	@Override public void getnextcall(){
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	@Override public void sendcall()
	{
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
class least implements Interface
{
	@Override public void getnextcall()
	{
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다. ");
	}
	@Override public void sendcall()
	{
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}
}
class priority implements Interface
{
	@Override public void getnextcall()
	{
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	@Override public void sendcall()
	{
		System.out.println("업무능력도가 우수한 상담원에게 우선적으로 배분합니다.");
	}
}
public class learninterface {

	public static void main(String[] args) throws IOException{

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한 명씩 차례로 할당 ");
		System.out.println("L: 쉬고있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P: 우선순위가 높은 고객 먼저 할당 : ");
		
		int ch=System.in.read();
		
		Interface a1 = null;
		if(ch=='r'||ch=='R')
		{
			a1=new round();
		}
		else if(ch=='l'||ch=='L')
		{
			a1=new least();
		}
		else if(ch=='p'||ch=='P')
		{
			a1=new priority();
		}
		else
		{
			System.out.println("지원되지않는 기능입니다.");
			return;
		}
		a1.getnextcall();
		a1.sendcall();
	}

}

