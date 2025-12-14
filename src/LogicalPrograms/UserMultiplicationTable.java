package LogicalPrograms;

import java.util.Scanner;

public class UserMultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int no = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + no + ":");

        // Loop from 1 to 10 to generate the table
        for (int i = 1; i <= 10; i++)
        {
            int result = no * i;
            System.out.println(no + " x " + i + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}