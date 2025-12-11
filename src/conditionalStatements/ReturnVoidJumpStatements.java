package conditionalStatements;

public class ReturnVoidJumpStatements 
{
    public static void main(String[] args)
    {
        checkAge(20); // Testing with an age less than 18
        // checkAge(20); // Testing with an age greater than or equal to 18
        System.out.println("Voting Ended.");
    }

    public static void checkAge(int age)
    {
        if (age < 18)
        {
            return; // Exits the method early if age is less than 18
        }
        System.out.println("You can vote");
    }
}