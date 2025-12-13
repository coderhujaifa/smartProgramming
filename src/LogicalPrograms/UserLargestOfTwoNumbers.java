package LogicalPrograms;

import java.util.Scanner;

public class UserLargestOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int no1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int no2 = scanner.nextInt();
        

        // Finding and displaying the largest number
        if (no1 > no2)
        {
            System.out.println("\nThe largest number is : " + no1);
        }
        else if (no2 > no1)
        {
            System.out.println("\nThe largest number is : " + no2);
        }
        else
        {
            System.out.println("\nBoth numbers are equal.");
        }

        scanner.close();
    }
}