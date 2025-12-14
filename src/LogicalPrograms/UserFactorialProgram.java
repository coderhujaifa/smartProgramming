package LogicalPrograms;

import java.util.Scanner;

public class UserFactorialProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int no = scanner.nextInt();

        if (no < 0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else
        {
            long fact = 1;  // Variable to store the factorial result

            // Calculate factorial using a loop
            for (int i = 1; i <= no; i++)
            {
                fact = fact * i;
            }

            // Display the result
            System.out.println("Factorial of " + no + " is: " + fact);
        }

        // Close the scanner
        scanner.close();
    }
}
