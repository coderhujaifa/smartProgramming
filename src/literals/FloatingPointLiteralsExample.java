package literals;

public class FloatingPointLiteralsExample
{
    public static void main(String[] args)
    {
        // Float Literal: Ends with F or f
        float pi = 3.14F; // The 'F' indicates it's a float literal
        System.out.println("Float Literal (pi): " + pi); // Output: 3.14

        // Double Literal: Default type for decimal numbers
        double e = 2.718; // By default, this is considered a double
        System.out.println("Double Literal (e): " + e); // Output: 2.718

        // Scientific Notation: Large number in scientific format
        double largeNum = 1.23e4; // Equivalent to 1.23 * 10^4 = 12300
        System.out.println("Scientific Notation (largeNum): " + largeNum); // Output: 12300.0

        // Another example of scientific notation: Very small number
        double smallNum = 4.56e-3; // Equivalent to 4.56 * 10^-3 = 0.00456
        System.out.println("Scientific Notation (smallNum): " + smallNum); // Output: 0.00456

        // Demonstrating precision with double
        double preciseNum = 3.14159265359; // Double can hold many decimal places
        System.out.println("Double with precision (preciseNum): " + preciseNum); // Output: 3.14159265359
    }
}