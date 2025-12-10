package literals;

public class NumericLiteralsWithUnderscore
{
    public static void main(String[] args)
    {
        // Using underscores to improve readability in numeric literals
        int million = 1_000_000;    // Underscores to separate thousands
        double pi = 3.141_592_653;  // Underscores in a floating-point number

        // Printing the values
        System.out.println("Million: " + million);  // Output: 1000000
        System.out.println("Pi value: " + pi);      // Output: 3.141592653
    }
}
