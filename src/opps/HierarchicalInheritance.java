package opps;

public class HierarchicalInheritance {
	void showHierarchicalInheritance() {
        System.out.println("A class method");
    } 

    public static void main(String[] args) {
    	HierarchicalInheritance s1 = new HierarchicalInheritance();
        s1.showHierarchicalInheritance();
        
        BA s2 = new BA();
        s2.showHierarchicalInheritance();
        s2.showBA(); 
        
        CA s3 = new CA(); 	 	
        s3.showHierarchicalInheritance();
//        s3.showHierarchicalInheritance(); 
        s3.showCA(); 
    } 
}
 
class BA extends HierarchicalInheritance {
    void showBA() {
        System.out.println("B class method");
    }
}

class CA extends HierarchicalInheritance {
    void showCA() {
        System.out.println("C class method");
    }
}
