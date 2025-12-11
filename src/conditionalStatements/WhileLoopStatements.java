package conditionalStatements;

public class WhileLoopStatements 
{
    public static void main(String[] args)
    {
        int no = 2; // Start from the smallest even number

        while (no <= 17)
        {
            System.out.println("Even Number: " + no);

            no = no + 2; // Skip directly to the next even number
        }
    }
}