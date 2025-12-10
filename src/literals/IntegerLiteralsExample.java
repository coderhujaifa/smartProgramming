package literals;

public class IntegerLiteralsExample
{
    public static void main(String[] args)
    {
        // Decimal Literal (Base 10): Regular whole numbers
        int decimal = 42;
        System.out.println("Decimal Literal: " + decimal); // Output: 42

        // Binary Literal (Base 2): Starts with 0b or 0B
        int binary = 0b1010; // Binary for decimal 10
        System.out.println("Binary Literal: " + binary); // Output: 10

        // Octal Literal (Base 8): Starts with 0
        int octal = 010; // Octal for decimal 8
        System.out.println("Octal Literal: " + octal); // Output: 8

        // Hexadecimal Literal (Base 16): Starts with 0x or 0X
        int hexadecimal = 0x1F; // Hexadecimal for decimal 31
        System.out.println("Hexadecimal Literal: " + hexadecimal); // Output: 31

        // Long Literal: Specified with L or l at the end
        long bigNum = 123456789L;
        System.out.println("Long Literal: " + bigNum); // Output: 123456789

        // Example of usage of all types together in calculations
        int sum = decimal + binary + octal + hexadecimal;
        System.out.println("Sum of all literals: " + sum); // Output: 91
    }
}