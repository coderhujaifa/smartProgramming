package opps;

public class SingleInheritance {
	void showSingleInheritance ()
	{
		System.out.println("A class method");
	} 
	
	public static void main(String[] args) {
		SingleInheritance s1 = new SingleInheritance ();
		s1.showSingleInheritance(); 
		
		Ba s2 = new Ba ();
		s2.showSingleInheritance();
		s2.showB();
	}
	

}
class Ba  extends SingleInheritance {
	
	void showB()
	{
	
	System.out.println("B class method");
	
	}
}
