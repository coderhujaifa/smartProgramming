package opps;

public class MethodOverridingSuperKeyword {
	
	void show () 
	{
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		SuperKeyword y = new SuperKeyword();
		y.show();
	}
	
}

class SuperKeyword extends MethodOverridingSuperKeyword
{
	void show ()
	{
		super.show();
		System.out.println("2");
		
	}
}
