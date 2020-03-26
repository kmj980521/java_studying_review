package review5;
class test implements Myinterface //X와 Y인터페이스를 상속받은 Myinterface를 상속.
{
	public void x(){
		System.out.println("x()");
	}
	public void y() {
		System.out.println("y()");
	}
	public void myMethod()
	{
		System.out.println("myMethod()");
	}
}
public class Main {

	public static void main(String[] args) {
		
		test my = new test();
		X xclass = my;
		xclass.x();
		
		Y yclass = my;
		yclass.y();
		
		Myinterface i = my;
		i.x();
		i.y();
		i.myMethod();
	}

}

