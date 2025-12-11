package conditionalStatements;

public class ContinueJumpStatements 
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            if (i == 4)
            {
                System.out.println("Skipping number: " + i);
                continue; // Skip the rest of the code in this iteration
            }
            System.out.println("Number: " + i);
        }
    }
}