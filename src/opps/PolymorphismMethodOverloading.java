package opps;

public class PolymorphismMethodOverloading {

	void show (int a)
	{
		System.out.println("1");
	}
	 
	void show (String a)
	{
		System.out.println("Rehan");
	}
	
	public static void main(String[] args) {
		PolymorphismMethodOverloading s = new PolymorphismMethodOverloading();
		s.show(10);
		s.show("Rehan");
	}
}
