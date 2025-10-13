package smartprogramming;



public class Variables {
	int a = 10 ; //Instance Variables
	static int b = 20; //static Variables
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

