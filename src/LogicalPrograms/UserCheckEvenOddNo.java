package LogicalPrograms;

import java.util.Scanner;

public class UserCheckEvenOddNo
{
    public static void main(String[] args)
    {
        // Import Scanner Class to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using conditional logic
        if(number % 2 == 0)
        {
            System.out.println(number + " is an even number.");
        }
        else
        {
            System.out.println(number + " is an odd number.");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
