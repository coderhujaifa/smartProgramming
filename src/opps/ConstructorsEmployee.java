package opps;

public class ConstructorsEmployee {
	
	int emp_id ;
	String name ;
	
	ConstructorsEmployee (String name, int emp_id)
	{
		this.emp_id = emp_id ;
		this.name = name ;
	}
	
	public static void main(String[] args) {
		ConstructorsEmployee emp1 = new ConstructorsEmployee("Rehan" , 101);
		ConstructorsEmployee emp2 = new ConstructorsEmployee("Ansari" , 102);
		
		System.out.println(emp1 + " " + emp2);
	}
}
