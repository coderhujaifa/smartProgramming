package opps;

public class MethodOverloadingMain {
	
	public static void main(String[] args) {
		System.out.println("1");
		MethodOverloadingMain s = new MethodOverloadingMain();
		s.main(10);
	}
	
	public static void main(int a) {
		System.out.println("2");
	}
}
