package conditionalStatements;

public class ReturnJumpStatements 
{
    public static void main(String[] args)
    {
        System.out.println("Result: " + addNumbers(5, 3)); // Calling method
    }

    public static int addNumbers(int a, int b)
    {
        int sum = a + b;
        return sum; // Return the sum to the caller
    }
}