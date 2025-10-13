package opps;

public class Animal {
	
	public void eat()
	{
		System.out.println("I am eating");
	}
	
	public static void main(String[] args) {
		
		Animal dog = new Animal(); //Create Object
		dog.eat();
		dog.run();
		
		Birds sp = new Birds();
		sp.fly();
		
	}

	public void run()
	{
		System.out.println("I am runing");
	}
}	
	class Birds
	{	
		void fly ()
		{
			System.out.println("I am flying");
		}
	}
