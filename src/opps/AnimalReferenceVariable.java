package opps;

public class AnimalReferenceVariable {
	
	String color;
	int age;
	
	public static void main(String[] args) {
		AnimalReferenceVariable dog = new AnimalReferenceVariable();
		dog.color = "red";
		dog.age = 10 ; 
		
		System.out.println(dog.color + " " + dog.age);
	}

}
