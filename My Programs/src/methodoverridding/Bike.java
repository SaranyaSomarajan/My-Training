package methodoverridding;

public class Bike extends Vehicle {
	public void display()
	{
		//super.display();
		System.out.println("Bike is ridding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike ob=new Bike();
		ob.display();

	}

}
