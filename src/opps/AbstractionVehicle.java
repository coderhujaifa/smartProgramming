package opps;

public abstract class AbstractionVehicle {
	
	abstract void start();
	
	public static void main(String[] args) {
		Car c = new Car ();
		c.start();
		
		Bike b = new Bike ();
		b.start();
	}

}
class Car extends  AbstractionVehicle
{
	void start () 
	{
		System.out.println("car starts with key");
	}
}
class Bike extends  AbstractionVehicle
{
	void start () 
	{
		System.out.println("Bike starts with self start button");
	}
}
