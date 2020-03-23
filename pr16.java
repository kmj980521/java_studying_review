package JAVA;
import java.util.ArrayList;
class animal
{
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
}
class human extends animal
{
	public void move()
	{
		System.out.println("사람이 움직입니다.");
	}
	public void readbook()
	{
		System.out.println("사람이 벤치에 앉아서 독서를 합니다.");
	}
}
class tiger extends animal{
	public void move()
	{
		System.out.println("호랑이가 위엄있게 걸어갑니다..");
	}
	public void eatmeat()
	{
		System.out.println("호랑이가 고기를 뜯어먹습니다.");
	}
}
class eagle extends animal{
	public void move()
	{
		System.out.println("독수리가 날아다닙니다..");
	}
	public void hunt()
	{
		System.out.println("매가 날아서 사냥을 합니다.");
	}
}
public class Instancof {
	ArrayList<animal> list =new ArrayList<animal>();
	public static void main(String[] args) { 
		Instancof aTest=new Instancof();
		aTest.addanimal();
		System.out.println("========원래 형으로 다운 캐스팅========");
		aTest.testcasting();
	}
	public void addanimal()
	{
		list.add(new human());
		list.add(new tiger());
		list.add(new eagle());
		
		for(animal i : list)
		{
			i.move();
		}
	}
	public void testcasting()
	{
		for(int i=0;i<list.size();i++)
		{
			animal a1=list.get(i); // 리스트 처음부터 자료를 뽑아와서 a1에 대입, 형변환이 될 수도 있음.
			if(a1 instanceof human)
			{
				human h=(human)a1;
				h.readbook();
			}
			else if(a1 instanceof tiger)
			{
				tiger h=(tiger)a1;
				h.eatmeat();
			}
			else if(a1 instanceof eagle)
			{
				eagle h=(eagle)a1;
				h.hunt();
			}
			else
			{
				System.out.println("유요하지않는 자료형입니다.");
			}
		}
	}
}

