package conditionalStatements;

import java.util.Scanner;

public class DoWhileStatements 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Prompting user for a positive number
        do
        {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("You entered a valid positive number: " + number);
    }
}