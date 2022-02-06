package encapsulation;

public class Student {
	private String name;
	private int age;
	
	public void setter(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void getter()
	{
		System.out.println("Name of student :"+name);
		age=age+10;
		System.out.println("Age :"+age);
	}

}
