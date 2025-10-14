package opps;

public class MultilevelInheritance {
    void showMultilevelInheritance() {
        System.out.println("A class method");
    } 

    public static void main(String[] args) {
        MultilevelInheritance s1 = new MultilevelInheritance();
        s1.showMultilevelInheritance();
        
        B s2 = new B();
        s2.showMultilevelInheritance();
        s2.showB();
        
        C s3 = new C(); 	 	
        s3.showMultilevelInheritance();
        s3.showB();
        s3.showC(); 
    }
}
 
class B extends MultilevelInheritance {
    void showB() {
        System.out.println("B class method");
    }
}

class C extends B {
    void showC() {
        System.out.println("C class method");
    }
}
