package LogicalPrograms;

import java.util.Scanner;

public class UserCheckLeapYear
{
    public static void main(String[] args)
    {
        // Import Scanner Class to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year using conditional logic
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
