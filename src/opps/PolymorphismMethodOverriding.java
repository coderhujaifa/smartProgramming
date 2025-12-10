package opps;

public class PolymorphismMethodOverriding {
	
	void show ()
	{
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		PolymorphismMethodOverriding x = new PolymorphismMethodOverriding();
		x.show();
		MethodOverriding y = new MethodOverriding();
		y.show();
	}
}

class MethodOverriding extends PolymorphismMethodOverriding
{
	void show ()
	{
		System.out.println("2");
	}
}
