package opps;

public class PolymorphismMethodOverridingCovariantReturnType {
	
	Object show ()
	{
		System.out.println("1");
		return null; 
	}
	
	public static void main(String[] args) {
		PolymorphismMethodOverridingCovariantReturnType x = new PolymorphismMethodOverridingCovariantReturnType();
		x.show();
		Overriding y = new Overriding();
		y.show();
	}
	
}

class Overriding extends PolymorphismMethodOverridingCovariantReturnType
{
	String show ()
	{
		System.out.println("2");
		return null;
	}
}
