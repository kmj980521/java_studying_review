package review5;
class GenericPrinter<T>{ //나중에 클래스를 사용할 때 T위치에 실제 사용할 자료형을 지정
	private T material;
	public void setMaterial(T material) {
		this.material=material;
	}

	
	public T getMaterial()
	{
		return material;
	}
}
class Powder{
	public void doPrinting()
	{
		System.out.println("Powder 재료로 출력합니다");
	}
	public String toString()
	{
		return "재료는 Powder입니다";
	}
}
class Plastic
{
	public void doPrinting()
			{
				System.out.println("Plastic 재료로 출력합니다.");
			}
	public String toString()
	{
		return "재료는 Plastic입니다";
	}
}
public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException{ 
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
	}

}

