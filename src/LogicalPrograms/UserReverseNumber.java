package LogicalPrograms;

import java.util.Scanner;

public class UserReverseNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        // Reverse the number using a while loop
        while (number != 0)
        {
            int remainder = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + remainder;  // Build the reversed number
            number = number / 10;  // Remove the last digit
        }

        // Display the reversed number
        System.out.println("Reversed Number: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }
}
