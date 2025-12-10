package opps;

public class EmployeeParametrizedConstructors {
	
	int emp_id ;
	String name ;
	
	EmployeeParametrizedConstructors( int emp_id , String name )
	{
		this.emp_id = emp_id ;
		this.name = name ;
	}
	
	public static void main(String[] args) {
		EmployeeParametrizedConstructors e1 = new EmployeeParametrizedConstructors( 101 , "Rehan");
		EmployeeParametrizedConstructors e2 = new EmployeeParametrizedConstructors(102 , "Huzaifa ");
		
		System.out.println("Employee 1 : "+e1.emp_id+" "+ e1.name);
		System.out.println("Employee 2 : "+e2.emp_id+" "+ e2.name);
		
	}
	

}
