package literals;

public class BooleanLiteralsExample
{
    public static void main(String[] args)
    {
        // Boolean Literals: Represent either true or false
        boolean isJavaFun = true; // The value of isJavaFun is true
        boolean isHot = false;    // The value of isHot is false

        // Printing the Boolean literals
        System.out.println("Is Java Fun? " + isJavaFun); // Output: true
        System.out.println("Is it Hot? " + isHot);       // Output: false

        // Using Boolean literals in a conditional expression (if-else)
        if (isJavaFun) {
            System.out.println("Java is fun!");  // This will print as isJavaFun is true
        } else {
            System.out.println("Java is not fun!");
        }

        // Using Boolean literals for control flow (example with boolean flags)
        if (!isHot) {
            System.out.println("It is not hot today!");  // This will print as isHot is false
        } else {
            System.out.println("It is hot today!");
        }
    }
}
