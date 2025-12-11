package conditionalStatements;

public class ContinueWhileJumpStatements 
{
    public static void main(String[] args)
    {
        int number = 1;

        while (number <= 5)
        {
            if (number == 4)
            {
                System.out.println("Skipping number: " + number);
                number++; // Increment the number to avoid an infinite loop
                continue; // Skip the rest of the code in this iteration
            }
            System.out.println("Number: " + number);
            number++;
        }
    }
}