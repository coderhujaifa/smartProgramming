package conditionalStatements;

public class BreakJumpStatements 
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            if (i == 10)
            {
                System.out.println("Loop stopped at: " + i);
                break; // Exit the loop when i equals 5
            }
            System.out.println("Number: " + i);
        }
    }
}
