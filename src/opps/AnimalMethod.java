package opps;

public class AnimalMethod {
	String color;
	int age;
	
	void initObj(String a , int b) 
	{
		color = a;
		age = b;
	}
	void display ()
	{
		System.out.println(color + " " + age);
	}
	
	public static void main(String[] args) {
		AnimalMethod dog = new AnimalMethod();
		dog.initObj("black", 10);
		dog.display();
	}
}
