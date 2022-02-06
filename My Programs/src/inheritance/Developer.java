package inheritance;

public class Developer  extends Employee{
	int bonus=10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer obj=new Developer();
		System.out.println("Salary :"+obj.salary);
System.out.println("bonus :"+obj.bonus);
	}

}
