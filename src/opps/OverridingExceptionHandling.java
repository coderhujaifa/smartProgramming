package opps;

public class OverridingExceptionHandling {
	
	void show () throws RuntimeException
	{
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		OverridingExceptionHandling x = new OverridingExceptionHandling();
		x.show();
		OverridingException y = new OverridingException();
		y.show();
	}
	
}

class OverridingException extends OverridingExceptionHandling
{
	void show () //throws RuntimeException
	{
		System.out.println("2");
		
	}
}
