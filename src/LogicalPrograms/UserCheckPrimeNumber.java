package LogicalPrograms;

import java.util.Scanner;

public class UserCheckPrimeNumber
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = s.nextInt();

        // Combined check for 0 and 1
        if (num <= 1)
        {
            System.out.println(num + " is not a prime number.");
            return; // Exit early for 0 and 1
        }

        boolean isPrime = true;

        for (int i=2; i < num/2; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}