package smartprogramming;



public class Variables {
	int a = 10 ;
	static int b = 20;
	public static void main(String[] args) {
		Variables s = new Variables();
		System.out.println(s.a);
		System.out.println(s.b); 
		
		s.a = 1000;
		s.b = 2000;
		System.out.println(s.a);
		System.out.println(s.b);
		
		Variables s1 = new Variables();
		System.out.println(s1.a);
		System.out.println(s1.b);
    } 
}

