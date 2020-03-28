package Q5;

public class Student {
	String name;
	String id;
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override public int hashCode()
	{
		return  Integer.parseInt(id);
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student ex=(Student)obj;
			if(this.id==ex.id)
			{
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
		return id + ":"+name;
	}
}

