package review5;
class Person{
	private String name;
	private int age;
	public Person() {}
	public Person(String name)
	{
		this.name=name;
	}
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}
public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException{ 
		
		Person person=new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3=Class.forName("review5.Person");
		System.out.println(pClass3.getName());
	}

}

