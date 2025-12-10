package literals;

public class NullLiteralExample
{
    public static void main(String[] args)
    {
        // Null Literal: Represents the absence of a value for an object reference
        String str = null; // Null literal assigned to a reference type

        // Checking if the object reference is null
        if (str == null)
        {
            System.out.println("The string is null, no value assigned.");
        }
        else
        {
            System.out.println("The string has a value: " + str);
        }
    }
}