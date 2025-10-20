package opps;

public class MethodOverloadingVarargs {
	
	void show (int a) 
	{
		System.out.println("int Method");
	}
	
	void show (int...a)
	{
		System.out.println("Varargs Method");
	}
	
	public static void main(String[] args) {
		MethodOverloadingVarargs s = new MethodOverloadingVarargs();
		s.show();
	}
}
