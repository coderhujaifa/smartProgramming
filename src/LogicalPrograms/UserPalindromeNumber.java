//WAP to check whether a number is Palindrome in Java
//Below is the program by taking user input
package LogicalPrograms;

import java.util.Scanner;

public class UserPalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = Scanner.nextInt();  // Number to check for palindrome
        int originalNumber = no;
        int reversedNumber = 0;

        while (no != 0)
        {
            int digit = no % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Build the reversed number
            no = no / 10;  // Remove the last digit
        }

        // Check if the original number and reversed number are the same
        if (originalNumber == reversedNumber)
        {
            System.out.println(originalNumber + " is a Palindrome number.");
        }
        else
        {
            System.out.println(originalNumber + " is not a Palindrome number.");
        }
    }
}
