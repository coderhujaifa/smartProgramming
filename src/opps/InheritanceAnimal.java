package opps;

public class InheritanceAnimal {
	void eat ()
	{
		System.out.println("I am eating");
	}
	
	public static void main(String[] args) {
		dog s = new dog();
		s.eat();
	}
}
class dog extends InheritanceAnimal{	
}
