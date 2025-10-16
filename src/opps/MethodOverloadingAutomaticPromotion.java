package opps;

public class MethodOverloadingAutomaticPromotion {
	
	void show (int a)
	{
		System.out.println("In Method");
	}
	
	void show (String a)
	
	{
		System.out.println("String Method");
	}
	
	public static void main(String[] args) {
		MethodOverloadingAutomaticPromotion s = new MethodOverloadingAutomaticPromotion();
		s.show('a');
	}

}
